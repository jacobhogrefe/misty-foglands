package com.jacobhogrefe.world.gen;

import com.jacobhogrefe.world.ModBiomes;
import com.jacobhogrefe.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.tag(ModBiomes.MISTY_FOGLANDS),
                // BiomeSelectors.categories(Biome.Category.PLAINS)
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DEW_SHROOM_PLACED.getKey().get());
    }
}
