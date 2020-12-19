package com.benonardo.redstonequip.init;

import com.benonardo.redstonequip.Redstonequip;
import com.benonardo.redstonequip.items.ItemBase;
import com.benonardo.redstonequip.util.enums.RedstoneToolTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RedstoneItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Redstonequip.MOD_ID);

    // Tools
    public static final RegistryObject<SwordItem> REDSTONE_SWORD = ITEMS.register("redstone_sword",
            () -> new SwordItem(RedstoneToolTier.REDSTONE, 2, -2.4F, new Item.Properties().group(Redstonequip.TAB)));
    public static final RegistryObject<PickaxeItem> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe",
            () -> new PickaxeItem(RedstoneToolTier.REDSTONE, 0, -2.4F, new Item.Properties().group(Redstonequip.TAB)));

    // Items
    public static final RegistryObject<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot",
            () -> new ItemBase());
}
