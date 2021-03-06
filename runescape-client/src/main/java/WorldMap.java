import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("a")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lls;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("c")
	@Export("details")
	HashMap details;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	WorldMapArea field3995;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -611163949
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1065399067
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -681769299
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1693054595
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("e")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("ab")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1569686885
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 358605679
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2122847541
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2116246555
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 52853051
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1639517063
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("au")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("aa")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1602251249
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1930209769
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2046405399
	)
	int field4037;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1792714989
	)
	int field4015;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 517874941
	)
	int field4034;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -86397235
	)
	int field4017;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 599475952816375777L
	)
	long field4018;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1972713683
	)
	int field4028;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1655893285
	)
	int field4035;
	@ObfuscatedName("ad")
	boolean field4021;
	@ObfuscatedName("aj")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("aw")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("af")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("ak")
	HashSet field4025;
	@ObfuscatedName("ac")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1876166455
	)
	int field4027;
	@ObfuscatedName("bz")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bj")
	List field4029;
	@ObfuscatedName("bh")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bi")
	HashSet field4007;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("br")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("sprite")
	Sprite sprite;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1176520287
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 627351645
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 357245399
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -486020465
	)
	int field4038;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11; // L: 46
		fontNameVerdana13 = FontName.FontName_verdana13; // L: 47
		fontNameVerdana15 = FontName.FontName_verdana15; // L: 48
	}

	public WorldMap() {
		this.worldMapTargetX = -1; // L: 60
		this.worldMapTargetY = -1; // L: 61
		this.worldMapDisplayWidth = -1; // L: 64
		this.worldMapDisplayHeight = -1; // L: 65
		this.worldMapDisplayX = -1; // L: 66
		this.worldMapDisplayY = -1; // L: 67
		this.maxFlashCount = 3; // L: 68
		this.cyclesPerFlash = 50; // L: 69
		this.perpetualFlash = false; // L: 70
		this.flashingElements = null; // L: 71
		this.flashCount = -1; // L: 72
		this.flashCycle = -1; // L: 73
		this.field4037 = -1; // L: 74
		this.field4015 = -1; // L: 75
		this.field4034 = -1; // L: 76
		this.field4017 = -1; // L: 77
		this.field4021 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4025 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field4027 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field4007 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4038 = -1; // L: 101
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;Lic;Lkr;Ljava/util/HashMap;[Lls;I)V",
		garbageValue = "-926248913"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6; // L: 105
		this.WorldMap_archive = var1; // L: 106
		this.WorldMap_geographyArchive = var2; // L: 107
		this.WorldMap_groundArchive = var3; // L: 108
		this.font = var4; // L: 109
		this.fonts = new HashMap(); // L: 110
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11)); // L: 111
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13)); // L: 112
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15)); // L: 113
		this.cacheLoader = new WorldMapArchiveLoader(var1); // L: 114
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field322.name); // L: 115
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 116
		this.details = new HashMap(var8.length); // L: 117

		for (int var9 = 0; var9 < var8.length; ++var9) { // L: 118
			Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9])); // L: 119
			WorldMapArea var11 = new WorldMapArea(); // L: 120
			var11.read(var10, var8[var9]); // L: 121
			this.details.put(var11.getInternalName(), var11); // L: 122
			if (var11.getIsMain()) { // L: 123
				this.mainMapArea = var11; // L: 124
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 127
		this.field3995 = null; // L: 128
	} // L: 129

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "680469506"
	)
	public void method6428() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 133
	} // L: 135

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-1994141756"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 138
			this.smoothZoom(); // L: 141
			this.scrollToTarget(); // L: 142
			if (var3) { // L: 143
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 146
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 147
				List var10 = this.worldMapManager.method721(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 148
				HashSet var11 = new HashSet(); // L: 149

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); Script.runScriptEvent(var14)) { // L: 150 163
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 151
					var11.add(var13); // L: 153
					var14 = new ScriptEvent(); // L: 154
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 155
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 156
					if (this.field4007.contains(var13)) { // L: 157
						var14.setType(17); // L: 158
					} else {
						var14.setType(15); // L: 161
					}
				}

				var12 = this.field4007.iterator(); // L: 166

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 167
					if (!var11.contains(var13)) { // L: 169
						var14 = new ScriptEvent(); // L: 170
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 171
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 172
						var14.setType(16); // L: 173
						Script.runScriptEvent(var14); // L: 174
					}
				}

				this.field4007 = var11; // L: 178
			}
		}
	} // L: 139 144 179

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "81"
	)
	public void method6430(int var1, int var2, boolean var3, boolean var4) {
		long var5 = PacketWriter.currentTimeMillis(); // L: 182
		this.method6431(var1, var2, var4, var5); // L: 183
		if (this.hasTarget() || !var4 && !var3) { // L: 184
			this.method6439(); // L: 198
		} else {
			if (var4) { // L: 185
				this.field4034 = var1; // L: 186
				this.field4017 = var2; // L: 187
				this.field4037 = this.centerTileX; // L: 188
				this.field4015 = this.centerTileY; // L: 189
			}

			if (this.field4037 != -1) { // L: 191
				int var7 = var1 - this.field4034; // L: 192
				int var8 = var2 - this.field4017; // L: 193
				this.setWorldMapPosition(this.field4037 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4015, false); // L: 194
			}
		}

		if (var4) { // L: 200
			this.field4018 = var5; // L: 201
			this.field4028 = var1; // L: 202
			this.field4035 = var2; // L: 203
		}

	} // L: 205

	@ObfuscatedName("i")
	void method6431(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 208
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 209
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 210
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 211
			if (this.mouseCoord != null && var3) { // L: 212
				if (JagexCache.method3576() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 213
					class92.method2143(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 214
				} else {
					boolean var8 = true; // L: 217
					if (this.field4021) { // L: 218
						int var9 = var1 - this.field4028; // L: 219
						int var10 = var2 - this.field4035; // L: 220
						if (var4 - this.field4018 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) { // L: 221
							var8 = false; // L: 222
						}
					}

					if (var8) { // L: 225
						PacketBufferNode var11 = Client.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher); // L: 226
						var11.packetBuffer.writeInt(this.mouseCoord.packed()); // L: 227
						Client.packetWriter.addNode(var11); // L: 228
						this.field4018 = 0L; // L: 229
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 234
		}

	} // L: 235

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1666598951"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (ModelData0.field1901 != null) { // L: 238
			this.zoom = this.zoomTarget; // L: 239
		} else {
			if (this.zoom < this.zoomTarget) { // L: 242
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 243
			}

			if (this.zoom > this.zoomTarget) { // L: 245
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 246
			}

		}
	} // L: 240 248

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 251
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 254
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 255
			if (var1 != 0) { // L: 256
				var1 /= Math.min(8, Math.abs(var1)); // L: 257
			}

			if (var2 != 0) { // L: 259
				var2 /= Math.min(8, Math.abs(var2)); // L: 260
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 262
			if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) { // L: 263
				this.worldMapTargetX = -1; // L: 264
				this.worldMapTargetY = -1; // L: 265
			}

		}
	} // L: 252 267

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1721878015"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 270
		this.centerTileY = var2; // L: 271
		PacketWriter.currentTimeMillis(); // L: 272
		if (var3) {
			this.method6439(); // L: 273
		}

	} // L: 274

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	final void method6439() {
		this.field4017 = -1; // L: 277
		this.field4034 = -1; // L: 278
		this.field4015 = -1; // L: 279
		this.field4037 = -1; // L: 280
	} // L: 281

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2112762378"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 284
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lar;",
		garbageValue = "-8"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 288

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 296
			}

			var5 = (WorldMapArea)var4.next(); // L: 289
		} while(!var5.containsCoord(var1, var2, var3)); // L: 291

		return var5; // L: 292
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1089137052"
	)
	public void method6482(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 300
		if (var5 == null) { // L: 301
			if (!var4) { // L: 302
				return; // L: 305
			}

			var5 = this.mainMapArea; // L: 303
		}

		boolean var6 = false; // L: 307
		if (var5 != this.field3995 || var4) { // L: 308
			this.field3995 = var5; // L: 309
			this.setCurrentMapArea(var5); // L: 310
			var6 = true; // L: 311
		}

		if (var6 || var4) { // L: 313
			this.jump(var1, var2, var3); // L: 314
		}

	} // L: 316

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-5"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 319
		if (var2 != null) { // L: 320
			this.setCurrentMapArea(var2); // L: 321
		}

	} // L: 323

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "84"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 326 327 329
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lar;",
		garbageValue = "-64"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 333
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lar;I)V",
		garbageValue = "65867668"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 337
			this.initializeWorldMapManager(var1); // L: 340
			this.jump(-1, -1, -1); // L: 341
		}
	} // L: 338 342

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lar;I)V",
		garbageValue = "-1701354489"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 345
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 346
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 347
	} // L: 348

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lar;Lhg;Lhg;ZB)V",
		garbageValue = "65"
	)
	public void method6549(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 351
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 354
				this.initializeWorldMapManager(var1); // L: 355
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 357
				this.jump(var2.plane, var2.x, var2.y); // L: 361
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 358
			}

		}
	} // L: 352 363

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-6"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 366
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 369
			if (var4 == null) { // L: 370
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 371
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 373
			this.worldMapTargetX = -1; // L: 374
			this.worldMapTargetY = -1; // L: 375
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 376
			this.zoomTarget = this.zoom; // L: 377
			this.field4029 = null; // L: 378
			this.iconIterator = null; // L: 379
			this.worldMapManager.clearIcons(); // L: 380
		}
	} // L: 367 381

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1145142542"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 384
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 385
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 386
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 387
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 388
		if (var7 < 100) { // L: 389
			this.drawLoading(var1, var2, var3, var4, var7); // L: 390
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 393
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 394
				if (!this.worldMapManager.isLoaded()) { // L: 395
					return; // L: 396
				}
			}

			if (this.flashingElements != null) { // L: 399
				++this.flashCycle; // L: 400
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 401
					this.flashCycle = 0; // L: 402
					++this.flashCount; // L: 403
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 405
					this.flashingElements = null; // L: 406
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 409
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 410
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 411
			if (!this.elementsDisabled) { // L: 412
				boolean var10 = false; // L: 413
				if (var5 - this.field4027 > 100) { // L: 414
					this.field4027 = var5; // L: 415
					var10 = true; // L: 416
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4025, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 418
			}

			this.method6448(var1, var2, var3, var4, var8, var9); // L: 420
			if (JagexCache.method3576() && this.showCoord && this.mouseCoord != null) { // L: 421
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 422
			this.worldMapDisplayHeight = var9; // L: 423
			this.worldMapDisplayX = var1; // L: 424
			this.worldMapDisplayY = var2; // L: 425
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 426
		}
	} // L: 391 427

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-1751443053"
	)
	boolean method6447(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 430
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 431
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 432
				return true;
			} else if (this.field4038 != Client.field946) { // L: 433
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 434
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 435
			} else {
				return true; // L: 436
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1983443961"
	)
	void method6448(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ModelData0.field1901 != null) { // L: 440
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 441
			int var8 = var3 + 512; // L: 442
			int var9 = var4 + 512; // L: 443
			float var10 = 1.0F; // L: 444
			var8 = (int)((float)var8 / var10); // L: 445
			var9 = (int)((float)var9 / var10); // L: 446
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 447
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 448
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 449
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 450
			if (this.method6447(var8, var9, var13, var14, var3, var4)) { // L: 451
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 452
					Arrays.fill(this.sprite.pixels, 0); // L: 455
				} else {
					this.sprite = new Sprite(var8, var9); // L: 453
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 456
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 457
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 458
				ModelData0.field1901.method4410(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 459
				this.field4038 = Client.field946; // L: 460
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 461
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 462
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 464
			if (var10 == 1.0F) { // L: 465
				this.sprite.method6260(var13, var14, 192); // L: 466
			} else {
				this.sprite.method6278(var13, var14, (int)(var10 * (float)var8), (int)((float)var9 * var10), 192); // L: 469
			}
		}

	} // L: 472

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-31"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 475
			if (!this.worldMapManager.isLoaded()) { // L: 478
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 479
				if (!this.worldMapManager.isLoaded()) { // L: 480
					return; // L: 481
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 484
		}
	} // L: 476 485

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1877509796"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 488
	} // L: 489

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1108867958"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 492
		int var7 = var3 / 2 + var1; // L: 493
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 494
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 495
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 496
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 497
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1); // L: 498
	} // L: 499

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "55"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 502
			return 1.0F;
		} else if (var1 == 37) { // L: 503
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F; // L: 504
		} else if (var1 == 75) { // L: 505
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 506 507
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1167531031"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) { // L: 511
			return 25;
		} else if (1.5D == (double)this.zoomTarget) { // L: 512
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 513
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 514
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200; // L: 515 516
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1132818911"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 520
	} // L: 521

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-683321726"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 524
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lar;",
		garbageValue = "-1578034984"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 528

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 536
			}

			var3 = (WorldMapArea)var2.next(); // L: 529
		} while(var3.getId() != var1); // L: 531

		return var3; // L: 532
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1263582707"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 540
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 543
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 544
		}
	} // L: 541 545

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-39"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 548
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 551
			this.worldMapTargetX = -1; // L: 552
			this.worldMapTargetY = -1; // L: 553
		}
	} // L: 549 554

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1993790921"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 557
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 560
			if (var4 != null) { // L: 561
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 562
			}

		}
	} // L: 558 564

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-367968117"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 567
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 570
			if (var4 != null) { // L: 571
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 572
			}

		}
	} // L: 568 574

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1157589126"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 577 578 580
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "423694608"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 584 585 587
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lhg;",
		garbageValue = "1327996030"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 591 592 594
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1261786031"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 598
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2040090881"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 602
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-83"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 606
			this.maxFlashCount = var1; // L: 607
		}

	} // L: 609

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 612
	} // L: 613

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "147371535"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 616
			this.cyclesPerFlash = var1; // L: 617
		}

	} // L: 619

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "561976387"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 622
	} // L: 623

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "36"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 626
	} // L: 627

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 630
		this.flashingElements.add(var1); // L: 631
		this.flashCount = 0; // L: 632
		this.flashCycle = 0; // L: 633
	} // L: 634

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 637
		this.flashCount = 0; // L: 638
		this.flashCycle = 0; // L: 639

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 640
			if (WorldMapSection0.WorldMapElement_get(var2) != null && WorldMapSection0.WorldMapElement_get(var2).category == var1) { // L: 641 644
				this.flashingElements.add(WorldMapSection0.WorldMapElement_get(var2).objectId); // L: 645
			}
		}

	} // L: 648

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "578188764"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 651
	} // L: 652

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-805542752"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 655
	} // L: 656

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IZS)V",
		garbageValue = "5539"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 659
			this.enabledElements.add(var1); // L: 660
		} else {
			this.enabledElements.remove(var1); // L: 663
		}

		this.method6480(); // L: 665
	} // L: 666

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IZS)V",
		garbageValue = "3311"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 669
			this.enabledCategories.add(var1); // L: 670
		} else {
			this.enabledCategories.remove(var1); // L: 673
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 675
			if (WorldMapSection0.WorldMapElement_get(var3) != null && WorldMapSection0.WorldMapElement_get(var3).category == var1) { // L: 676 679
				int var4 = WorldMapSection0.WorldMapElement_get(var3).objectId; // L: 680
				if (!var2) { // L: 681
					this.enabledElementIds.add(var4); // L: 682
				} else {
					this.enabledElementIds.remove(var4); // L: 685
				}
			}
		}

		this.method6480(); // L: 689
	} // L: 690

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1921316185"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 693
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1781251597"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 697
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1674259718"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 701
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1574604658"
	)
	void method6480() {
		this.field4025.clear(); // L: 705
		this.field4025.addAll(this.enabledElements); // L: 706
		this.field4025.addAll(this.enabledElementIds); // L: 707
	} // L: 708

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "49"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 711
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 714
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 715
			List var9 = this.worldMapManager.method721(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 716
			if (!var9.isEmpty()) { // L: 717
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 720
						return; // L: 736
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 721
					WorldMapElement var12 = WorldMapSection0.WorldMapElement_get(var11.getElement()); // L: 723
					var13 = false; // L: 724

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 725
						if (var12.menuActions[var14] != null) { // L: 726
							StructDefinition.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 727
							var13 = true; // L: 728
						}
					}
				} while(!var13); // L: 731

			}
		}
	} // L: 712 718 732

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILhg;S)Lhg;",
		garbageValue = "11767"
	)
	public Coord method6507(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 739
			return null; // L: 740
		} else if (!this.worldMapManager.isLoaded()) { // L: 742
			return null; // L: 743
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 745
			return null; // L: 746
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 748
			List var4 = (List)var3.get(var1); // L: 749
			if (var4 != null && !var4.isEmpty()) { // L: 750
				AbstractWorldMapIcon var5 = null; // L: 753
				int var6 = -1; // L: 754
				Iterator var7 = var4.iterator(); // L: 755

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 770
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 756
						int var9 = var8.coord2.x - var2.x; // L: 758
						int var10 = var8.coord2.y - var2.y; // L: 759
						var11 = var10 * var10 + var9 * var9; // L: 760
						if (var11 == 0) { // L: 761
							return var8.coord2; // L: 762
						}
					} while(var11 >= var6 && var5 != null); // L: 764

					var5 = var8; // L: 765
					var6 = var11; // L: 766
				}
			} else {
				return null; // L: 751
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IILhg;Lhg;I)V",
		garbageValue = "-2008216886"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 774
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 775
		var5.setArgs(new Object[]{var6}); // L: 776
		switch(var1) { // L: 777
		case 1008:
			var5.setType(10); // L: 780
			break;
		case 1009:
			var5.setType(11); // L: 790
			break; // L: 791
		case 1010:
			var5.setType(12); // L: 800
			break;
		case 1011:
			var5.setType(13); // L: 795
			break; // L: 796
		case 1012:
			var5.setType(14); // L: 785
		}

		Script.runScriptEvent(var5); // L: 804
	} // L: 805

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Laz;",
		garbageValue = "-710181196"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 808
			return null; // L: 809
		} else if (!this.worldMapManager.isLoaded()) { // L: 811
			return null; // L: 812
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 814
			this.field4029 = new LinkedList(); // L: 815
			Iterator var2 = var1.values().iterator(); // L: 816

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 817
				this.field4029.addAll(var3); // L: 819
			}

			this.iconIterator = this.field4029.iterator(); // L: 822
			return this.iconNext(); // L: 823
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)Laz;",
		garbageValue = "-2586"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 827
			return null; // L: 828
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 830
					return null; // L: 836
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 831
			} while(var1.getElement() == -1); // L: 832

			return var1; // L: 833
		}
	}
}
