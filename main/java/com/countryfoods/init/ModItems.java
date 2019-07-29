package com.countryfoods.init;

import java.util.ArrayList;
import java.util.List;

import com.countryfoods.items.foodmaterials.BreadSlice;
import com.countryfoods.items.foodmaterials.Dough;
import com.countryfoods.items.foodmaterials.Flour;
import com.countryfoods.items.foodmaterials.Oil;
import com.countryfoods.items.foodmaterials.RawBeefSlice;
import com.countryfoods.items.foodmaterials.RawKebab;
import com.countryfoods.items.foodmaterials.Salt;
import com.countryfoods.items.foods.Tomato;
import com.countryfoods.items.logo.Logo;
import com.countryfoods.items.foods.Hamburger;
import com.countryfoods.items.foods.Kebab;
import com.countryfoods.items.foods.Lettuce;
import com.countryfoods.items.seeds.LettuceSeeds;
import com.countryfoods.items.seeds.TomatoSeeds;
import com.countryfoods.items.tools.Knife;
import com.countryfoods.items.tools.MortarAndPestle;
import com.countryfoods.items.tools.RollingPin;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Logo
	public static final Item LOGO = new Logo("logo");
	
	//Foods
	public static final Item KEBAB = new Kebab("kebab", 12, 15f, false);
	public static final Item HAMBURGER = new Hamburger("hamburger", 12, 17f, false);
	public static final Item TOMATO = new Tomato("tomato", 2, 1f, false);
	public static final Item LETTUCE = new Lettuce("lettuce", 2, 1f, false);
	
	//Tools
	public static final Item KNIFE = new Knife("knife");
	public static final Item ROLLING_PIN = new RollingPin("rolling_pin");
	public static final Item MORTAR_AND_PESTLE = new MortarAndPestle("mortar_and_pestle");
			
	//Unfinished Foods
	public static final Item RAW_KEBAB = new RawKebab("raw_kebab", 4, 4f, false);
	
	//Food Materials
	public static final Item RAW_BEEF_SLICE = new RawBeefSlice("raw_beef_slice", 1, 0.6f, false);
	public static final Item BREAD_SLICE = new BreadSlice("bread_slice", 1, 1.5f, false);
	public static final Item FLOUR = new Flour("flour");
	public static final Item SALT = new Salt("salt");
	public static final Item DOUGH = new Dough("dough");
	public static final Item OIL = new Oil("oil");
	
	//Seeds
	public static final Item TOMATO_SEEDS = new TomatoSeeds("tomato_seeds");
	public static final Item LETTUCE_SEEDS = new LettuceSeeds("lettuce_seeds");
		
}