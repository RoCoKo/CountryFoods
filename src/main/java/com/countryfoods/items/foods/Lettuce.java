package com.countryfoods.items.foods;

import com.countryfoods.Main;
import com.countryfoods.init.ModItems;
import com.countryfoods.util.IHasModel;
import net.minecraft.item.ItemFood;

public class Lettuce extends ItemFood implements IHasModel 
{
    public Lettuce(String name, int amount, float saturation, boolean isAnimalFood)
    {
        super(amount, saturation, isAnimalFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.countryfoodstab);
        ModItems.ITEMS.add(this);
   }
    @Override
   public void registerModels() 
   {
       Main.proxy.registerItemRenderer(this, 0, "Inventory");
   }
}