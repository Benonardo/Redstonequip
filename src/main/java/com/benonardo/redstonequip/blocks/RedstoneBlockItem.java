package com.benonardo.redstonequip.blocks;

import com.benonardo.redstonequip.Redstonequip;
import com.benonardo.redstonequip.items.RedstoneItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;

public class RedstoneBlockItem extends BlockItem implements RedstoneItem {

    public final String id;

    public RedstoneBlockItem(RedstoneBlock block) {
        super(block.asBlock(), new FabricItemSettings().group(Redstonequip.TAB));
        this.id = block.getId();
    }

    @Override
    public String getId() {
        return id;
    }
}
