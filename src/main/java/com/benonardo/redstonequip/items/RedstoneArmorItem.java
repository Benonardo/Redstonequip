package com.benonardo.redstonequip.items;

import com.benonardo.redstonequip.Redstonequip;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;

public class RedstoneArmorItem extends ArmorItem implements RedstoneItem{

    public final String id;

    public RedstoneArmorItem(EquipmentSlot slot, String id) {
        super(RedstoneArmorType.REDSTONE, slot, new FabricItemSettings().group(Redstonequip.TAB));
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
