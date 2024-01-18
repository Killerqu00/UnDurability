package com.killerqu.undurability.fabric;

import com.killerqu.undurability.UnDurability;
import net.fabricmc.api.ModInitializer;

public class UnDurabilityFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        UnDurability.init();
    }
}