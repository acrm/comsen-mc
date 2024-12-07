package com.acrm.comsen;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ComSenMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerJoinWorld {

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getEntity();

        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            if (i != 40 && i != 41) {
                player.getInventory().getItem(i).setCount(0);
            }
        }
    }
}
