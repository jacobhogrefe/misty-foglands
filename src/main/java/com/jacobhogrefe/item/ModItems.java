package com.jacobhogrefe.item;

import com.jacobhogrefe.MistyFoglandsMod;
import com.jacobhogrefe.block.ModBlocks;
import com.jacobhogrefe.item.custom.CustomStickItem;
import com.jacobhogrefe.item.custom.HydroBladeItem;
import com.jacobhogrefe.item.custom.SporePuffItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CUSTOM_STICK = registerItem("custom_stick",
            new CustomStickItem(new FabricItemSettings().group(ModItemGroup.MISTY_FOGLANDS).maxCount(1)));
    public static final Item MISTY_SHARD = registerItem("misty_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.MISTY_FOGLANDS).maxCount(64)));
    public static final Item HYDRO_FRAGMENT = registerItem("hydro_fragment",
            new Item(new FabricItemSettings().group(ModItemGroup.MISTY_FOGLANDS).maxCount(16)));
    public static final Item HYDRO_BLADE = registerItem("hydro_blade",
            new HydroBladeItem(ModToolMaterials.HYDRO, 2, 4f, new FabricItemSettings().group(ModItemGroup.MISTY_FOGLANDS)));
    public static final Item SPORE_PUFF = registerItem("spore_puff",
            new SporePuffItem(new FabricItemSettings().group(ModItemGroup.MISTY_FOGLANDS).maxCount(16)));
    public static final Item DEW_SHROOM = registerItem("dew_shroom",
            new BlockItem(
                    ModBlocks.DEW_SHROOM,
                    new FabricItemSettings()
                            .maxCount(64)
                            .food(ModFoodComponents.DEW_SHROOM)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MistyFoglandsMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MistyFoglandsMod.LOGGER.debug("Registering mod items for " + MistyFoglandsMod.MOD_ID);
    }
}
