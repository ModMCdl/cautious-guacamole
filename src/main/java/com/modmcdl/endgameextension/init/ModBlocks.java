package com.modmcdl.endgameextension.init;

import java.util.ArrayList;
import java.util.List;

import com.modmcdl.endgameextension.blocks.BlockNetherStar;
import com.modmcdl.endgameextension.blocks.BlockSoulBricks;
import com.modmcdl.endgameextension.blocks.FlowerAsphodel;
import com.modmcdl.endgameextension.blocks.FlowerWitherRose;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//-----Block List-----//
	
	public static final Block ASPHODEL = new FlowerAsphodel("flower_asphodel", Material.PLANTS);
	public static final Block WITHER_ROSE = new FlowerWitherRose("wither_rose", Material.PLANTS);
	public static final Block NETHER_STAR_BLOCK = new BlockNetherStar("block_of_nether_star", Material.GLASS);
	
	public static final Block SOUL_BRICKS = new BlockSoulBricks("soul_bricks", Material.ROCK);
	public static final Block CHISELED_SOUL_BRUCKS = new BlockSoulBricks("chiseled_soul_bricks", Material.ROCK);
	
}
