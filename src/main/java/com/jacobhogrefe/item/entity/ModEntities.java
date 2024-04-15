/**
 * Credit: https://fabricmc.net/wiki/tutorial:projectiles
 */

package com.jacobhogrefe.item.entity;

import com.jacobhogrefe.MistyFoglandsMod;
import com.jacobhogrefe.item.entity.custom.SporePuffEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<SporePuffEntity> SPORE_PUFF_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MistyFoglandsMod.MOD_ID, "spore_puff_entity"),
            FabricEntityTypeBuilder.<SporePuffEntity>create(SpawnGroup.MISC, SporePuffEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeBlocks(4).trackedUpdateRate(10)
                    .build()
    );

    public static void registerModEntities()
    {
        MistyFoglandsMod.LOGGER.info("Registering ModEntities for " + MistyFoglandsMod.MOD_ID);
    }
}
