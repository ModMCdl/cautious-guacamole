package com.modmcdl.endgameextension.items;

import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.util.IHasModel;

import net.minecraft.item.Item;

public class ItemEnvieBase extends Item implements IHasModel
{
	public ItemEnvieBase(String name)
	{
		this.setUnlocalizedName(EndgameExtension.MODID + "." + name);
		this.setRegistryName(name);
		this.setCreativeTab(EndgameExtension.endtab);
	}
	
	@Override
	public void registerModels()
	{
		EndgameExtension.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
