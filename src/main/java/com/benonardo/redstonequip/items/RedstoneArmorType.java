package com.benonardo.redstonequip.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public enum RedstoneArmorType implements ArmorMaterial {

    REDSTONE("redstone", 25, new int[] { 2, 5, 6, 2 }, 18,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, Ingredient.ofItems(Items.REDSTONE), 0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 14};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Ingredient repairMateral;
    private final int knockbackResistance;

    RedstoneArmorType(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                          SoundEvent soundEvent, float toughness, Ingredient repairMateral, int knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMateral = repairMateral;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return this.MAX_DAMAGE_ARRAY[slot.getEntitySlotId()] * this.maxDamageFactor;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.damageReductionAmountArray[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMateral;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
