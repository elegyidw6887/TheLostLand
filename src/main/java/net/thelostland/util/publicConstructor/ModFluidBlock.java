package net.thelostland.util.publicConstructor;

import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;

public class ModFluidBlock extends FluidBlock {

    // 原版FluidBlock的构造器是受保护的，通过子类的继承来创建公开构造器
    public ModFluidBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }
}
