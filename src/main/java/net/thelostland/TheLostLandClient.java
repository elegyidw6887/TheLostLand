package net.thelostland;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.thelostland.fluid.ModFluids;

public class TheLostLandClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        // 血流体的渲染
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_BLOOD,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY,
                        0xDC143C));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FLOWING_BLOOD,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY,
                        0xDC143C));
    }
}
