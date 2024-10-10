package dev.andrew.realmfantasymod.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class BiomeModificationIni {
    public static void load() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                PlacedFeatureInit.OVERWORLD_MITHRIL_ORE_KEY

        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatureInit.MITHRIL_TREE_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatureInit.MITHRIL_TREE_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.JAGGED_PEAKS),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatureInit.IRONWOOD_TREE_KEY



        );
    }
}

