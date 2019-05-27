package com.modmcdl.envie.init;

import java.util.ArrayList;
import java.util.List;

import com.modmcdl.envie.blocks.BlockNetherStar;
import com.modmcdl.envie.blocks.FlowerAsphodel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//-----Block List-----//
	
	public static final Block ASPHODEL = new FlowerAsphodel("flower_asphodel", Material.PLANTS);
	public static final Block NETHER_STAR_BLOCK = new BlockNetherStar("block_of_nether_star", Material.GLASS);
	
	
}
