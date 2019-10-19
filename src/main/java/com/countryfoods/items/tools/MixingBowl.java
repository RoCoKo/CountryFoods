package com.countryfoods.items.tools;

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

public class MixingBowl extends Item implements IHasModel 
{
	public MixingBowl(String name)
	{
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.countryfoodstab);
        setMaxDamage(1);
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
        return itemStack.getItemDamage() < itemStack.getMaxDamage() ? new ItemStack(itemStack.getItem(), 1) : ItemStack.EMPTY;
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
    		 tooltip.add(TextFormatting.GRAY + I18n.format("The more you take, the more you leave behind.", 0));
    		 tooltip.add(TextFormatting.GRAY + I18n.format("What am I?", 0));
    		 tooltip.add(TextFormatting.GRAY + I18n.format("- Footseps.", 0));
         }else{
             tooltip.add(TextFormatting.RED + I18n.format("Press SHIFT for more info", 0));
         }
    }
}