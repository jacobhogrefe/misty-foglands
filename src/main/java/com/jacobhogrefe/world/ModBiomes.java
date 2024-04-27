package com.jacobhogrefe.world;

import com.jacobhogrefe.MistyFoglandsMod;
import net.fabricmc.fabric.impl.tag.convention.TagRegistration;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final TagKey<Biome> MISTY_FOGLANDS = register("hills");

    private static TagKey<Biome> register(String id){ return TagRegistration.BIOME_TAG_REGISTRATION.registerCommon(id); }

    public static void registerModBiomes() {
        MistyFoglandsMod.LOGGER.info("Registering ModBiomes for " + MistyFoglandsMod.MOD_ID);
    }
}
