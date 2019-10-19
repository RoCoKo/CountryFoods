package com.countryfoods.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.countryfoods.init.ModBlocks;
import com.countryfoods.init.ModItems;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.SALT_ORE, new ItemStack(ModItems.SALT, 3), 0.35f);
		GameRegistry.addSmelting(ModItems.RAW_KEBAB, new ItemStack(ModItems.KEBAB, 1), 0.35f);
		GameRegistry.addSmelting(ModItems.RAW_CHEESECAKE, new ItemStack(ModBlocks.CHEESECAKE, 1), 0.35f);
		GameRegistry.addSmelting(ModItems.RAW_PIZZA, new ItemStack(ModItems.PIZZA, 1), 0.35f);
		GameRegistry.addSmelting(ModItems.RAW_BAKLAVA, new ItemStack(ModItems.SYRUPLESS_BAKLAVA, 1), 0.35f);
		GameRegistry.addSmelting(ModItems.SYRUP, new ItemStack(ModItems.HOT_SYRUP, 1), 0.35f);
	}
}