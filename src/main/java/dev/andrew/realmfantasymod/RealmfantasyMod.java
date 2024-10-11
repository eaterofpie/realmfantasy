package dev.andrew.realmfantasymod;

import dev.andrew.realmfantasymod.init.BlockInit;
import dev.andrew.realmfantasymod.init.ItemGroupInit;
import dev.andrew.realmfantasymod.init.ItemInit;
import dev.andrew.realmfantasymod.world.BiomeModificationIni;
import dev.andrew.realmfantasymod.world.biome.BiomeTagProviderInit;
import dev.andrew.realmfantasymod.world.biome.BiomesInit;
import dev.andrew.realmfantasymod.world.biome.OverworldRegionInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealmfantasyMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("RealmfantasyMod");
	public static final String MOD_ID = "realmfantasymod";
	@Override
	public void onInitialize() {
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		BiomesInit.load();
		BiomeModificationIni.load();
		BiomeTagProviderInit.load();


		LOGGER.info("Fantasy!");
	}
	public static Identifier id (String path) {
		return Identifier.of(MOD_ID, path);
	}
}