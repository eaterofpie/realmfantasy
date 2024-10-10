package dev.andrew.realmfantasymod.init;

import dev.andrew.realmfantasymod.RealmfantasyMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {
    public static final Item MITHRIL_ITEM = register("mithril_item", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, RealmfantasyMod.id(name), item);
    }

    public static void load() {

    }
}
