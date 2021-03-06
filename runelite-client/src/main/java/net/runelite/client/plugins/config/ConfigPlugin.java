/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.config;

import com.github.zafarkhaja.semver.Version;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.swing.SwingUtilities;
import net.runelite.api.MenuOpcode;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.config.ChatColorConfig;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.LauncherConfig;
import net.runelite.client.config.OpenOSRSConfig;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.OverlayMenuClicked;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayMenuEntry;
import net.runelite.client.util.ImageUtil;

@PluginDescriptor(
	name = "Configuration",
	loadWhenOutdated = true,
	hidden = true // prevent users from disabling
)
public class ConfigPlugin extends Plugin
{
	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private Provider<PluginListPanel> pluginListPanelProvider;

	@Inject
	private ConfigManager configManager;

	@Inject
	private RuneLiteConfig runeLiteConfig;

	@Inject
	private OpenOSRSConfig openOSRSConfig;

	@Inject
	private ChatColorConfig chatColorConfig;

	@Inject
	private LauncherConfig launcherConfig;

	private PluginListPanel pluginListPanel;

	private NavigationButton navButton;

	@Override
	protected void startUp() throws Exception
	{
		pluginListPanel = pluginListPanelProvider.get();
		pluginListPanel.addFakePlugin(
			new PluginConfigurationDescriptor(
				"OpenOSRS", "OpenOSRS client settings", PluginType.SYSTEM,
				new String[]{"sorting", "external", "logs", "categories", "colors", "opacity", "pin"},
				null, openOSRSConfig, configManager.getConfigDescriptor(openOSRSConfig)
			),
			new PluginConfigurationDescriptor(
				"RuneLite", "RuneLite client settings", PluginType.SYSTEM,
				new String[]{"client", "notification", "size", "position", "window", "chrome", "focus", "font", "overlay", "tooltip", "infobox"},
				null, runeLiteConfig, configManager.getConfigDescriptor(runeLiteConfig)
			),
			new PluginConfigurationDescriptor(
				"Chat Color", "Recolor chat text", PluginType.MISCELLANEOUS, new String[]{"colour", "messages"},
				null, chatColorConfig, configManager.getConfigDescriptor(chatColorConfig)
			));

		// Support for this has been added in launcher version 2.2.0
		if (launcherVersion("2.2.0"))
		{
			pluginListPanel.addFakePlugin(
				new PluginConfigurationDescriptor(
					"Launcher", "Launcher settings", PluginType.SYSTEM,
					new String[]{"hw", "nightly", "stable", "proxy", "bootstrap"},
					null, launcherConfig, configManager.getConfigDescriptor(launcherConfig)
				));
		}

		pluginListPanel.rebuildPluginList();

		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(getClass(), "config_icon.png");

		navButton = NavigationButton.builder()
			.tooltip("Configuration")
			.icon(icon)
			.priority(0)
			.panel(pluginListPanel.getMuxer())
			.build();

		clientToolbar.addNavigation(navButton);
	}

	@Override
	protected void shutDown() throws Exception
	{
		clientToolbar.removeNavigation(navButton);
	}

	@Subscribe
	public void onOverlayMenuClicked(OverlayMenuClicked overlayMenuClicked)
	{
		OverlayMenuEntry overlayMenuEntry = overlayMenuClicked.getEntry();
		if (overlayMenuEntry.getMenuOpcode() == MenuOpcode.RUNELITE_OVERLAY_CONFIG)
		{
			Overlay overlay = overlayMenuClicked.getOverlay();
			Plugin plugin = overlay.getPlugin();
			if (plugin == null)
			{
				return;
			}

			// Expand config panel for plugin
			SwingUtilities.invokeLater(() ->
			{
				if (!navButton.isSelected())
				{
					navButton.getOnSelect().run();
				}
				pluginListPanel.openConfigurationPanel(plugin.getName());
			});
		}
	}

	private boolean launcherVersion(String version)
	{
		String launcherVersion = RuneLiteProperties.getLauncherVersion();

		if (launcherVersion == null)
		{
			return false;
		}

		return Version.valueOf(launcherVersion).greaterThanOrEqualTo(Version.valueOf(version));
	}
}
