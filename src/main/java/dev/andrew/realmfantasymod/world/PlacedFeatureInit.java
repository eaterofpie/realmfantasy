package dev.andrew.realmfantasymod.world;

import dev.andrew.realmfantasymod.RealmfantasyMod;
import dev.andrew.realmfantasymod.init.BlockInit;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class PlacedFeatureInit {
    public static final RegistryKey<PlacedFeature> OVERWORLD_MITHRIL_ORE_KEY = registerKey("overworld_mithril_ore");
    public static final RegistryKey<PlacedFeature> NETHER_ANGBAND_ORE_KEY = registerKey("nether_angband_ore");
    public static final RegistryKey<PlacedFeature> END_MORDOR_ORE_KEY = registerKey("end_mordor_ore");

    public static final RegistryKey<PlacedFeature> MITHRIL_TREE_KEY = registerKey("mithril_tree");
    public static final RegistryKey<PlacedFeature> SILVER_TREE_KEY = registerKey("silver_tree");
    public static final RegistryKey<PlacedFeature> EVILWOOD_TREE_KEY = registerKey("evilwood_tree");
    public static final RegistryKey<PlacedFeature> IRONWOOD_TREE_KEY = registerKey("ironwood_tree");
    public static final RegistryKey<PlacedFeature> BLUECRYSTAL_TREE_KEY = registerKey("bluecrystal_tree");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, OVERWORLD_MITHRIL_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.OVERWORLD_MITHRIL_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-24), YOffset.fixed(64))));


        register(context, NETHER_ANGBAND_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.NETHER_ANGBAND_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, END_MORDOR_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.END_MORDOR_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));


        register(context, MITHRIL_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.MITHRIL_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(8, 0.1f, 2),
                        BlockInit.MITHRIL_SAPLING));

        register(context, SILVER_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.SILVER_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(10, 0.1f, 2),
                        BlockInit.SILVER_SAPLING));

        register(context, IRONWOOD_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.IRONWOOD_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(10, 0.1f, 2),
                        BlockInit.IRONWOOD_SAPLING));

        register(context, EVILWOOD_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.EVILWOOD_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(8, 0.1f, 2),
                        BlockInit.IRONWOOD_SAPLING));

        register(context, BLUECRYSTAL_TREE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.BLUECRYSTAL_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(13, 0.1f, 2),
                        BlockInit.BLUECRYSTAL_SAPLING));
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, RealmfantasyMod.id(name));
    }

    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> config,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }

    public static class Modifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
        }

        public static List<PlacementModifier> modifiersCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
    }

}
