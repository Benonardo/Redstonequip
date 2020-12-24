package com.benonardo.redstonequip;

import com.benonardo.redstonequip.init.RedstoneItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("redstonequip")
public class Redstonequip {

    public static final String MOD_ID = "redstonequip";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public Redstonequip() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register all items
        RedstoneItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    /*
    * Tab for all Redstone Tools and Armor
    */
    public static final ItemGroup TAB = new ItemGroup("Redstonequip") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RedstoneItems.REDSTONE_INGOT.get());
        }
    };

}
