package com.jacobhogrefe.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.Vec3d;

public class HydroBladeItem extends SwordItem {
    public HydroBladeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 3), attacker);
        Vec3d currVelocity = target.getVelocity();
        target.setVelocity(currVelocity.getX() * 4.5, currVelocity.getY() * 1.5f, currVelocity.getZ() * 4.5f);
        return super.postHit(stack, target, attacker);
    }
}
