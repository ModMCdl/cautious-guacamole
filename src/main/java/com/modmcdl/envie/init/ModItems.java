package com.modmcdl.envie.init;

import java.util.ArrayList;
import java.util.List;

import com.modmcdl.envie.items.ItemPetal;
import com.modmcdl.envie.items.ItemQuenchedStar;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//-----Item List-----//
	public static final Item PETAL = new ItemPetal("petal");
	public static final Item QUENCHED_STAR = new ItemQuenchedStar("quenched_nether_star");
	
}