package com.modmcdl.endgameextention;

import com.modmcdl.endgameextention.init.ModBlocks;
import com.modmcdl.endgameextention.init.ModItems;
import com.modmcdl.endgameextention.proxies.CommonProxy;
import com.modmcdl.endgameextention.util.handlers.RegistryHandler;

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

@Mod(modid = EndgameExtention.MODID, name = EndgameExtention.NAME, version = EndgameExtention.VERSION, acceptedMinecraftVersions = EndgameExtention.ACCEPTEDVERSIONS)
public class EndgameExtention 
{
	//References
	public static final String MODID = "endgameextention";
	public static final String NAME = "Endgame Extention";
	public static final String VERSION = "0.0.1";
	public static final String ACCEPTEDVERSIONS = "[1.12.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.modmcdl.endgameextention.proxies.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.modmcdl.endgameextention.proxies.CommonProxy";
	
	
	public static final CreativeTabs endtab = (new CreativeTabs("endtab")
			{
				@Override
				public ItemStack getTabIconItem()
				{
					return new ItemStack(ModBlocks.ASPHODEL);
				}
				
				@Override
				public boolean hasSearchBar()
				{
					return false;
				}
			});
	
	//Main
	@Instance
	public static EndgameExtention instance;
	
	//Proxies
	@SidedProxy(clientSide = EndgameExtention.CLIENT_PROXY_CLASS, serverSide = EndgameExtention.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//Initialization
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries(event);
		RegistryHandler.otherRegistries();
	}
	public void init(FMLInitializationEvent event)
	{
		
	}
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("This is the endgame! [Endgame Extention Loaded].");
	}
	
	//ServerInitialization
	public void serverInit(FMLServerStartingEvent event)
	{
		System.out.println("This is the endgame! [Endgame Extention Loaded].");
	}
}
