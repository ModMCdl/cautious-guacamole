package com.modmcdl.endgameextension;


import com.modmcdl.endgameextension.init.ModBlocks;
import com.modmcdl.endgameextension.init.ModItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import java.util.logging.LogManager;

import java.util.logging.Logger;


@Mod("endgameextension")
public class EndgameExtension {
	//References
	public static EndgameExtension instance;
	public static final String MODID = "endgameextension";
	public static final Logger LOGGER = LogManager.getLogManager().getLogger(MODID);


	public EndgameExtension() {
		instance = this;
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		Logger.getLogger("Setup method registered.");
	}

	private void clientRegistries(final FMLClientSetupEvent event) {
		Logger.getLogger("clientRegistries method registered.");
		RenderTypeLookup.setRenderLayer(ModBlocks.lavender, RenderType.getCutout());

	}
	public static final ItemGroup ENDGAME = new ItemGroup("endgame") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ModItems.quenched_star);
		}

	};
}

