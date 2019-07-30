package com.countryfoods.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.countryfoods.init.ModBlocks;
import com.countryfoods.init.ModItems;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModItems.RAW_KEBAB, new ItemStack(ModItems.KEBAB, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.RAW_CHEESECAKE, new ItemStack(ModBlocks.CHEESECAKE, 1), 1.5f);
	}
}
