package net.thelostland.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.thelostland.TheLostLand;
import net.thelostland.block.customBlock.InjectionBenchBlock;
import net.thelostland.util.publicConstructor.ModFluidBlock;
import net.thelostland.fluid.ModFluids;
import net.thelostland.util.ModItemGroups;

import java.util.List;

public class ModBlocks {

    // 血流体方块
    public static final Block BLOOD = registerBlockWithoutBlockItem("blood_block",
            new ModFluidBlock(ModFluids.STILL_BLOOD, FabricBlockSettings.of(Material.WATER).noCollision().nonOpaque().dropsNothing()));
    // 血晶石矿石
    public static final Block BLOODY_CRYSTAL_ORE = registerBlock("bloody_crystal_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).hardness(3.0F).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroups.THE_LOST_LAND_COMMON);
    public static final Block DEEPSLATE_BLOODY_CRYSTAL_ORE = registerBlock("deepslate_bloody_crystal_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).hardness(4.5F).requiresTool(), UniformIntProvider.create(2, 6)), ModItemGroups.THE_LOST_LAND_COMMON);
    // 注入工作台
    public static final Block INJECTION_BENCH = registerBlockWithTooltip("injection_bench",
            new InjectionBenchBlock(FabricBlockSettings.of(Material.METAL).requiresTool().nonOpaque()), ModItemGroups.THE_LOST_LAND_COMMON,
            "block.thelostland.injection_bench.tooltip");

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup){ // 注册方块的同时注册对应的物品
        // 调用类中方块相关物品对象注册方法，同时做到方块与方块相关物品对象的注册
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(TheLostLand.MOD_ID, name), block);
    }

    private static Block registerBlockWithTooltip(String name, Block block, ItemGroup itemGroup, String tooltips){ // 注册方块的同时注册一个有物品提示的对应物品
        // 调用类中方块相关物品对象注册方法，同时做到方块与方块相关物品对象的注册
        registerBlockItemWithTooltip(name, block, itemGroup, tooltips);
        return Registry.register(Registry.BLOCK, new Identifier(TheLostLand.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block){ // 注册方块的同时不进行物品的注册
        return Registry.register(Registry.BLOCK, new Identifier(TheLostLand.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup itemGroup){ // 注册与方块对应的物品
        Registry.register(Registry.ITEM, new Identifier(TheLostLand.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }

    private static void registerBlockItemWithTooltip(String name, Block block, ItemGroup itemGroup, String tooltips){ // 注册与方块对应并且有物品提示的物品
        Registry.register(Registry.ITEM, new Identifier(TheLostLand.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup)){
                    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
                        tooltip.add(new TranslatableText(tooltips));
                    }
                });
    }

    public static void registerModBlocks(){
        TheLostLand.LOGGER.info("Registering ModBlocks for " + TheLostLand.MOD_ID);
    }
}
