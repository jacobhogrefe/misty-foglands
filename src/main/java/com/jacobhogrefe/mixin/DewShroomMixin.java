/**
 * Mixin to make the Dew Shroom item edible.
 *
 * Credits: https://github.com/hiisuuii/tifymc/blob/main/src/main/java/hisui/tifymc/mixin/EdibleRedMushroomMixin.java
 */
package com.jacobhogrefe.mixin;

import com.jacobhogrefe.block.ModBlocks;
import com.jacobhogrefe.item.ModFoodComponents;
import com.jacobhogrefe.annotation.ConfigurableMixin;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Items.class)
@ConfigurableMixin(configName = "edibleDewShroom")
public abstract class DewShroomMixin {

    @ModifyArg(
            method = "register(Lnet/minecraft/block/Block;)Lnet/minecraft/item/Item;",
            at = @At(value="INVOKE",target = "Lnet/minecraft/item/BlockItem;<init>(Lnet/minecraft/block/Block;Lnet/minecraft/item/Item$Settings;)V")
    )
    private static Item.Settings jacobhogrefe$makeDewShroomEdible(Block block, Item.Settings original){
        if(block == ModBlocks.DEW_SHROOM){
            return original.food(ModFoodComponents.DEW_SHROOM);
        }
        return original;
    }

}
