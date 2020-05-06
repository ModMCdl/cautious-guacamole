package com.modmcdl.endgameextension.blocks;

import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.init.ModBlocks;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class FlowerAsphodel extends BushBlock implements IHasModel
{
	
	private static final AxisAlignedBB TALLBOX = new AxisAlignedBB(.0625 * 1, 0, .0625 * 1, .0625 * 15, .0625 * 30, .0625 * 15);
	
	public FlowerAsphodel(String name, Material material)
	{
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(EndgameExtension.endtab);
		this.setSoundType(SoundType.PLANT);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new BlockItem(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		EndgameExtension.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override //Bounding box
	public AxisAlignedBB getBoundingBox(BlockState state, IBlockReader source, BlockPos pos)
	{
		return TALLBOX;
	}
	
	@Nullable
    public AxisAlignedBB getCollisionBoundingBox(BlockState blockState, IBlockReader worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }
	
	public Block.EnumOffsetType getOffsetType()
    {
        return Block.EnumOffsetType.XZ;
    }
	
	public BlockFaceShape getBlockFaceShape(IBlockReader worldIn, BlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.UNDEFINED;
    }
	
}
