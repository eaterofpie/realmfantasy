package dev.andrew.realmfantasymod.world.gen;

import dev.andrew.realmfantasymod.world.PlacedFeatureInit;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class BiomeModificationInit {
    public static void load() {
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatureInit.MITHRIL_TREE_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatureInit.IRONWOOD_TREE_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatureInit.EVILWOOD_TREE_KEY
        );
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION,
                PlacedFeatureInit.BLUECRYSTAL_TREE_KEY);
    }
}
