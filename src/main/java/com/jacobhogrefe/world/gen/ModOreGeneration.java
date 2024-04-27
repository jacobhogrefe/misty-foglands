package com.jacobhogrefe.world.gen;

import com.jacobhogrefe.world.ModBiomes;
import com.jacobhogrefe.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.tag(ModBiomes.MISTY_FOGLANDS),
                //BiomeSelectors.foundInOverworld()
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MIST_ORE_PLACED.getKey().get());
    }
}