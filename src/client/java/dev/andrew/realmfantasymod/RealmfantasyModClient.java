package dev.andrew.realmfantasymod;

import dev.andrew.realmfantasymod.init.BlockInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class RealmfantasyModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BlockInit.MITHRIL_SAPLING);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),BlockInit.SILVER_SAPLING);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),BlockInit.IRONWOOD_SAPLING);
	}
}