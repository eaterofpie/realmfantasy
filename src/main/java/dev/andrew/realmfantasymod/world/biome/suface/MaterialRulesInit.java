package dev.andrew.realmfantasymod.world.biome.suface;


import dev.andrew.realmfantasymod.init.BlockInit;
import dev.andrew.realmfantasymod.world.biome.BiomesInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class MaterialRulesInit {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule MITHIRL_STONE = makeStateRule(BlockInit.MITHRIL_STONE);
    private static final MaterialRules.MaterialRule DWARF_STONE = makeStateRule(BlockInit.DWARF_STONE);


    public static MaterialRules.MaterialRule makeRules() {
                MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);
        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);


        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(BiomesInit.HOBBIT_BIOME),

                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6,MITHIRL_STONE )),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, DWARF_STONE),


                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, GRASS_BLOCK),



                        MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(BiomesInit.MORIA_BARRRENS),
                                        MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, DWARF_STONE)),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        )));
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}

