package com.benonardo.redstonequip.events;

import com.benonardo.redstonequip.Redstonequip;
import com.benonardo.redstonequip.init.RedstoneItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Redstonequip.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEventSubscriber {

    @SubscribeEvent
    public static void redstoneIngotCrushed(PlayerInteractEvent.LeftClickBlock event) {
        BlockPos position = event.getPos();
        PlayerEntity player = event.getPlayer();
        World world = player.world;
        BlockState block = world.getBlockState(position);
        if (!world.isRemote) {
            if (player.getHeldItemMainhand().getItem() == RedstoneItems.REDSTONE_INGOT.get()) {
                if (block == Blocks.STONE.getDefaultState()) {
                    EquipmentSlotType slot = player.getHeldItemMainhand().getEquipmentSlot();
                    int ingotCount = player.getHeldItemMainhand().getCount();
                    player.getHeldItemMainhand().setCount(ingotCount-1);
                    player.inventory.addItemStackToInventory(new ItemStack(Items.REDSTONE));
                }
            }
        }
    }
}
