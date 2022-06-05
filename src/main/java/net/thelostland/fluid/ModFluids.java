package net.thelostland.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thelostland.TheLostLand;
import net.thelostland.fluid.customFluid.BloodFluid;

public class ModFluids {

    public static FlowableFluid STILL_BLOOD = registerFlowableFluid("still_blood", new BloodFluid.Still());
    public static FlowableFluid FLOWING_BLOOD = registerFlowableFluid("flowing_blood", new BloodFluid.Flowing());

    private static FlowableFluid registerFlowableFluid(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registry.FLUID, new Identifier(TheLostLand.MOD_ID, name), flowableFluid);
    }

    public static void registerModFluids() {
        TheLostLand.LOGGER.info("Registering ModFluids for " + TheLostLand.MOD_ID);
    }
}
