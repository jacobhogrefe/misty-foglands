package com.jacobhogrefe.world.feature;

import com.jacobhogrefe.MistyFoglandsMod;
import com.jacobhogrefe.block.ModBlockTags;
import com.jacobhogrefe.block.ModBlocks;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> FOGWOOD_TREE =
            ConfiguredFeatures.register("fogwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.FOGWOOD_LOG),
                    new LargeOakTrunkPlacer(10, 8, 12),
                    BlockStateProvider.of(ModBlocks.FOGWOOD_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 1, 3)).build()
            );

    public static final RegistryEntry<PlacedFeature> FOGWOOD_CHECKED =
            PlacedFeatures.register("fogwood_checked", FOGWOOD_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.FOGWOOD_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> FOGWOOD_SPAWN =
            ConfiguredFeatures.register("fogwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(FOGWOOD_CHECKED, 0.5f)),
                            FOGWOOD_CHECKED));

    public static final List<OreFeatureConfig.Target> MIST_ORES = List.of(
            OreFeatureConfig.createTarget(
                    new TagMatchRuleTest(ModBlockTags.MIST_STONE_REPLACEABLES),
                    ModBlocks.MIST_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MIST_ORE =
            ConfiguredFeatures.register("mist_ore",Feature.ORE,
                    new OreFeatureConfig(MIST_ORES, 9));

    public static void registerConfiguredFeatures() {
        MistyFoglandsMod.LOGGER.info("Registering configured features for " + MistyFoglandsMod.MOD_ID);
    }
}
