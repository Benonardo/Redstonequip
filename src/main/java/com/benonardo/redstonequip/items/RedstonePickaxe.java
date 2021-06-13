package com.benonardo.redstonequip.items;

import com.benonardo.redstonequip.Redstonequip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Rarity;

public class RedstonePickaxe extends PickaxeItem implements RedstoneItem {

    public final String id;

    public RedstonePickaxe(String id) {
        super(RedstoneToolTier.REDSTONE, 0, -2.8F, new FabricItemSettings().group(Redstonequip.TAB).rarity(Rarity.UNCOMMON));
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }


}
