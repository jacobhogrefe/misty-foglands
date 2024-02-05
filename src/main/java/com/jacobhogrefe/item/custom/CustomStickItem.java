package com.jacobhogrefe.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import java.util.Random;

public class CustomStickItem extends Item {

    Random rand = new Random();

    public CustomStickItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient() && context.getHand() == Hand.MAIN_HAND) {
            PlayerEntity player = context.getPlayer();
            assert player != null;
            explode(context);
            player.getItemCooldownManager().set(this, 20);
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.FAIL;
        }
    }

    private void explode(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        assert player != null;
        float explosionPower = rand.nextFloat(5, 20);
        player.sendMessage(Text.of("Explosion Power: " + explosionPower), false);
        world.createExplosion(null, (float)pos.getX(), (float)pos.getY(), (float)pos.getZ(), explosionPower, false, Explosion.DestructionType.DESTROY);
    }
}
