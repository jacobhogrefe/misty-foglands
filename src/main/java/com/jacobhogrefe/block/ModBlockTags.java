package com.jacobhogrefe.block;

import com.jacobhogrefe.MistyFoglandsMod;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockTags {
    public static final TagKey<Block> MIST_STONE_REPLACEABLES = register("mist_stone_replaceables");

    private static TagKey<Block> register(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(id));
    }

    public static void registerModBlockTags() {
        MistyFoglandsMod.LOGGER.info("Registering ModBlockTags for " + MistyFoglandsMod.MOD_ID);
    }
}
