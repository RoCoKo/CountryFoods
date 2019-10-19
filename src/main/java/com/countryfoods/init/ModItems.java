package com.countryfoods.init;

import java.util.ArrayList;
import java.util.List;
import com.countryfoods.items.foods.Tomato;
import com.countryfoods.items.logo.Logo;
import com.countryfoods.items.foods.Baklava;
import com.countryfoods.items.foods.Biscuit;
import com.countryfoods.items.foods.BreadSlice;
import com.countryfoods.items.foods.Cheese;
import com.countryfoods.items.foods.Dough;
import com.countryfoods.items.foods.Flour;
import com.countryfoods.items.foods.Hamburger;
import com.countryfoods.items.foods.HotSyrup;
import com.countryfoods.items.foods.Kebab;
import com.countryfoods.items.foods.Lettuce;
import com.countryfoods.items.foods.Milk;
import com.countryfoods.items.foods.Mochi;
import com.countryfoods.items.foods.Oil;
import com.countryfoods.items.foods.Pizza;
import com.countryfoods.items.foods.RawBaklava;
import com.countryfoods.items.foods.RawBeefSlice;
import com.countryfoods.items.foods.RawCheesecake;
import com.countryfoods.items.foods.RawKebab;
import com.countryfoods.items.foods.RawPizza;
import com.countryfoods.items.foods.RawPorkchopSlice;
import com.countryfoods.items.foods.Rice;
import com.countryfoods.items.foods.Salt;
import com.countryfoods.items.foods.Seaweed;
import com.countryfoods.items.foods.Sushi;
import com.countryfoods.items.foods.Syrup;
import com.countryfoods.items.foods.SyruplessBaklava;
import com.countryfoods.items.foods.Tiramisu;
import com.countryfoods.items.seeds.LettuceSeeds;
import com.countryfoods.items.seeds.RiceSeeds;
import com.countryfoods.items.seeds.TomatoSeeds;
import com.countryfoods.items.tools.Knife;
import com.countryfoods.items.tools.MixingBowl;
import com.countryfoods.items.tools.MortarAndPestle;
import com.countryfoods.items.tools.RollingPin;
import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item LOGO = new Logo("logo");	

	public static final Item KEBAB = new Kebab("kebab", 12, 0.83f, false);
	public static final Item RAW_KEBAB = new RawKebab("raw_kebab", 4, 1f, false);
	public static final Item HAMBURGER = new Hamburger("hamburger", 12, 0.83f, false);
	public static final Item SUSHI = new Sushi("sushi", 6, 0.67f, false);
	public static final Item PIZZA = new Pizza("pizza", 8, 0.5f, false);
	public static final Item RAW_PIZZA = new RawPizza("raw_pizza", 4, 0.5f, false);
	public static final Item BAKLAVA = new Baklava("baklava", 8, 0.83f, false);
	public static final Item SYRUPLESS_BAKLAVA = new SyruplessBaklava("syrupless_baklava", 4, 0.5f, false);
	public static final Item RAW_BAKLAVA = new RawBaklava("raw_baklava", 2, 0.5f, false);
	public static final Item RAW_CHEESECAKE = new RawCheesecake("raw_cheesecake");
	public static final Item MOCHI = new Mochi("mochi", 4, 1f, false);
	public static final Item TIRAMISU = new Tiramisu("tiramisu", 8, 0.83f, false);
	
	public static final Item KNIFE = new Knife("knife");
	public static final Item ROLLING_PIN = new RollingPin("rolling_pin");
	public static final Item MORTAR_AND_PESTLE = new MortarAndPestle("mortar_and_pestle");
	public static final Item MIXING_BOWL = new MixingBowl("mixing_bowl");

	public static final Item TOMATO = new Tomato("tomato", 2, 1f, false);
	public static final Item LETTUCE = new Lettuce("lettuce", 2, 1f, false);
	public static final Item CHEESE = new Cheese("cheese", 2, 1f, false);
	public static final Item SEAWEED = new Seaweed("seaweed");
	public static final Item BISCUIT = new Biscuit("biscuit", 2, 1.5f, false);
	public static final Item RICE = new Rice("rice");
	public static final Item FLOUR = new Flour("flour");
	public static final Item DOUGH = new Dough("dough");
	public static final Item SALT = new Salt("salt");
	public static final Item OIL = new Oil("oil");
	public static final Item MILK = new Milk("milk");
	public static final Item HOT_SYRUP = new HotSyrup("hot_syrup");
	public static final Item SYRUP = new Syrup("syrup");
	public static final Item BREAD_SLICE = new BreadSlice("bread_slice", 1, 1.5f, false);
	public static final Item RAW_BEEF_SLICE = new RawBeefSlice("raw_beef_slice", 1, 0.6f, false);
	public static final Item RAW_PORKCHOP_SLICE = new RawPorkchopSlice("raw_porkchop_slice", 1, 0.6f, false);
	
	public static final Item TOMATO_SEEDS = new TomatoSeeds("tomato_seeds");
	public static final Item LETTUCE_SEEDS = new LettuceSeeds("lettuce_seeds");
	public static final Item RICE_SEEDS = new RiceSeeds("rice_seeds");
}