package com.modmcdl.endgameextension.items.tools;

import com.modmcdl.endgameextension.EndgameExtension;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.util.IHasModel;

import net.minecraft.item.HoeItem;

public class WitherHoe extends HoeItem implements IHasModel
{
	public WitherHoe(String name, ToolMaterial material)
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
