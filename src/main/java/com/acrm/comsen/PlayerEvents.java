package com.acrm.comsen;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.entity.EquipmentSlot;

@Mod.EventBusSubscriber(modid = ComSenMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerEvents {

    @SubscribeEvent
    public static void onItemPickup(EntityItemPickupEvent event) {
        Player player = event.getEntity();
        ItemStack itemStack = event.getItem().getItem();

        boolean mainHandEmpty = player.getMainHandItem().isEmpty();
        boolean offHandEmpty = player.getOffhandItem().isEmpty();

        if (!mainHandEmpty && !offHandEmpty) {
            event.setCanceled(true);
        } else {
            ItemStack singleItem = itemStack.split(1);

            if (mainHandEmpty) {
                player.setItemSlot(EquipmentSlot.MAINHAND, singleItem);
            } else if (offHandEmpty) {
                player.setItemSlot(EquipmentSlot.OFFHAND, singleItem);
            }

            if (!itemStack.isEmpty()) {
                event.getItem().setItem(itemStack);
                event.setCanceled(true);
            } else {
                event.getItem().remove(Entity.RemovalReason.DISCARDED);
            }
        }
    }
}
