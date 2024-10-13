package dev.andrew.realmfantasymod.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;

import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class OverworldRegionInit extends Region {
    public OverworldRegionInit(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube,
            RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, BiomesInit.CRYSTAL_BIOME);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST,BiomesInit.CRYSTALELF_BIOME);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.JAGGED_PEAKS, BiomesInit.DWARF_KINGDOM);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.JAGGED_PEAKS, BiomesInit.DWARF_LANDS);







        });
    }
}
