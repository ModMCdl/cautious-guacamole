package com.modmcdl.endgameextention.items.tools;

import com.modmcdl.endgameextention.EndgameExtention;
import com.modmcdl.endgameextention.init.ModItems;
import com.modmcdl.endgameextention.util.IHasModel;

import net.minecraft.item.ItemPickaxe;

public class BasePickaxe extends ItemPickaxe implements IHasModel
{

	public BasePickaxe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(EndgameExtention.endtab);
		setHarvestLevel("pickaxe", 10);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		EndgameExtention.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
