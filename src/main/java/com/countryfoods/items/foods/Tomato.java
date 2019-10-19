package com.countryfoods.items.foods;

import java.util.List;
import javax.annotation.Nullable;
import com.countryfoods.Main;
import com.countryfoods.init.ModItems;
import com.countryfoods.util.IHasModel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class Tomato extends ItemFood implements IHasModel 
{
    public Tomato(String name, int amount, float saturation, boolean isAnimalFood)
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
    
    @Override
    public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced)
    {
    	 if(GuiScreen.isShiftKeyDown()){
    		 tooltip.add(TextFormatting.GRAY + I18n.format("A tomato is a fruit.", 0));
    		 tooltip.add(TextFormatting.GRAY + I18n.format("The confusion arose after the 1890s when the US supreme court named them a vegetable for taxation purposes. A fruit is the edible part of the plant containing seeds, a vegetable is stem, leaf or root.", 0));
         }else{
             tooltip.add(TextFormatting.RED + I18n.format("Press SHIFT for more info", 0));
         }
    }
}