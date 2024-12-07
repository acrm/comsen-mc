package com.acrm.comsen;

import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ComSenMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ContainerEvents {

    @SubscribeEvent
    public static void onContainerOpen(PlayerContainerEvent.Open event) {
        event.setCanceled(true);
    }
}
