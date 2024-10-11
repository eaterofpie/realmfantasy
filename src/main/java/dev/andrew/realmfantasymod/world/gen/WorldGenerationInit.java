package dev.andrew.realmfantasymod.world.gen;

public class WorldGenerationInit {
    public static void generateModWorldGen() {
        OreGenerationInit.generateOres();

        TreeGenerationInit.generateTrees();
    }
}
