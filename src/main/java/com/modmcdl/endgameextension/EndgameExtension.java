package com.modmcdl.endgameextension;


import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.init.ToolMaterialList;
import net.minecraft.item.*;
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

		public EndgameExtension()
		{
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
							ModItems.WITHER_AXE = new AxeItem(ToolMaterialList.nether_star_shard, -1.0f, 1.0f, new Item.Properties().group(EndgameExtension)).setRegestryName(location("wither_axe")),
							ModItems.WITHER_HOE = new HoeItem(ToolMaterialList.nether_star_shard, 9.0f, new Item.Properties().group(EndgameExtension)).setRegestryName(location("wither_hoe")),
							ModItems.WITHER_PICKAXE = new PickaxeItem(ToolMaterialList.nether_star_shard, -2.0f, 1.2f, new Item.Properties().group(EndgameExtension)).setRegestryName(location("wither_pickaxe")),
							ModItems.WITHER_SPADE = new ShovelItem(ToolMaterialList.nether_star_shard, -1.5f, 1.0f, new Item.Properties().group(EndgameExtension)).setRegestryName(location("wither_shovel")),
							ModItems.WITHER_SWORD = new SwordItem(ToolMaterialList.nether_star_shard, 0.0f, 1.6f, new Item.Properties().group(EndgameExtension)).setRegestryName(location("wither_sword"))



					);
			Logger.info("Items registered.");
		}

		private static ResourceLocation location(String name) {
			return new ResourceLocation(modid, name);
		}

	}
}