package com.modmcdl.endgameextention.init;

import com.modmcdl.endgameextention.world.BiomeLavenderFields;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes 
{
	
	public static final Biome LAVENDER = new BiomeLavenderFields();
	
	public static void registerBiomes()
	{
		initBiome(LAVENDER, "LavenderFields", BiomeType.WARM, Type.LUSH, Type.PLAINS);
	}
	
	public static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		
		return biome;
	}
}
