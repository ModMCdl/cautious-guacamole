package com.modmcdl.endgameextension.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EndgameExpansion extends ItemGroup
{
    public static final ItemGroup endgame = EndgameExpansion.endgame;

    public EndgameExpansion()
    {
        super("ENDGAME");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ModItems.QUENCHED_STAR);
    }
}