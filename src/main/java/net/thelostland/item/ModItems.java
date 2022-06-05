package net.thelostland.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.thelostland.TheLostLand;
import net.thelostland.fluid.ModFluids;
import net.thelostland.util.ModItemGroups;

import java.util.List;


public class ModItems {

    // 血宝石
    public static final Item BLOODY_CRYSTAL = registerItem("bloody_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.THE_LOST_LAND_COMMON).maxCount(64)) {
                public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
                    tooltip.add(new TranslatableText("item.thelostland.bloody_crystal.tooltip"));
                }
            });
    // 血晶铁
    public static final Item BLOODY_IRON = registerItem("bloody_iron",
            new Item(new FabricItemSettings().group(ModItemGroups.THE_LOST_LAND_COMMON).maxCount(64)) {
                public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
                    tooltip.add(new TranslatableText("item.thelostland.bloody_iron.tooltip"));
                }
            });
    // 血晶钻石
    public static final Item BLOODY_DIAMOND = registerItem("bloody_diamond",
            new Item(new FabricItemSettings().group(ModItemGroups.THE_LOST_LAND_COMMON).maxCount(64)) {
                public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
                    tooltip.add(new TranslatableText("item.thelostland.bloody_diamond.tooltip"));
                }
            });
    // 血桶
    public static final Item BLOOD_BUCKET = registerItem("blood_bucket",
            new BucketItem(ModFluids.STILL_BLOOD, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1).group(ModItemGroups.THE_LOST_LAND_COMMON)) {
                public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
                    tooltip.add(new TranslatableText("item.thelostland.blood_bucket.tooltip"));
                }
            });

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheLostLand.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheLostLand.LOGGER.info("Registering ModItems for " + TheLostLand.MOD_ID);
    }
}
