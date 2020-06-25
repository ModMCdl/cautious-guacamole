package com.modmcdl.endgameextension.init;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class EndgameExtensionTabs {



    public static ItemGroup blocks;
    public static ItemGroup items;
    public static ItemGroup tools;


    static {

        blocks = new EndgameExtensionTab("endgame:blocks") {

            @Override
            @OnlyIn(Dist.CLIENT)
            public ItemStack createIcon() {
                Block iconBlock = ModBlocks.NETHER_STAR_BLOCK;
                if (iconBlock != null) {
                    return new ItemStack(iconBlock);
                } else {
                    return new ItemStack(Blocks.STONE);
                }
            }
        };


        items = new EndgameExtensionTab("bluepower:items") {

            @Override
            @OnlyIn(Dist.CLIENT)
            public ItemStack createIcon() {

                Item iconItem = ModItems.QUENCHED_STAR;
                if (iconItem != null) {
                    return new ItemStack(ModItems.QUENCHED_STAR);
                } else {
                    return new ItemStack(Items.DIAMOND);
                }
            }
        };

        tools = new EndgameExtensionTab("endgameextension:tools") {

            @Override
            @OnlyIn(Dist.CLIENT)
            public ItemStack createIcon() {

                Item iconItem = ModItems.WITHER_AXE;
                if (iconItem != null) {
                    return new ItemStack(ModItems.WITHER_AXE);
                } else {
                    return new ItemStack(Items.DIAMOND_PICKAXE);
                }
            }
        };

    }

    private static abstract class EndgameExtensionTab extends ItemGroup {

        private boolean searchbar = false;

        public EndgameExtensionTab(String label) {

            super(label);
        }

        public EndgameExtensionTab(String label, boolean searchbar) {

            this(label);
            this.searchbar = searchbar;
        }

        @Override
        public boolean hasSearchBar() {

            return searchbar;
        }

        @Override
        @OnlyIn(Dist.CLIENT)
        public String getBackgroundImageName() {

            return searchbar ? "bp_search.png" : super.getBackgroundImageName();
        }

        @Override
        public int getSearchbarWidth() {

            return 62;
        }

    }
}