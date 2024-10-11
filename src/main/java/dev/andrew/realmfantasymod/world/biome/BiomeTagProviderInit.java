package dev.andrew.realmfantasymod.world.biome;

import dev.andrew.realmfantasymod.RealmfantasyMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

import java.util.concurrent.CompletableFuture;

public class BiomeTagProviderInit extends FabricTagProvider<Biome> {
    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registryKey
     * @param registriesFuture the backing registry for the tag type
     */
    public BiomeTagProviderInit(FabricDataOutput output, RegistryKey<? extends Registry<Biome>> registryKey, CompletableFuture< RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, Identifier.of(RealmfantasyMod.MOD_ID, "biome_tag_test")))
                .add(BiomesInit.ORC_PLAINS)
                .add(BiomesInit.CRYSTALELF_BIOME)
                .add(BiomesInit.CRYSTAL_BIOME)
                .add(BiomesInit.HOBBIT_BIOME)
                .add(BiomesInit.BREE_PLAINS)
                .add(BiomesInit.DARKELF_FOREST)
                .add(BiomesInit.GOLDELF_PLAINS)
                .add(BiomesInit.IORNDWARF_JAGGED)
                .add(BiomesInit.SILVERELF_FOREST)
                .add(BiomesInit.SUNELF_FOREST)
                .add(BiomesInit.ANGBAND_MIDLANDS)
                .add(BiomesInit.MORIA_BARRRENS)
                .add(BiomesInit.EIGHTPEAKS_MIDLANDS)
                .add(BiomesInit.ANGMAR_FOREST)
                .add(BiomesInit.TEROKKAR_FOREST)
                .add(BiomesInit.MORDOR_HIGHLANDS);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, Identifier.of(RealmfantasyMod.MOD_ID, "tag_selector_test")))
                .add(BiomeKeys.BEACH)
                .add(BiomeKeys.DESERT)
                .add(BiomeKeys.SAVANNA)
                .add(BiomesInit.CRYSTAL_BIOME)
                .add(BiomesInit.CRYSTALELF_BIOME)
                .add(BiomesInit.LOWLANDS_BIOME)
                .add(BiomesInit.HOBBIT_BIOME)
                .add(BiomesInit.EIGHTPEAKS_MIDLANDS)
                .add(BiomesInit.MORIA_BARRRENS)
                .add(BiomesInit.SUNELF_FOREST)
                .add(BiomesInit.SILVERELF_FOREST)
                .add(BiomesInit.ANGBAND_MIDLANDS)
                .add(BiomesInit.MORDOR_HIGHLANDS)
                .add(BiomesInit.IORNDWARF_JAGGED)
                .add(BiomesInit.ZANGARMARSH)
                .add(BiomesInit.BLACKROCK_JAGGED)
                .add(BiomesInit.GOLDELF_PLAINS)
                .add(BiomesInit.DARKELF_FOREST)
                .add(BiomesInit.ANGMAR_FOREST)
                .add(BiomesInit.TEROKKAR_FOREST)
                .add(BiomesInit.DROW_DEEP)
                .add(BiomesInit.DEEP_WASTES)
                .add(BiomesInit.TREE_FOLK)
                .add(BiomesInit.DEAD_LAND)
                .add(BiomesInit.DRAGON_MOUNTAINS)
                .add(BiomesInit.DUN_MOROGH)
                .add(BiomesInit.HIGHMOUNTAINS)
                .add(BiomesInit.DUSKWOOD)
                .add(BiomesInit.BLADES_EDGE_MOUNTAINS)
                .add(BiomesInit.GODLEN_KINGDOM)
                .add(BiomesInit.WESTERN_PLAGUELANDS)
                .add(BiomesInit.EASTERN_PLAGUELANDS)
                .add(BiomesInit.CRYSTALSONG_FOREST)
                .add(BiomesInit.SHING_PLAINS)
                .add(BiomesInit.ROTHE_VALLEY)
                .add(BiomeKeys.BADLANDS);

    }
    public static void load() {

    }

}

