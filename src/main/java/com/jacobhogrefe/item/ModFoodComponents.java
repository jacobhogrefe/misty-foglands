package com.jacobhogrefe.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DEW_SHROOM = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.5f)
            .statusEffect(
                    new StatusEffectInstance(
                        StatusEffects.WATER_BREATHING, 300, 0), 1.0f)
            .statusEffect(
                    new StatusEffectInstance(
                        StatusEffects.NIGHT_VISION, 300, 0), 1.0f)
            .alwaysEdible()
            .build();
}
