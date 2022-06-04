package net.thelostland;

import net.fabricmc.api.ModInitializer;
import net.thelostland.block.ModBlocks;
import net.thelostland.fluid.ModFluids;
import net.thelostland.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheLostLand implements ModInitializer {

	public static final String MOD_ID = "thelostland";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		ModFluids.registerModFluids();

		LOGGER.info("Welcome to The Lost Land!");
	}
}
