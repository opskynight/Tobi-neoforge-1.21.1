package com.tobi.tobimod.client;

import com.tobi.tobimod.client.keybinds.ModKeybindings;
import com.tobi.tobimod.client.screens.TobiRadialMenu;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(value = Dist.CLIENT)
public class ClientEventHandler {

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {
        Minecraft mc = Minecraft.getInstance();
        
        // Check if Location Marker keybind is pressed (this opens the radial menu)
        while (ModKeybindings.LOCATION_MARKER.consumeClick()) {
            // Only open if no screen is currently open
            if (mc.screen == null) {
                mc.setScreen(new TobiRadialMenu());
            }
        }
        
        // You can add handlers for other keybinds here as they're implemented
        // For now, the radial menu handles ability activation
    }
}
