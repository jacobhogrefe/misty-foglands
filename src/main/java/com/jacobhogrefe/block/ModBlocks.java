package com.jacobhogrefe.block;

import com.jacobhogrefe.MistyFoglandsMod;
import com.jacobhogrefe.item.ModItemGroup;
import com.jacobhogrefe.world.feature.tree.FogwoodSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block FOGWOOD_SAPLING = registerBlock("fogwood_sapling",
            new SaplingBlock(new FogwoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)
                    .strength(4.0f)
                    .nonOpaque()),
            ModItemGroup.MISTY_FOGLANDS);
    public static final Block FOGWOOD_LEAVES = registerBlock("fogwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)
                    .strength(4.0f)
                    .nonOpaque()
                    .requiresTool()),
            ModItemGroup.MISTY_FOGLANDS);
    public static final Block FOGWOOD_LOG = registerBlock("fogwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)
                    .strength(4.0f)
                    .requiresTool()),
            ModItemGroup.MISTY_FOGLANDS);
    public static final Block STRIPPED_FOGWOOD_LOG = registerBlock("stripped_fogwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)
                    .strength(4.0f)
                    .requiresTool()),
            ModItemGroup.MISTY_FOGLANDS);
    public static final Block FOGWOOD_PLANKS = registerBlock("fogwood_planks",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                    .strength(4.0f)
                    .requiresTool()),
            ModItemGroup.MISTY_FOGLANDS);
    public static final Block MIST_STONE = registerBlock("mist_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(4.0f)
                    .requiresTool()),
            ModItemGroup.MISTY_FOGLANDS);
    public static final Block MISTY_COBBLESTONE = registerBlock("misty_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)
                    .strength(4.0f)
                    .requiresTool()),
            ModItemGroup.MISTY_FOGLANDS);
    public static final Block MIST_ORE = registerBlock("mist_ore",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)
                    .strength(4.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE),
            UniformIntProvider.create(4, 9)),
            ModItemGroup.MISTY_FOGLANDS);
    public static final Block DEW_SHROOM = registerBlock("dew_shroom_block",
            new FlowerBlock(StatusEffects.BLINDNESS, 20 * 20,
                    FabricBlockSettings.copy(Blocks.RED_MUSHROOM)
                    .nonOpaque()),
            ModItemGroup.MISTY_FOGLANDS);

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MistyFoglandsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MistyFoglandsMod.MOD_ID, name), block);
    }

    public static void registerModBlocks()
    {
        MistyFoglandsMod.LOGGER.info("Registering ModBlocks for " + MistyFoglandsMod.MOD_ID);
    }
}
