package com.benonardo.redstonequip.items;

import com.benonardo.redstonequip.Redstonequip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class RedstoneBaseItem extends Item implements RedstoneItem {

    public final String id;

    public RedstoneBaseItem(String id) {
        super(new FabricItemSettings().group(Redstonequip.TAB));
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
