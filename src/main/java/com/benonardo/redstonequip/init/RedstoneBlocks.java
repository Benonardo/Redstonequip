package com.benonardo.redstonequip.init;

import com.benonardo.redstonequip.Redstonequip;
import com.benonardo.redstonequip.blocks.RedstoneMetalBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RedstoneBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Redstonequip.MOD_ID);

    public static final RegistryObject<Block> REDSTONE_METAL_BLOCK = BLOCKS.register("redstone_metal_block", RedstoneMetalBlock::new);
}
