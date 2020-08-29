package com.modmcdl.endgameextension;

import com.modmcdl.endgameextension.init.EndgameExpansion;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    public static final ItemGroup endgame = EndgameExpansion.endgame;
    public static EndgameExtension instance;
    public static final String modid = "endgameextension";
    public static final String NAME = "Endgame Extension";
    public static final String VERSION = "2.0.0";
    public static final String ACCEPTEDVERSIONS = "[1.14.4]";
    public static final Logger Logger = LogManager.getLogger(modid);

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll
                (
                        ModItems.QUENCHED_STAR = new Item(new Item.Properties().group(endgame)).setRegistryName(location("quenched_star")));
        ModItems.NETHER_STAR_SHARD = new Item(new Item.Properties().group(endgame)).setRegistryName(location("nether_star_shard"));

        ModItems.WITHER_AXE = new AxeItem(ToolMaterialList.nether_star_shard, -1.0f, 1.0f, new Item.Properties().group(endgame)).setRegistryName(location("wither_axe"));
        ModItems.WITHER_HOE = new HoeItem(ToolMaterialList.nether_star_shard, 9.0f, new Item.Properties().group(endgame)).setRegistryName(location("wither_hoe"));
        ModItems.WITHER_PICKAXE = new PickaxeItem(ToolMaterialList.nether_star_shard, -2, 1.2f, new Item.Properties().group(endgame)).setRegistryName(location("wither_pickaxe"));
        ModItems.WITHER_SPADE = new ShovelItem(ToolMaterialList.nether_star_shard, -1.5f, 1.0f, new Item.Properties().group(endgame)).setRegistryName(location("wither_shovel"));
        ModItems.WITHER_SWORD = new SwordItem(ToolMaterialList.nether_star_shard, 0, 1.6f, new Item.Properties().group(endgame)).setRegistryName(location("wither_sword"));

        ModItems.FLOWER_ASPHODEL = new BlockItem(ModBlocks.FLOWER_ASPHODEL, new Item.Properties().group(endgame)).setRegistryName(ModBlocks.FLOWER_ASPHODEL.getRegistryName());
        ModItems.CHISELED_SOUL_BRICKS = new BlockItem(ModBlocks.CHISELED_SOUL_BRICKS, new Item.Properties().group(endgame)).setRegistryName(ModBlocks.CHISELED_SOUL_BRICKS.getRegistryName());
        ModItems.NETHER_STAR_BLOCK = new BlockItem(ModBlocks.NETHER_STAR_BLOCK, new Item.Properties().group(endgame)).setRegistryName(ModBlocks.NETHER_STAR_BLOCK.getRegistryName());
        ModItems.SOUL_BRICKS = new BlockItem(ModBlocks.SOUL_BRICKS, new Item.Properties().group(endgame)).setRegistryName(ModBlocks.SOUL_BRICKS.getRegistryName());




        Logger.info("Items registered.");
    }
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll
                (

                        ModBlocks.FLOWER_ASPHODEL = new Block(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).sound(SoundType.PLANT)).setRegistryName(location("flower_asphodel")));
        ModBlocks.CHISELED_SOUL_BRICKS = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.0F).sound(SoundType.STONE)).setRegistryName(location("chiseled_soul_bricks"));
        ModBlocks.NETHER_STAR_BLOCK = new Block(Block.Properties.create(Material.GLASS).hardnessAndResistance(50.0F, 6442450944F).sound(SoundType.GLASS).lightValue(2)).setRegistryName(location("nether_star_block"));
        ModBlocks.SOUL_BRICKS = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(30F,6000F).sound(SoundType.STONE).harvestLevel(10)).setRegistryName(location("soul_bricks"));

        ;
        Logger.info("Blocks registered.");
    }
    private static ResourceLocation location(String name) {
        return new ResourceLocation(modid, name);
    }

}