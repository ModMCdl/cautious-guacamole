package com.modmcdl.envie;

import com.modmcdl.envie.init.ModBlocks;
import com.modmcdl.envie.init.ModItems;
import com.modmcdl.envie.proxies.CommonProxy;
import com.modmcdl.envie.util.handlers.RegistryHandler;

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

@Mod(modid = EnvieMod.MODID, name = EnvieMod.NAME, version = EnvieMod.VERSION, acceptedMinecraftVersions = EnvieMod.ACCEPTEDVERSIONS)
public class EnvieMod 
{
	//References
	public static final String MODID = "envie";
	public static final String NAME = "Envie";
	public static final String VERSION = "0.0.1";
	public static final String ACCEPTEDVERSIONS = "[1.12.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.modmcdl.envie.proxies.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "com.modmcdl.envie.proxies.CommonProxy";
	
	
	public static final CreativeTabs envietab = (new CreativeTabs("envietab")
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
	public static EnvieMod instance;
	
	//Proxies
	@SidedProxy(clientSide = EnvieMod.CLIENT_PROXY_CLASS, serverSide = EnvieMod.COMMON_PROXY_CLASS)
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
		System.out.println("Envie mod loaded.");
	}
	
	//ServerInitialization
	public void serverInit(FMLServerStartingEvent event)
	{
		System.out.println("Envie mod loaded.");
	}
}
