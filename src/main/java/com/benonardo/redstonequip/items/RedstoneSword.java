package com.benonardo.redstonequip.items;

import com.benonardo.redstonequip.Redstonequip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Rarity;

public class RedstoneSword extends SwordItem implements RedstoneItem{

    public final String id;

    public RedstoneSword(String id) {
        super(RedstoneToolTier.REDSTONE, 3, -2.4F, new FabricItemSettings().group(Redstonequip.TAB).rarity(Rarity.UNCOMMON));
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
