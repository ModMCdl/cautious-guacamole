package com.modmcdl.endgameextention.init;

import java.util.ArrayList;
import java.util.List;

import com.modmcdl.endgameextention.blocks.BlockBoquet;
import com.modmcdl.endgameextention.blocks.BlockChiseledPurpur;
import com.modmcdl.endgameextention.blocks.BlockNetherStar;
import com.modmcdl.endgameextention.blocks.BlockSoulBricks;
import com.modmcdl.endgameextention.blocks.FlowerAsphodel;
import com.modmcdl.endgameextention.blocks.FlowerLavender;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//-----Block List-----//
	
	public static final Block ASPHODEL = new FlowerAsphodel("flower_asphodel", Material.PLANTS);
	public static final Block LAVENDER_PLANT = new FlowerLavender("lavender_plant", Material.PLANTS);
	public static final Block BOQUET = new BlockBoquet("boquet", Material.ROCK);
	public static final Block NETHER_STAR_BLOCK = new BlockNetherStar("block_of_nether_star", Material.GLASS);
	public static final Block CHISELED_PURPUR_BLOCK = new BlockChiseledPurpur("chiseled_purpur_block", Material.ROCK);
	public static final Block SMOOTH_PURPUR_BLOCK = new BlockChiseledPurpur("smooth_purpur_block", Material.ROCK);
	
	public static final Block SOUL_BRICKS = new BlockSoulBricks("soul_bricks", Material.ROCK);
	
}
