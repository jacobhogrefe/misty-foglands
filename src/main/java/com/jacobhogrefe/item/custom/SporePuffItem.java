/**
 * Credit: https://fabricmc.net/wiki/tutorial:projectiles
 */

package com.jacobhogrefe.item.custom;

import com.jacobhogrefe.item.entity.custom.SporePuffEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SporePuffItem extends Item {
    public SporePuffItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand); // creates a new ItemStack instance of the user's itemStack in-hand
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW,
                SoundCategory.NEUTRAL, 0.5F, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f)); // plays a globalSoundEvent
        user.getItemCooldownManager().set(this, 20);

        if (!world.isClient) {
            SporePuffEntity sporePuffEntity = new SporePuffEntity(world, user);
            sporePuffEntity.setItem(itemStack);
            sporePuffEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 1.5f, 1f);
            world.spawnEntity(sporePuffEntity); // spawns entity
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1); // decrements itemStack if user is not in creative mode
        }

        //return TypedActionResult.success(itemStack, world.isClient());
        return super.use(world, user, hand);
    }
}