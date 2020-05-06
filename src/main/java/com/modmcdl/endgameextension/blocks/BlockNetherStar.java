package com.modmcdl.endgameextension.blocks;

import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.init.ModBlocks;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nonnull;

public class BlockNetherStar extends Block implements IHasModel
{
	public BlockNetherStar(String name, Material material)
	{
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(50.0F);
		this.setResistance(6442450944F);
		this.setLightLevel(0.2F);

		this.setCreativeTab(EndgameExtension.endtab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new BlockItem(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		EndgameExtension.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
	public boolean canEntityDestroy(@Nonnull BlockState state, @Nonnull IBlockReader world, @Nonnull BlockPos pos, @Nonnull Entity entity)
	{
		return !(entity instanceof WitherEntity) && !(entity instanceof WitherSkullEntity);
	}
	
	@Override
	public boolean isBeaconBase(IBlockReader worldObj, BlockPos pos, BlockPos beacon)
	{
		return true;
	}


}
