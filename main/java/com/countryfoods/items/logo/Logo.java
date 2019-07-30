package com.countryfoods.items.logo;

import com.countryfoods.Main;
import com.countryfoods.init.ModItems;
import com.countryfoods.util.IHasModel;

import net.minecraft.item.Item;

public class Logo extends Item implements IHasModel 
{
	public Logo(String name)
	{
        setUnlocalizedName(name);
        setRegistryName(name);
        ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}