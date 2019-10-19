package com.countryfoods.blocks;

import com.countryfoods.Main;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SaltBlock extends CustomBlockFalling 
{
	public SaltBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.SAND);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
	}
}