package com.countryfoods.items.foods;

import com.countryfoods.Main;
import com.countryfoods.init.ModItems;
import com.countryfoods.util.IHasModel;

import net.minecraft.item.Item;

public class RawCheesecake extends Item implements IHasModel 
{
	public RawCheesecake(String name)
	{
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.countryfoodstab);
        ModItems.ITEMS.add(this);
        setMaxStackSize(1);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}