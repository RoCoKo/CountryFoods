package com.countryfoods.blocks;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import com.countryfoods.Main;
import com.countryfoods.init.ModBlocks;
import com.countryfoods.init.ModItems;
import com.countryfoods.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Cheesecake extends BlockBase
{
	int foodlevel;
	float saturation;
	
	public Cheesecake(String name, int foodlevel, float saturation) 
	{
		super(name, Material.CAKE);
		this.foodlevel = foodlevel / 6;
		this.saturation = saturation;
		this.setTickRandomly(true);
		this.setHardness(0.5F);
		this.setSoundType(SoundType.CLOTH);
		this.setCreativeTab(Main.countryfoodstab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BITES, Integer.valueOf(0)));
	}
	
	public static final PropertyInteger BITES = PropertyInteger.create("bites", 0, 6);
    protected static final AxisAlignedBB[] CAKE_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new AxisAlignedBB(0.1875D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new AxisAlignedBB(0.3125D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new AxisAlignedBB(0.4375D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new AxisAlignedBB(0.5625D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new AxisAlignedBB(0.6875D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D), new AxisAlignedBB(0.8125D, 0.0D, 0.0625D, 0.9375D, 0.5D, 0.9375D)};
  
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return CAKE_AABB[((Integer)state.getValue(BITES)).intValue()];
    }

public boolean isFullCube(IBlockState state)
    {
        return false;
    }

public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!worldIn.isRemote)
        {
            return this.eatCake(worldIn, pos, state, playerIn);
        }
        else
        {
            ItemStack itemstack = playerIn.getHeldItem(hand);
            return this.eatCake(worldIn, pos, state, playerIn) || itemstack.isEmpty();
        }
    }

private boolean eatCake(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
{
    if (!player.canEat(false))
    {
        return false;
    }
    else
    {
        player.addStat(StatList.CAKE_SLICES_EATEN);
        player.getFoodStats().addStats(2, 0.1F);
        int i = ((Integer)state.getValue(BITES)).intValue();

        if (i < 6)
        {
            worldIn.setBlockState(pos, state.withProperty(BITES, Integer.valueOf(i + 1)), 3);
        }
        else
        {
            worldIn.setBlockToAir(pos);
        }

        return true;
    }
}

public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
{
    return super.canPlaceBlockAt(worldIn, pos) ? this.canBlockStay(worldIn, pos) : false;
}

public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
{
    if (!this.canBlockStay(worldIn, pos))
    {
        worldIn.setBlockToAir(pos);
    }
}

private boolean canBlockStay(World worldIn, BlockPos pos)
{
    return worldIn.getBlockState(pos.down()).getMaterial().isSolid();
}

public int quantityDropped(Random random)
{
    return 0;
}

public Item getItemDropped(IBlockState state, Random rand, int fortune)
{
    return Items.AIR;
}

public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
{
    return new ItemStack(Items.CAKE);
}

public IBlockState getStateFromMeta(int meta)
{
    return this.getDefaultState().withProperty(BITES, Integer.valueOf(meta));
}

@SideOnly(Side.CLIENT)
public BlockRenderLayer getRenderLayer()
{
    return BlockRenderLayer.CUTOUT;
}

public int getMetaFromState(IBlockState state)
{
    return ((Integer)state.getValue(BITES)).intValue();
}

protected BlockStateContainer createBlockState()
{
    return new BlockStateContainer(this, new IProperty[] {BITES});
}

public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos)
{
    return (7 - ((Integer)blockState.getValue(BITES)).intValue()) * 2;
}

public boolean hasComparatorInputOverride(IBlockState state)
{
    return true;
}

public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
{
    return BlockFaceShape.UNDEFINED;
}

@Override
public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced)
{
	 if(GuiScreen.isShiftKeyDown()){
		 tooltip.add(TextFormatting.GRAY + I18n.format("The American Cheesecake was found in 19th century. ", 0));
     }else{
         tooltip.add(TextFormatting.RED + I18n.format("Press SHIFT for more info", 0));
     }
}
}