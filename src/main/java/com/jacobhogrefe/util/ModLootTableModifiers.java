package com.jacobhogrefe.util;

import com.jacobhogrefe.block.ModBlocks;
import com.jacobhogrefe.item.ModItems;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static Identifier END_CITY_TREASURE_ID =
            new Identifier("minecraft", "chests/end_city_treasure");

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            //check for end city chest loot table for mist grass
            if(END_CITY_TREASURE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.35f)) // contains the item 35% of the time
                        .with(ItemEntry.builder(ModBlocks.MISTY_COBBLESTONE))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build()); // contains 2 or 4
                supplier.withPool(poolBuilder.build());
            }

            if(END_CITY_TREASURE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(.15f)) // contains the item 15% of the time
                        .with(ItemEntry.builder(ModItems.MISTY_SHARD))
                        .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); // contains 1
                supplier.withPool(poolBuilder.build());
            }
        }));
    }
}
