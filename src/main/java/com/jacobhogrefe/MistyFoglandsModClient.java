package com.jacobhogrefe;

import com.jacobhogrefe.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MistyFoglandsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap. INSTANCE.putBlock(ModBlocks.FOGWOOD_LEAVES, RenderLayer.getCutout()) ;
        BlockRenderLayerMap. INSTANCE.putBlock(ModBlocks.FOGWOOD_SAPLING, RenderLayer.getCutout());
    }
}
