package com.modmcdl.endgameextension.init;

import com.modmcdl.endgameextension.items.ItemQuenchedStar;
import com.modmcdl.endgameextension.items.ItemStarShard;
import com.modmcdl.endgameextension.items.tools.*;
import com.modmcdl.endgameextension.util.handlers.MaterialHandler;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//-----Item List-----//
	public static final Item QUENCHED_STAR = new ItemQuenchedStar("quenched_nether_star");
	public static final Item NETHER_STAR_SHARD = new ItemStarShard("nether_star_shard");
	
	//-----Tools-----//
	
	public static  Item WITHER_PICKAXE = new WitherPickaxe("wither_pickaxe", MaterialHandler.WITHER);
	public static  Item WITHER_SWORD = new WitherSword("wither_sword", MaterialHandler.WITHER);
	public static  Item WITHER_AXE = new WitherAxe("wither_axe", MaterialHandler.WITHER);
	public static  Item WITHER_HOE = new WitherHoe("wither_hoe", MaterialHandler.WITHER);
	public static  Item WITHER_SPADE = new WitherShovel("wither_shovel", MaterialHandler.WITHER);
	
}