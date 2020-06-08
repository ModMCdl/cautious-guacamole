package com.modmcdl.endgameextension.blocks;


import com.modmcdl.endgameextension.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.SoundType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import static com.modmcdl.endgameextension.EndgameExtension.MODID;

public class FlowerAsphodel extends BushBlock
{
	

	protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.625D, 1D, 1D, 15D, 30D, 15D);

	public FlowerAsphodel(String name, Properties properties)
	{
		super(properties.hardnessAndResistance(0.0F).sound(SoundType.PLANT).doesNotBlockMovement());
		this.setRegistryName(MODID, name);
		ModBlocks.BLOCKS.add(this);

	}



	

	
	public VoxelShape getShape(IBlockReader worldIn, BlockState state, BlockPos pos, ISelectionContext context)
    {
		Vec3d vec3d = state.getOffset(worldIn, pos);
		return SHAPE.withOffset(vec3d.x, vec3d.y, vec3d.z);
    }
	
}
