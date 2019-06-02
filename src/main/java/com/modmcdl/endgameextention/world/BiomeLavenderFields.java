package com.modmcdl.endgameextention.world;

import java.util.Random;

import com.modmcdl.endgameextention.init.ModBlocks;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeLavenderFields extends Biome
{
	
	public BiomeLavenderFields() 
	{
		super(new BiomeProperties("LavenderFields").setBaseHeight(0.025F).setHeightVariation(0.01F).setTemperature(0.8F).setRainfall(0.3F).setWaterColor(2993407));
		
		topBlock = ModBlocks.LAVENDER_PLANT.getDefaultState();
		fillerBlock = Blocks.GRASS.getDefaultState();
		
		//CreatureSpawns
		this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityHorse.class, 5, 1, 3));
		
		//Decorators
        this.decorator.treesPerChunk = 1;
        this.decorator.extraTreeChance = 0;
        this.decorator.generateFalls = false; //No surface level water/lava pools will generate
	}
	
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
        return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE);
    }

}
