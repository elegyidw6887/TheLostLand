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

		/*

		模组制作过程中出现的而且还没有解决的问题

		1.2022.6.5
			在添加初版注入工作台的时候，仿制原版熔炉的代码，在添加模型纹理后，默认显示为点火工作状态
			未解决

		2.

		 */
	}
}
