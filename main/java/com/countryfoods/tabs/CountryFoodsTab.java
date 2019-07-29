package com.countryfoods.tabs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.countryfoods.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CountryFoodsTab extends CreativeTabs
{
	public CountryFoodsTab(String label) { super("countryfoodstab");
	this.setBackgroundImageName("countryfoodstab.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.LOGO);}
}