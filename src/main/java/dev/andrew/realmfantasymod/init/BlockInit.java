package dev.andrew.realmfantasymod.init;

import dev.andrew.realmfantasymod.RealmfantasyMod;
import dev.andrew.realmfantasymod.worldgen.ConfiguredFeatureInit;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

import java.util.Optional;

public class BlockInit {
    public static final Block MITHRIL_COBBLE =registerWithItem("mithril_cobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_STONE =registerWithItem("mithril_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 4)));
    public static final Block MITHRIL_ORE =registerWithItem("mithril_ore",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block ANGBAND_ORE =registerWithItem("angband_ore",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block ANGBND_COBBLE =registerWithItem("angband_cobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 9)));
    public static final Block ANGBAND_STONE =registerWithItem("angband_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MORDOR_ORE =registerWithItem("mordor_ore",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MORDOR_COBBLE =registerWithItem("mordor_cobble",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MORDOR_STONE =registerWithItem("mordor_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block DEEPSLATE_MITHRIL_ORE =registerWithItem("deepslate_mithril_ore",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_LOG = registerWithItem("mithril_log", Blocks.createLogBlock(MapColor.TERRACOTTA_LIGHT_BLUE, MapColor.WHITE));
    public static final Block SILVER_LOG = registerWithItem("silver_log", Blocks.createLogBlock(MapColor.GRAY, MapColor.STONE_GRAY));
    public static final Block IRONWOOD_LOG = registerWithItem("ironwood_log", Blocks.createLogBlock(MapColor.GRAY, MapColor.STONE_GRAY));
    public static final LeavesBlock MITHRIL_LEAVES = registerWithItem("mithril_leaves",

            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final LeavesBlock SILVER_LEAVES = registerWithItem("silver_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));
    public static final LeavesBlock IRONWOOD_LEAVES = registerWithItem("irnwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final SaplingBlock MITHRIL_SAPLING = registerWithItem("mithril_sapling",
            new SaplingBlock(
                    new SaplingGenerator(
                            RealmfantasyMod.id("mithril_sapling").toString(),
                            1.1F,
                            Optional.empty(),
                            Optional.empty(),
                            Optional.of(ConfiguredFeatureInit.MITHRIL_TREE_KEY),
                            Optional.empty(),
                            Optional.empty(),
                            Optional.empty()
                    ),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
                            .noCollision()));

    public static final SaplingBlock SILVER_SAPLING = registerWithItem("silver_sapling",
            new SaplingBlock(
                    new SaplingGenerator(
                            RealmfantasyMod.id("silver_sapling").toString(),
                            1.6F,
                            Optional.empty(),
                            Optional.empty(),
                            Optional.of(ConfiguredFeatureInit.SILVER_TREE_KEY),
                            Optional.empty(),
                            Optional.empty(),
                            Optional.empty()
                    ),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
                            .noCollision()));

    public static final SaplingBlock IRONWOOD_SAPLING = registerWithItem("ironwood_sapling",
            new SaplingBlock(
                    new SaplingGenerator(
                            RealmfantasyMod.id("ironwood_sapling").toString(),
                            1.2F,
                            Optional.empty(),
                            Optional.empty(),
                            Optional.of(ConfiguredFeatureInit.IRONWOOD_TREE_KEY),
                            Optional.empty(),
                            Optional.empty(),
                            Optional.empty()
                    ),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
                            .noCollision()));
    public static  <T extends Block> T register(String name, T block ) {
        return Registry.register(Registries.BLOCK, RealmfantasyMod.id(name), block);
    }
    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load () {

    }
}
