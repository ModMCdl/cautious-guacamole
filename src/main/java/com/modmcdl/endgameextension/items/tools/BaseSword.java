package com.modmcdl.endgameextension.items.tools;

import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.util.IHasModel;

import net.minecraft.item.SwordItem;


public class BaseSword extends SwordItem implements IHasModel
{

	public BaseSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(EndgameExtension.endtab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		EndgameExtension.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
