package com.jacobhogrefe;

import com.jacobhogrefe.block.ModBlocks;
import com.jacobhogrefe.item.ModItems;
import com.jacobhogrefe.item.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class MistyFoglandsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FOGWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FOGWOOD_SAPLING, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(Block.getBlockFromItem(ModItems.DEW_SHROOM), RenderLayer.getCutout());
        EntityRendererRegistry.register(ModEntities.SPORE_PUFF_ENTITY, FlyingItemEntityRenderer::new);
    }
}
