package net.thelostland.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.thelostland.TheLostLand;
import net.thelostland.item.ModItems;

public class ModItemGroups {

    public static final ItemGroup THE_LOST_LAND_COMMON = FabricItemGroupBuilder.build(
            new Identifier(TheLostLand.MOD_ID, "common"),
            () -> new ItemStack(ModItems.BLOODY_CRYSTAL)
    );

    public static final ItemGroup THE_LOST_LAND_LEGENDARY = FabricItemGroupBuilder.build(
            new Identifier(TheLostLand.MOD_ID, "legendary"),
            () -> new ItemStack(Items.DIAMOND)
    );
}
