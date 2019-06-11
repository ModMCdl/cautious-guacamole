package com.modmcdl.endgameextension.util.handlers;

import com.modmcdl.endgameextension.init.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;

@EventBusSubscriber
public class WorldEventHandler 
{
	
	//Notice on world join
	@SubscribeEvent
	public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
	{
		event.player.sendMessage(new TextComponentString("\u00A76[Endgame Extension]: \u00A7eThis mod is still being developed. Help us and report any bugs you find!"));
	}
	
	
	//Convert Nether Star to Quenched Star
	@SubscribeEvent
    public static void onWorldTick(WorldTickEvent event)
    {
        World world = event.world;
        
        for(Entity entities : world.loadedEntityList)
        {
            if(entities instanceof EntityItem)
            {
                EntityItem item = (EntityItem) entities;
                
                if(item.getItem().getItem() == Items.NETHER_STAR)
                {
                    if(world.getBlockState(item.getPosition()).getMaterial() == Material.WATER)
                    {
                        int count = item.getItem().getCount();
                        
                        item.setItem(new ItemStack(ModItems.QUENCHED_STAR, count));
                        
                        //TODO playsound
                    }
                }
            }
        }
    }
	
}
