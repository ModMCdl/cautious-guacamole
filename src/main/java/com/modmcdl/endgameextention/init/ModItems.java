package com.modmcdl.endgameextention.init;

import java.util.ArrayList;
import java.util.List;

import com.modmcdl.endgameextention.items.ItemPetal;
import com.modmcdl.endgameextention.items.ItemQuenchedStar;
import com.modmcdl.endgameextention.items.tools.BasePickaxe;
import com.modmcdl.endgameextention.items.tools.BaseSword;
import com.modmcdl.endgameextention.util.handlers.MaterialHandler;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//-----Item List-----//
	public static final Item PETAL = new ItemPetal("petal");
	public static final Item QUENCHED_STAR = new ItemQuenchedStar("quenched_nether_star");
	
	//-----Tools-----//
	
	public static final Item WITHER_PICKAXE = new BasePickaxe("wither_pickaxe", MaterialHandler.WITHER);
	public static final Item WITHER_SWORD = new BaseSword("wither_sword", MaterialHandler.WITHER);
	
}