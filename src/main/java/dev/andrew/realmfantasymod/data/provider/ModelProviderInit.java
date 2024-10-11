package dev.andrew.realmfantasymod.data.provider;

import dev.andrew.realmfantasymod.init.BlockInit;
import dev.andrew.realmfantasymod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProviderInit extends FabricModelProvider {
    public ModelProviderInit(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ANGBAND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ANGBND_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ANGBAND_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DEEPSLATE_MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MORDOR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MORDOR_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MORDOR_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.DWARF_STONE);

        blockStateModelGenerator.registerLog(BlockInit.MITHRIL_LOG)
                .log(BlockInit.MITHRIL_LOG);
        blockStateModelGenerator.registerLog(BlockInit.SILVER_LOG)
                .log(BlockInit.SILVER_LOG);
        blockStateModelGenerator.registerLog(BlockInit.IRONWOOD_LOG)
                .log(BlockInit.IRONWOOD_LOG);
        blockStateModelGenerator.registerLog(BlockInit.EVILWOOD_LOG)
                .log(BlockInit.EVILWOOD_LOG);
        blockStateModelGenerator.registerLog(BlockInit.BLUECRYSTAL_LOG)
                .log(BlockInit.BLUECRYSTAL_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.MITHRIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.IRONWOOD_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SILVER_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.EVILWOOD_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.BLUECRYSTAL_LEAVES);
        blockStateModelGenerator.registerTintableCross(BlockInit.MITHRIL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(BlockInit.SILVER_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(BlockInit.IRONWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(BlockInit.EVILWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.MITHRIL_ITEM, Models.GENERATED);
    }
}