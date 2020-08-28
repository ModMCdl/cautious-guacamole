package com.modmcdl.endgameextension;


import com.modmcdl.endgameextension.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("endgameextension")
public class EndgameExtension {
	//References
	public static EndgameExtension instance;
	public static final String modid = "endgameextension";
	public static final String NAME = "Endgame Extension";
	public static final String VERSION = "2.0.0";
	public static final String ACCEPTEDVERSIONS = "[1.14.4]";
	public static final Logger Logger = LogManager.getLogger(modid);

	public static final ItemGroup ITEM_GROUP = new EndgameExtension() {

		public EndgameExtension() {
			instance = this;
			FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
			FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
			MinecraftForge.EVENT_BUS.register(this);
		}

		private void setup(final FMLCommonSetupEvent event) {
			Logger.info("Setup method registered.");
		}

		private void clientRegistries(final FMLClientSetupEvent event) {
			Logger.info("clientRegistries method registered.");
		}

	};

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll
					(
							ModItems.WITHER_AXE = new ItemAxe
					);
			Logger.info("Items registered.");
		}

		private static ResourceLocation location(String name) {
			return new ResourceLocation(modid, name);
		}

	}
}