package dev.andrew.realmfantasymod.list;


import dev.andrew.realmfantasymod.RealmfantasyMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Blocks {
        public static final TagKey<Block> TEST_TAG = TagKey.of(RegistryKeys.BLOCK, RealmfantasyMod.id("FANTASY"));

        public static final TagKey<Block> INCORRECT_FOR_EXAMPLE_TOOL =
                TagKey.of(RegistryKeys.BLOCK, RealmfantasyMod.id("incorrect_for_example_tool"));

        public static final TagKey<Block> SILVER_LOGS = TagKey.of(RegistryKeys.BLOCK, RealmfantasyMod.id("silver_logs"));
    }

    public static class Items {
        public static final TagKey<Item> MITHRIL_LOGS = TagKey.of(RegistryKeys.ITEM, RealmfantasyMod.id("mithril_logs"));
    }
}
