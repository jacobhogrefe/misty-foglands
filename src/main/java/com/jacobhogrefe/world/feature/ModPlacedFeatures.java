package com.jacobhogrefe.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> FOGWOOD_PLACED = PlacedFeatures.register("fogwood_placed",
            ModConfiguredFeatures.FOGWOOD_SPAWN, VegetationPlacedFeatures.modifiers(
                    // extra chance should be modified to make tree more rare for portal
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)
            ));
}
