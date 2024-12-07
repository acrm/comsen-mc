package com.acrm.comsen;

import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.client.event.ScreenEvent;

@Mod.EventBusSubscriber(modid = ComSenMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class InventoryEvents {

    @SubscribeEvent
    public static void onScreenOpen(ScreenEvent event) {
        if (event.getScreen() instanceof InventoryScreen) {
            // Cancel the event to prevent the inventory screen from opening
            event.setCanceled(true);
        }
    }
}
