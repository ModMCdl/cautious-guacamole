package com.modmcdl.endgameextension;


import com.modmcdl.endgameextension.init.EndgameExpansion;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
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
	public static final ItemGroup ENDGAME = EndgameExpansion.endgame;


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

