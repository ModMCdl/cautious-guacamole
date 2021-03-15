package com.modmcdl.endgameextension;

import com.modmcdl.endgameextension.init.ModBlocks;
import com.modmcdl.endgameextension.init.ModItems;
import com.modmcdl.endgameextension.init.ToolMaterialList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.logging.Logger;

import static com.modmcdl.endgameextension.EndgameExtension.ENDGAME;


@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents
{
    public static final ItemGroup EndGame = ENDGAME;
    public static final Logger LOGGER = EndgameExtension.LOGGER;
    public static final String MODID = EndgameExtension.MODID;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll
                (
                        ModItems.quenched_star = new Item(new Item.Properties().group(EndGame)).setRegistryName(location("quenched_nether_star")),

                       ModItems.wither_axe = new AxeItem(ToolMaterialList.nether_star_shard, -1.0f, 1.0f, new Item.Properties().group(EndGame)).setRegistryName(location("wither_axe")),
                       ModItems.wither_hoe = new HoeItem(ToolMaterialList.nether_star_shard, 9.0f, new Item.Properties().group(EndGame)).setRegistryName(location("wither_hoe")),
                       ModItems.wither_pickaxe = new PickaxeItem(ToolMaterialList.nether_star_shard, -2, 1.2f, new Item.Properties().group(EndGame)).setRegistryName(location("wither_pickaxe")),
                       ModItems.wither_spade = new ShovelItem(ToolMaterialList.nether_star_shard, -1.5f, 1.0f, new Item.Properties().group(EndGame)).setRegistryName(location("wither_shovel")),
                     ModItems.wither_sword = new SwordItem(ToolMaterialList.nether_star_shard, 0, 1.6f, new Item.Properties().group(EndGame)).setRegistryName(location("wither_sword")),


                        ModItems.nether_star_block = new BlockItem(ModBlocks.nether_star_block, new Item.Properties().group(EndGame)).setRegistryName(ModBlocks.nether_star_block.getRegistryName()),
                       ModItems.soul_bricks = new BlockItem(ModBlocks.soul_bricks, new Item.Properties().group(EndGame)).setRegistryName(ModBlocks.soul_bricks.getRegistryName()),
                       ModItems.chiseled_soul_bricks = new BlockItem(ModBlocks.chiseled_soul_bricks, new Item.Properties().group(EndGame)).setRegistryName(ModBlocks.chiseled_soul_bricks.getRegistryName()),
                       ModItems.flower_asphodel = new BlockItem(ModBlocks.flower_asphodel, new Item.Properties().group(EndGame)).setRegistryName(ModBlocks.flower_asphodel.getRegistryName())




        );
   }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
   {
       event.getRegistry().registerAll
          (
                  ModBlocks.nether_star_block = new Block(Block.Properties.create(Material.GLASS).hardnessAndResistance(50.0F, 6442450944F).lightValue(2).sound(SoundType.GLASS)).setRegistryName(location("nether_star_block")),
                       ModBlocks.soul_bricks = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(30F,6000F).sound(SoundType.GROUND)).setRegistryName(location("soul_bricks")),
                     ModBlocks.chiseled_soul_bricks = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.0F).sound(SoundType.GROUND)).setRegistryName(location("chiseled_soul_bricks")),
                        ModBlocks.flower_asphodel = new Block(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("flower_asphodel"))
                );


   }



    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MODID, name);
    }
}
