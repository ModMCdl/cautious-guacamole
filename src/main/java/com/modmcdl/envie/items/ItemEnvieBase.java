package com.modmcdl.envie.items;

import com.modmcdl.envie.EnvieMod;
import com.modmcdl.envie.util.IHasModel;

import net.minecraft.item.Item;

public class ItemEnvieBase extends Item implements IHasModel
{
	public ItemEnvieBase(String name)
	{
		this.setUnlocalizedName(EnvieMod.MODID + "." + name);
		this.setRegistryName(name);
		this.setCreativeTab(EnvieMod.envietab);
	}
	
	@Override
	public void registerModels()
	{
		EnvieMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
