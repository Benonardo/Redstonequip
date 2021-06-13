package com.benonardo.redstonequip.items;

import com.benonardo.redstonequip.Redstonequip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ShearsItem;
import net.minecraft.util.Rarity;

public class RedstoneShears extends ShearsItem implements RedstoneItem {

    public final String id;

    public RedstoneShears(String id) {
        super(new FabricItemSettings().group(Redstonequip.TAB).rarity(Rarity.UNCOMMON));
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

}
