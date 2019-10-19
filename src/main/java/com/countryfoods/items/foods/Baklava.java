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

public class Baklava extends ItemFood implements IHasModel 
{
	public Baklava(String name, int amount, float saturation, boolean isAnimalFood) 
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
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
    @Override
    public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced)
    {
    	 if(GuiScreen.isShiftKeyDown()){
    		 tooltip.add(TextFormatting.GRAY + I18n.format("The Baklava was found in 15th century, in Ottoman Empire.", 0));
         }else{
             tooltip.add(TextFormatting.RED + I18n.format("Press SHIFT for more info", 0));
         }
    }
}