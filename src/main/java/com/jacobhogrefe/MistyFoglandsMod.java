package com.jacobhogrefe;

import com.jacobhogrefe.block.ModBlocks;
import com.jacobhogrefe.item.ModItems;
import com.jacobhogrefe.item.custom.SporePuffItem;
import com.jacobhogrefe.item.entity.ModEntities;
import com.jacobhogrefe.util.ModRegistries;
import com.jacobhogrefe.world.dimension.ModDimensions;
import com.jacobhogrefe.world.feature.ModConfiguredFeatures;
import com.jacobhogrefe.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MistyFoglandsMod implements ModInitializer {
	public static final String MOD_ID = "misty-foglands-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModDimensions.register();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		ModWorldGen.generateModWorldGen();
		ModEntities.registerModEntities();
	}
}