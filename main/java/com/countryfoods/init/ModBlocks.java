package com.countryfoods.init;

import java.util.ArrayList;
import java.util.List;

import com.countryfoods.blocks.Cheesecake;
import com.countryfoods.blocks.LettucePlant;
import com.countryfoods.blocks.SaltBlock;
import com.countryfoods.blocks.SaltOre;
import com.countryfoods.blocks.TomatoPlant;
import com.countryfoods.items.foodmaterials.Salt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block SALT_BLOCK = new SaltBlock("salt_block", Material.SAND);
	public static final Block SALT_ORE = new SaltOre("salt_ore", Material.ROCK);
	
	//Plants
	public static final Block TOMATO_PLANT = new TomatoPlant("tomato_plant");
	public static final Block LETTUCE_PLANT = new LettucePlant("lettuce_plant");
	
	//Cake
	public static final Block CHEESECAKE = new Cheesecake("cheesecake", 4, 3);
}