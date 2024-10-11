package dev.andrew.realmfantasymod.world.gen;

import dev.andrew.realmfantasymod.world.PlacedFeatureInit;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class OreGenerationInit {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, PlacedFeatureInit.OVERWORLD_MITHRIL_ORE_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, PlacedFeatureInit.NETHER_ANGBAND_ORE_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, PlacedFeatureInit.NETHER_ANGBAND_ORE_KEY);
    }
}
