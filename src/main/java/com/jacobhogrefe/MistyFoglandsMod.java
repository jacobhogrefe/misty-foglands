package com.jacobhogrefe;

import com.jacobhogrefe.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MistyFoglandsMod implements ModInitializer {
	public static final String MOD_ID = "misty-foglands-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}