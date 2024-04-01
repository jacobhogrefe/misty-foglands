package com.jacobhogrefe;

import com.jacobhogrefe.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStribability();
    }

    public static void registerStribability() {
        StrippableBlockRegistry.register(ModBlocks.FOGWOOD_LOG, ModBlocks.STRIPPED_FOGWOOD_LOG);
    }
}
