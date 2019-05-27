package com.modmcdl.envie.items;

import com.modmcdl.envie.init.ModItems;

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
