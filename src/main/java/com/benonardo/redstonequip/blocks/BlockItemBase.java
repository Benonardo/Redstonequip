package com.benonardo.redstonequip.blocks;

import com.benonardo.redstonequip.Redstonequip;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Properties().group(Redstonequip.TAB));
    }
}
