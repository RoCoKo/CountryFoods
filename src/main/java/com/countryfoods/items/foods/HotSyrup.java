package com.countryfoods.items.foods;

import java.util.List;
import javax.annotation.Nullable;
import com.countryfoods.Main;
import com.countryfoods.init.ModItems;
import com.countryfoods.util.IHasModel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class HotSyrup extends Item implements IHasModel 
{
	public HotSyrup(String name)
	{
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
    		 tooltip.add(TextFormatting.GRAY + I18n.format("By the way, you are too lazy to read this:", 0));
    		 tooltip.add(TextFormatting.GRAY + I18n.format("87 104 121 32 100 105 100 32 121 111 117 32 119 97 115 116 101 100 32 121 111 117 114 32 116 105 109 101 32 119 105 116 104 32 116 104 105 115 63", 0));
    		 tooltip.add(TextFormatting.GRAY + I18n.format("Tip: It's decimal ;)", 0));
         }else{
             tooltip.add(TextFormatting.RED + I18n.format("Press SHIFT for more info", 0));
         }
    }
}