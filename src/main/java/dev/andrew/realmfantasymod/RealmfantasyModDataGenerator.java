package dev.andrew.realmfantasymod;

import dev.andrew.realmfantasymod.data.generator.WorldGeneratorInit;
import dev.andrew.realmfantasymod.data.provider.*;
import dev.andrew.realmfantasymod.worldgen.ConfiguredFeatureInit;
import dev.andrew.realmfantasymod.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.report.ItemListProvider;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class RealmfantasyModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(BlockLootTableProviderInit::new);
		pack.addProvider(BlockTagProviderInit::new);
		pack.addProvider(EnglishLanguageProviderInit::new);
		pack.addProvider(ItemListProvider::new);
		pack.addProvider(ModelProviderInit::new);
		pack.addProvider(WorldGeneratorInit::new);


	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
	}
}
