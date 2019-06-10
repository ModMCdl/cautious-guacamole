package com.modmcdl.endgameextension.init;

import java.util.ArrayList;
import java.util.List;

import com.modmcdl.endgameextension.items.ItemEnvieBase;
import com.modmcdl.endgameextension.items.ItemQuenchedStar;
import com.modmcdl.endgameextension.items.ItemStarShard;
import com.modmcdl.endgameextension.items.tools.BaseAxe;
import com.modmcdl.endgameextension.items.tools.BaseHoe;
import com.modmcdl.endgameextension.items.tools.BasePickaxe;
import com.modmcdl.endgameextension.items.tools.BaseSpade;
import com.modmcdl.endgameextension.items.tools.BaseSword;
import com.modmcdl.endgameextension.util.handlers.MaterialHandler;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//-----Item List-----//
	public static final Item QUENCHED_STAR = new ItemQuenchedStar("quenched_nether_star");
	public static final Item NETHER_STAR_SHARD = new ItemStarShard("nether_star_shard");
	
	//-----Tools-----//
	
	public static final Item WITHER_PICKAXE = new BasePickaxe("wither_pickaxe", MaterialHandler.WITHER);
	public static final Item WITHER_SWORD = new BaseSword("wither_sword", MaterialHandler.WITHER);
	public static final Item WITHER_AXE = new BaseAxe("wither_axe", MaterialHandler.WITHER);
	public static final Item WITHER_HOE = new BaseHoe("wither_hoe", MaterialHandler.WITHER);
	public static final Item WITHER_SPADE = new BaseSpade("wither_shovel", MaterialHandler.WITHER);
	
}