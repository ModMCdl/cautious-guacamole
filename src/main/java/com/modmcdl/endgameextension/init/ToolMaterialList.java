package com.modmcdl.endgameextension.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier
{
    nether_star_shard(8.0F,50F,3124, 10, 18,ModItems.nether_star_shard);
private float attackDamage, efficiency;
private int durability, HarvestLevel, enchantability;
private Item repairMaterial;

    private ToolMaterialList(float attackDamage, float efficiency, int durability, int HarvestLevel, int enchantability, Item repairMaterial) {
        this.attackDamage = attackDamage;
        this.durability = durability;
        this.efficiency = efficiency;
        this.HarvestLevel = HarvestLevel;
        this.repairMaterial = repairMaterial;
        this.enchantability = enchantability;

    }

    @Override
    public int getMaxUses() {
        return this.durability;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.HarvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairMaterial);
    }}