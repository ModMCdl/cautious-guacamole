package com.modmcdl.endgameextension.items.tools;

import com.google.common.collect.Sets;
import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;

import java.util.Set;



public class WitherAxe extends ToolItem implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet( Blocks.BOOKSHELF, Blocks.OAK_WOOD, Blocks.BIRCH_WOOD, Blocks.CHEST, Blocks.PUMPKIN, Blocks.CARVED_PUMPKIN, Blocks.MELON, Blocks.LADDER,  Blocks.OAK_PRESSURE_PLATE);
	
	public WitherAxe(String name, ToolMaterial material)
	{
		super(material, EFFECTIVE_ON);
		setTranslationKey(name);
		setRegistryName(name);
		.group(EndgameExtension.;
		
		this.attackSpeed = -3.0F;
		this.attackDamage = 10.0F;
		
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state)
	{
		Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
	}
	
	@Override
	public void registerModels() 
	{
		EndgameExtension.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
