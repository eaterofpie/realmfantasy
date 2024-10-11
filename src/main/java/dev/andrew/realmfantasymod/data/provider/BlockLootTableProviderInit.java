package dev.andrew.realmfantasymod.data.provider;

import dev.andrew.realmfantasymod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BlockLootTableProviderInit extends FabricBlockLootTableProvider {
    public BlockLootTableProviderInit(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    @Override
    public void generate() {
        addDrop(BlockInit.MITHRIL_COBBLE);
        addDrop(BlockInit.MITHRIL_ORE);
        addDrop(BlockInit.MITHRIL_STONE);
        addDrop(BlockInit.MORDOR_ORE);
        addDrop(BlockInit.MORDOR_COBBLE);
        addDrop(BlockInit.MORDOR_STONE);
        addDrop(BlockInit.ANGBND_COBBLE);
        addDrop(BlockInit.ANGBAND_ORE);
        addDrop(BlockInit.DWARF_STONE);
        addDrop(BlockInit.BLUECRYSTAL_LOG);
        addDrop(BlockInit.BLUECRYSTAL_LEAVES);
        addDrop(BlockInit.DEEPSLATE_MITHRIL_ORE);
    }
}