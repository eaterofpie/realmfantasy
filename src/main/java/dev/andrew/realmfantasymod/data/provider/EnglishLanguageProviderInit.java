package dev.andrew.realmfantasymod.data.provider;

import dev.andrew.realmfantasymod.RealmfantasyMod;
import dev.andrew.realmfantasymod.init.BlockInit;
import dev.andrew.realmfantasymod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProviderInit extends FabricLanguageProvider {


    public EnglishLanguageProviderInit(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            RealmfantasyMod.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }


    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.MITHRIL_ITEM, "mithril_item");
        translationBuilder.add(BlockInit.ANGBAND_ORE, "angband_ore");
        translationBuilder.add(BlockInit.ANGBND_COBBLE, "angband_cobble");
        translationBuilder.add(BlockInit.ANGBAND_STONE,"angband_stone");
        translationBuilder.add(BlockInit.MITHRIL_ORE, "mithril_ore");
        translationBuilder.add(BlockInit.MITHRIL_COBBLE, "mithril_cobble");
        translationBuilder.add(BlockInit.MITHRIL_STONE,"mithril_stone");
        translationBuilder.add(BlockInit.MORDOR_ORE,"mordor_ore");
        translationBuilder.add(BlockInit.MORDOR_COBBLE,"mordor_cobble");
        translationBuilder.add(BlockInit.MORDOR_STONE, "mordor_stone");
        translationBuilder.add(BlockInit.DEEPSLATE_MITHRIL_ORE,"deepslate_mithril_ore");
    }
}