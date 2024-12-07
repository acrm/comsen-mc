package com.acrm.comsen;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ComSenMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HandStackLimit {

    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getEntity();

        // Check main hand
        ItemStack mainHandItem = player.getMainHandItem();
        if (mainHandItem.getCount() > 1) {
            mainHandItem.setCount(1);
        }

        // Check off-hand
        ItemStack offHandItem = player.getOffhandItem();
        if (offHandItem.getCount() > 1) {
            offHandItem.setCount(1);
        }
    }
}
