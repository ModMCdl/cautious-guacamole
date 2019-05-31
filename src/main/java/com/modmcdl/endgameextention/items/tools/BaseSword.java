package com.modmcdl.endgameextention.items.tools;

import com.modmcdl.endgameextention.EndgameExtention;
import com.modmcdl.endgameextention.init.ModItems;
import com.modmcdl.endgameextention.util.IHasModel;

import net.minecraft.item.ItemSword;


public class BaseSword extends ItemSword implements IHasModel
{

	public BaseSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(EndgameExtention.endtab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		EndgameExtention.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
