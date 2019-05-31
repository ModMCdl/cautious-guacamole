package com.modmcdl.endgameextention.items;

import com.modmcdl.endgameextention.EndgameExtention;
import com.modmcdl.endgameextention.util.IHasModel;

import net.minecraft.item.Item;

public class ItemEnvieBase extends Item implements IHasModel
{
	public ItemEnvieBase(String name)
	{
		this.setUnlocalizedName(EndgameExtention.MODID + "." + name);
		this.setRegistryName(name);
		this.setCreativeTab(EndgameExtention.endtab);
	}
	
	@Override
	public void registerModels()
	{
		EndgameExtention.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
