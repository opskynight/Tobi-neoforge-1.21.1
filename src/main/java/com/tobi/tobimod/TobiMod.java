package com.yourname.tobimod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(TobiMod.MOD_ID)
public class TobiMod {
    public static final String MOD_ID = "tobimod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TobiMod(IEventBus modBus) {
        LOGGER.info("Initializing Tobi Mod...");
        
        // Phase 1 registrations will go here
    }
}