package com.jacobhogrefe.world.feature;

import com.jacobhogrefe.MistyFoglandsMod;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> FOGWOOD_PLACED = PlacedFeatures.register("fogwood_placed",
            ModConfiguredFeatures.FOGWOOD_SPAWN, VegetationPlacedFeatures.modifiers(
                    // extra chance should be modified to make tree more rare for portal
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
    public static final RegistryEntry<PlacedFeature> MIST_ORE_PLACED = PlacedFeatures.register("mist_ore_placed",
            ModConfiguredFeatures.MIST_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> DEW_SHROOM_PLACED = PlacedFeatures.register("dew_shroom_placed",
            ModConfiguredFeatures.DEW_SHROOM, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
                    PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
}
