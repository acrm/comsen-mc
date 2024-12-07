package com.acrm.comsen;

import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ComSenMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ArmorSlotRestriction {

    @SubscribeEvent
    public static void onEquipmentChange(LivingEquipmentChangeEvent event) {
        event.setCanceled(true);
    }
}
