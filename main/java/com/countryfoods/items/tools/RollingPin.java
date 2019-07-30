package com.countryfoods.items.tools;

import com.countryfoods.Main;
import com.countryfoods.init.ModItems;
import com.countryfoods.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RollingPin extends Item implements IHasModel 
{
	public RollingPin(String name)
	{
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.countryfoodstab);
        setNoRepair();
        setMaxDamage(25);
        setMaxStackSize(1);
        ModItems.ITEMS.add(this);
	}
	
	@Override
    public boolean hasContainerItem(ItemStack stack) 
	{
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) 
    {
        return itemStack.getItemDamage() < itemStack.getMaxDamage() ? new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1) : ItemStack.EMPTY;
    }

    @Override
    public void registerModels() 
    {
        Main.proxy.registerItemRenderer(this, 0, "Inventory");
    }
}