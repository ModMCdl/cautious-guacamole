package com.modmcdl.endgameextension.blocks;


import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.init.EndgameExtensionTab;
import com.modmcdl.endgameextension.init.ModBlocks;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;




public class BlockSoulBricks extends Block implements IHasModel
{
	public BlockSoulBricks(String name, Material material)
	{
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(30F);
		this.setResistance(6000F);
		this.setHarvestLevel("pickaxe", 10);

		super(properties.group(EndgameExtensionTab.items));


		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new BlockItem(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		EndgameExtension.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}	
	
}
