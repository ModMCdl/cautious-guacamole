package com.modmcdl.endgameextention.items;

import com.modmcdl.endgameextention.init.ModItems;

import net.minecraft.item.ItemStack;

public class ItemQuenchedStar extends ItemEnvieBase
{
	public ItemQuenchedStar(String name)
	{
		super(name);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) 
	{
		return true;
	}
}
