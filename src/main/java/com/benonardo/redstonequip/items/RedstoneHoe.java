package com.benonardo.redstonequip.items;

import com.benonardo.redstonequip.Redstonequip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.util.Rarity;

public class RedstoneHoe extends HoeItem implements RedstoneItem{

    public final String id;

    public RedstoneHoe(String id) {
        super(RedstoneToolTier.REDSTONE, 0, -2.8F, new FabricItemSettings().group(Redstonequip.TAB).rarity(Rarity.UNCOMMON));
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
