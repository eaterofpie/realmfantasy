package dev.andrew.realmfantasymod.sound;

import dev.andrew.realmfantasymod.RealmfantasyMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundsInit {

    public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(RealmfantasyMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        RealmfantasyMod.LOGGER.info("Registering Sounds for " + RealmfantasyMod.MOD_ID);
    }
    public static void load() {

    }
}
