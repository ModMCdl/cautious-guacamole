package com.modmcdl.endgameextension.util.handlers;

import com.modmcdl.endgameextension.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;


@EventBusSubscriber
public class WorldEventHandler 
{

	//Notice on world join
	@SubscribeEvent
	public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
	{
		event.player.sendMessage(new StringTextComponent("\u00A76[Endgame Extension]: \u00A7eThis mod is still being developed. Help us and report any bugs you find!"));
	}
	
	
	//Convert Nether Star to Quenched Star
	@SubscribeEvent
    public static void onWorldTick(TickEvent.WorldTickEvent event)
    {
        World world = event.world;
        
        for(Entity entities : world.loadedTileEntityList)
        {
            if(entities instanceof ItemEntity)
            {
                ItemEntity item = (ItemEntity) entities;
                
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
