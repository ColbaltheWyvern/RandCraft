package com.colbaltstudios.randcraft.util;

import com.colbaltstudios.randcraft.RandCraftMod;
import com.colbaltstudios.randcraft.item.RandItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum RandItemTiers {
    ;

    public enum ItemTiers implements IItemTier {

        RUBY(8, 2000, 12, 15, 8,
                Ingredient.fromStacks(new ItemStack(RandItems.RUBY.get()))),

        COPPER(3, 1000, 6, 6, 5,
             Ingredient.fromStacks(new ItemStack(RandItems.COPPER_INGOT.get())));

        public final int harvestLevel;
        public final int maxUses;
        public final float efficiency;
        public final float attackDamage;
        public final int enchantability;
        public final Ingredient repairMaterial;

        ItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int entchantability, Ingredient repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = entchantability;
            this.repairMaterial = repairMaterial;
        }

        @Override
        public int getMaxUses() {
            return maxUses;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }
    }

    public enum ArmorMaterial implements IArmorMaterial {

        RUBY(1500, new int[] {12, 25, 18, 12}, 100,
                SoundEvents.BLOCK_BEACON_ACTIVATE,
                Ingredient.fromStacks(new ItemStack(RandItems.RUBY.get())),
                RandCraftMod.MOD_ID + ":ruby", 3.2f, 5.8f);

        private final int durability;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final Ingredient repairMaterial;
        private final String name;
        private final float toughness;
        private final float knockbackResistance;

        ArmorMaterial(int durability, int[] damageReductionAmountArray, int enchantability,
                      SoundEvent soundEvent, Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
            this.durability = durability;
            this.damageReductionAmountArray = damageReductionAmountArray;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.repairMaterial = repairMaterial;
            this.name = name;
            this.toughness = toughness;
            this.knockbackResistance = knockbackResistance;
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return durability;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public float getToughness() {
            return toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return knockbackResistance;
        }
    }

}

