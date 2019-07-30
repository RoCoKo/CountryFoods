package com.countryfoods.init;

import java.util.ArrayList;
import java.util.List;

import com.countryfoods.items.foods.Tomato;
import com.countryfoods.items.logo.Logo;
import com.countryfoods.items.foods.Baklava;
import com.countryfoods.items.foods.BreadSlice;
import com.countryfoods.items.foods.Cheese;
import com.countryfoods.items.foods.Dough;
import com.countryfoods.items.foods.Flour;
import com.countryfoods.items.foods.Hamburger;
import com.countryfoods.items.foods.HotSyrup;
import com.countryfoods.items.foods.Kebab;
import com.countryfoods.items.foods.Lettuce;
import com.countryfoods.items.foods.Oil;
import com.countryfoods.items.foods.RawBaklava;
import com.countryfoods.items.foods.RawBeefSlice;
import com.countryfoods.items.foods.RawCheesecake;
import com.countryfoods.items.foods.RawKebab;
import com.countryfoods.items.foods.Salt;
import com.countryfoods.items.foods.Syrup;
import com.countryfoods.items.foods.SyruplessBaklava;
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
	public static final Item BAKLAVA = new Baklava("baklava", 8, 12f, false);
	
	//Tools
	public static final Item KNIFE = new Knife("knife");
	public static final Item ROLLING_PIN = new RollingPin("rolling_pin");
	public static final Item MORTAR_AND_PESTLE = new MortarAndPestle("mortar_and_pestle");
			
	//Unfinished Foods
	public static final Item RAW_KEBAB = new RawKebab("raw_kebab", 4, 4f, false);
	public static final Item RAW_CHEESECAKE = new RawCheesecake("raw_cheesecake");
	public static final Item SYRUPLESS_BAKLAVA = new SyruplessBaklava("syrupless_baklava", 4, 4f, false);
	public static final Item RAW_BAKLAVA = new RawBaklava("raw_baklava", 2, 2f, false);

	//Food Materials
	public static final Item RAW_BEEF_SLICE = new RawBeefSlice("raw_beef_slice", 1, 0.6f, false);
	public static final Item BREAD_SLICE = new BreadSlice("bread_slice", 1, 1.5f, false);
	public static final Item CHEESE = new Cheese("cheese", 2, 2f, false);
	public static final Item TOMATO = new Tomato("tomato", 2, 1f, false);
	public static final Item LETTUCE = new Lettuce("lettuce", 2, 1f, false);
	public static final Item FLOUR = new Flour("flour");
	public static final Item SALT = new Salt("salt");
	public static final Item DOUGH = new Dough("dough");
	public static final Item OIL = new Oil("oil");
	public static final Item HOT_SYRUP = new HotSyrup("hot_syrup");
	public static final Item SYRUP = new Syrup("syrup");
	
	//Seeds
	public static final Item TOMATO_SEEDS = new TomatoSeeds("tomato_seeds");
	public static final Item LETTUCE_SEEDS = new LettuceSeeds("lettuce_seeds");
		
}