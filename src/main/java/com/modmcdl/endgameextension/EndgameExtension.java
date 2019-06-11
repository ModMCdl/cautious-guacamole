package com.modmcdl.endgameextension;

import com.modmcdl.endgameextension.init.ModBlocks;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.proxies.CommonProxy;
import com.modmcdl.endgameextension.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = EndgameExtension.MODID, name = EndgameExtension.NAME, version = EndgameExtension.VERSION, acceptedMinecraftVersions = EndgameExtension.ACCEPTEDVERSIONS)
public class EndgameExtension 
{
	//References
	public static final String MODID = "endgameextension";
	public static final String NAME = "Endgame Extension";
	public static final String VERSION = "0.1.2";
	public static final String ACCEPTEDVERSIONS = "[1.12.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.modmcdl.endgameextension.proxies.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.modmcdl.endgameextension.proxies.CommonProxy";
	
	
	public static final CreativeTabs endtab = (new CreativeTabs("endtab")
			{
				@Override
				public ItemStack getTabIconItem()
				{
					return new ItemStack(ModItems.QUENCHED_STAR);
				}
				
				@Override
				public boolean hasSearchBar()
				{
					return false;
				}
			});
	
	//Main
	@Instance
	public static EndgameExtension instance;
	
	//Proxies
	@SidedProxy(clientSide = EndgameExtension.CLIENT_PROXY_CLASS, serverSide = EndgameExtension.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//Initialization
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries(event);
	}
	public void init(FMLInitializationEvent event)
	{
		
	}
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("We're in the Endgame now... [Endgame Expansion Loaded].");
	}
	
	//ServerInitialization
	public void serverInit(FMLServerStartingEvent event)
	{
		System.out.println("We're in the Endgame now... [Endgame Expansion Loaded].");
	}
}
