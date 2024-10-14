package dev.andrew.realmfantasymod;

import dev.andrew.realmfantasymod.init.BlockInit;
import dev.andrew.realmfantasymod.init.ItemGroupInit;
import dev.andrew.realmfantasymod.init.ItemInit;
import dev.andrew.realmfantasymod.sound.SoundsInit;
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
		SoundsInit.load();


		LOGGER.info("Fantasy!");
	}

	public static Identifier id (String path) {
		return Identifier.of(MOD_ID, path);
	}
}