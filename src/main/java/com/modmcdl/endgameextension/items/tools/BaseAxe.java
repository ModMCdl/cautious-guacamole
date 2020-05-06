package com.modmcdl.endgameextension.items.tools;

import com.google.common.collect.Sets;
import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;

import java.util.Set;

public class BaseAxe extends ToolItem implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	
	public BaseAxe(String name, ToolMaterial material) 
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(EndgameExtension.endtab);
		
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
