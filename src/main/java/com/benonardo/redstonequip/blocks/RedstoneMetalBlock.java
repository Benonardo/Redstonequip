package com.benonardo.redstonequip.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class RedstoneMetalBlock extends Block implements RedstoneBlock{

    public final String id;

    public RedstoneMetalBlock(String id) {
        super(FabricBlockSettings
                .of(Material.METAL)
                .hardness(5.0F)
                .resistance(6.0F)
                .sounds(BlockSoundGroup.METAL)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
        );
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Block asBlock() {
        return this;
    }
}
