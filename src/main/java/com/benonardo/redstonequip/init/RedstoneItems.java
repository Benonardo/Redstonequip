package com.benonardo.redstonequip.init;

import com.benonardo.redstonequip.Redstonequip;
import com.benonardo.redstonequip.blocks.BlockItemBase;
import com.benonardo.redstonequip.items.ItemBase;
import com.benonardo.redstonequip.util.enums.RedstoneArmorMaterial;
import com.benonardo.redstonequip.util.enums.RedstoneToolTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RedstoneItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Redstonequip.MOD_ID);

    // Tools
    public static final RegistryObject<SwordItem> REDSTONE_SWORD = ITEMS.register("redstone_sword",
            () -> new SwordItem(RedstoneToolTier.REDSTONE, 3, -2.4F, new Item.Properties().group(Redstonequip.TAB)));
    public static final RegistryObject<PickaxeItem> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe",
            () -> new PickaxeItem(RedstoneToolTier.REDSTONE, 0, -2.8F, new Item.Properties().group(Redstonequip.TAB)));
    public static final RegistryObject<AxeItem> REDSTONE_AXE = ITEMS.register("redstone_axe",
            () -> new AxeItem(RedstoneToolTier.REDSTONE, 6, -3.4F, new Item.Properties().group(Redstonequip.TAB)));
    public static final RegistryObject<ShovelItem> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel",
            () -> new ShovelItem(RedstoneToolTier.REDSTONE, 0, 2.8F, new Item.Properties().group(Redstonequip.TAB)));
    public static final RegistryObject<HoeItem> REDSTONE_HOE = ITEMS.register("redstone_hoe",
            () -> new HoeItem(RedstoneToolTier.REDSTONE, 0, 2.8F, new Item.Properties().group(Redstonequip.TAB)));
    public static final RegistryObject<ShearsItem> REDSTONE_SHEARS = ITEMS.register("redstone_shears",
            () -> new ShearsItem(new Item.Properties().group(Redstonequip.TAB)));


    // Armor
    public static final RegistryObject<ArmorItem> REDSTONE_HELMET = ITEMS.register("redstone_helmet",
            () -> new ArmorItem(RedstoneArmorMaterial.REDSTONE, EquipmentSlotType.HEAD, new Item.Properties().group(Redstonequip.TAB)));
    public static final RegistryObject<ArmorItem> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate",
            () -> new ArmorItem(RedstoneArmorMaterial.REDSTONE, EquipmentSlotType.CHEST, new Item.Properties().group(Redstonequip.TAB)));
    public static final RegistryObject<ArmorItem> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings",
            () -> new ArmorItem(RedstoneArmorMaterial.REDSTONE, EquipmentSlotType.LEGS, new Item.Properties().group(Redstonequip.TAB)));
    public static final RegistryObject<ArmorItem> REDSTONE_BOOTS = ITEMS.register("redstone_boots",
            () -> new ArmorItem(RedstoneArmorMaterial.REDSTONE, EquipmentSlotType.FEET, new Item.Properties().group(Redstonequip.TAB)));

    // Block Items
    public static final RegistryObject<Item> REDSTONE_METAL_BLOCK = ITEMS.register("redstone_metal_block",
            () -> new BlockItemBase(RedstoneBlocks.REDSTONE_METAL_BLOCK.get()));

    // Items
    public static final RegistryObject<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot",
            () -> new ItemBase());

}
