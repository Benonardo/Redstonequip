package com.benonardo.redstonequip;

import com.benonardo.redstonequip.init.RedstoneRegistries;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Redstonequip implements ModInitializer {

    @Override
    public void onInitialize() {
        RedstoneRegistries.registerAll();
    }

    public static final ItemGroup TAB = new ItemGroup(10, "Redstonequip") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RedstoneRegistries.REDSTONE_INGOT);
        }
    };
}
