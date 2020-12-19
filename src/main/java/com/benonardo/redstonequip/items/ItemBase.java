package com.benonardo.redstonequip.items;


import com.benonardo.redstonequip.Redstonequip;
import net.minecraft.item.Item;

/*
* Basic item object
*/
public class ItemBase extends Item {

    public ItemBase() {
        super(new Properties().group(Redstonequip.TAB));
    }
}
