package com.modmcdl.endgameextension.util.handlers;

import com.modmcdl.endgameextension.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.server.command.TextComponentHelper;

import java.util.UUID;


@EventBusSubscriber
public class WorldEventHandler
{


	//Notice on world join
	@SubscribeEvent
	public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
	{
        PlayerEntity player = event.getPlayer();
            TextComponent message = TextComponentHelper.createComponentTranslation(player, "message.welcome", player.getDisplayName());
            message.mergeStyle(TextFormatting.GOLD);
            player.sendMessage(message, player.getUniqueID());
	}

	//Convert Nether Star to Quenched Star
        static Entity entity;

        @SubscribeEvent
        static void onItemThrown(ItemTossEvent event)
        {
            entity = event.getEntity();
        }

        @SubscribeEvent
        static void onItemEntityTick(TickEvent.WorldTickEvent event)
        {
            World world = event.world;

            if(entity != null)
            {
                for(Entity entities : world.getEntitiesWithinAABB(Entity.class, entity.getBoundingBox().expand(5d, 5d, 5d)))
                {
                    if(entities instanceof ItemEntity)
                    {
                        ItemEntity item = (ItemEntity) entities;

                        if(item.getItem().getItem() == Items.NETHER_STAR)
                        {
                            if(world.getBlockState(new BlockPos(item.getPosition())).getMaterial() == Material.WATER)
                            {
                                int count = item.getItem().getCount();


                                    item.setItem(new ItemStack(ModItems.quenched_star, count));
                                }
                            }
                        }
                    }
                }
            }
        }



//TODO playsound


