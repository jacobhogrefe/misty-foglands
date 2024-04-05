package com.jacobhogrefe.item;

import com.jacobhogrefe.MistyFoglandsMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MISTY_FOGLANDS = FabricItemGroupBuilder.build(
            new Identifier(MistyFoglandsMod.MOD_ID, "misty_shard"), () -> new ItemStack(ModItems.MISTY_SHARD)
    );
}