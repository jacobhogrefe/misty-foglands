package com.jacobhogrefe.world.dimension;

import com.jacobhogrefe.MistyFoglandsMod;
import com.jacobhogrefe.block.ModBlocks;
import com.jacobhogrefe.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> MF_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(MistyFoglandsMod.MOD_ID, "misty_foglands"));
    public static final RegistryKey<DimensionType> MF_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            MF_DIMENSION_KEY.getValue());

    public static void register() {
        MistyFoglandsMod.LOGGER.debug("Registering ModDimensions for " + MistyFoglandsMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.MISTY_GRASS)
                .destDimID(MF_DIMENSION_KEY.getValue())
                .tintColor(37, 150, 190)
                .lightWithItem(ModItems.MISTY_SHARD)
                .onlyLightInOverworld()
                .flatPortal()
                .forcedSize(3, 3)
                .registerPortal();
    }
}
