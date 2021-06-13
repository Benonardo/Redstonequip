package com.benonardo.redstonequip.init;

import com.benonardo.redstonequip.blocks.RedstoneBlock;
import com.benonardo.redstonequip.blocks.RedstoneBlockItem;
import com.benonardo.redstonequip.blocks.RedstoneMetalBlock;
import com.benonardo.redstonequip.items.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RedstoneRegistries {

    public static final RedstoneBaseItem REDSTONE_INGOT = new RedstoneBaseItem("redstone_ingot");

    public static final RedstoneSword REDSTONE_SWORD = new RedstoneSword("redstone_sword");
    public static final RedstonePickaxe REDSTONE_PICKAXE = new RedstonePickaxe("redstone_pickaxe");
    public static final RedstoneAxe REDSTONE_AXE = new RedstoneAxe("redstone_axe");
    public static final RedstoneShovel REDSTONE_SHOVEL = new RedstoneShovel("redstone_shovel");
    public static final RedstoneHoe REDSTONE_HOE = new RedstoneHoe("redstone_hoe");
    public static final RedstoneShears REDSTONE_SHEARS = new RedstoneShears("redstone_shears");

    public static final RedstoneArmorItem REDSTONE_HELMET = new RedstoneArmorItem(EquipmentSlot.HEAD, "redstone_helmet");
    public static final RedstoneArmorItem REDSTONE_CHESTPLATE = new RedstoneArmorItem(EquipmentSlot.CHEST, "redstone_chestplate");
    public static final RedstoneArmorItem REDSTONE_LEGGINGS = new RedstoneArmorItem(EquipmentSlot.LEGS, "redstone_leggings");
    public static final RedstoneArmorItem REDSTONE_BOOTS = new RedstoneArmorItem(EquipmentSlot.FEET, "redstone_boots");

    public static final RedstoneMetalBlock REDSTONE_METAL_BLOCK = new RedstoneMetalBlock("redstone_metal_block");
    public static final RedstoneBlockItem REDSTONE_METAL_BLOCK_ITEM = new RedstoneBlockItem(REDSTONE_METAL_BLOCK);

    public static void registerAll() {
        registerItem(REDSTONE_INGOT);
        registerItem(REDSTONE_SWORD);
        registerItem(REDSTONE_PICKAXE);
        registerItem(REDSTONE_AXE);
        registerItem(REDSTONE_SHOVEL);
        registerItem(REDSTONE_HOE);
        registerItem(REDSTONE_SHEARS);
        registerItem(REDSTONE_HELMET);
        registerItem(REDSTONE_CHESTPLATE);
        registerItem(REDSTONE_LEGGINGS);
        registerItem(REDSTONE_BOOTS);
        registerItem(REDSTONE_METAL_BLOCK_ITEM);

        registerBlock(REDSTONE_METAL_BLOCK);
    }

    public static void registerItem(RedstoneItem item) {
        Registry.register(Registry.ITEM, new Identifier("redstonequip", item.getId()), item.asItem());
    }

    public static void registerBlock(RedstoneBlock block) {
        Registry.register(Registry.BLOCK, new Identifier("redstonequip", block.getId()), block.asBlock());
    }
}
