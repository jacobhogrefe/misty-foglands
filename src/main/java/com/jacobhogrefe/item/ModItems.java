package com.jacobhogrefe.item;

import com.jacobhogrefe.MistyFoglandsMod;
import com.jacobhogrefe.item.custom.CustomStickItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class ModItems {

    public static final Item CUSTOM_STICK = registerItem("custom_stick",
            new CustomStickItem(new FabricItemSettings().group(ModItemGroup.MISTY_FOGLANDS).maxCount(1)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MistyFoglandsMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MistyFoglandsMod.LOGGER.debug("Registering mod items for " + MistyFoglandsMod.MOD_ID);
    }
}
