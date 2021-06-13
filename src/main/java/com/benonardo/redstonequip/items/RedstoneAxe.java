package com.benonardo.redstonequip.items;

import com.benonardo.redstonequip.Redstonequip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.util.Rarity;

public class RedstoneAxe extends AxeItem implements RedstoneItem {

    public final String id;

    public RedstoneAxe(String id) {
        super(RedstoneToolTier.REDSTONE, 6, -3.4F, new FabricItemSettings().group(Redstonequip.TAB).rarity(Rarity.UNCOMMON));
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

}
