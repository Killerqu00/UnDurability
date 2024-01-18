package com.killerqu.undurability.forge;

import com.killerqu.undurability.UnDurability;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UnDurability.MOD_ID)
public class UnDurabilityForge {
    public UnDurabilityForge() {
        UnDurability.init();
    }
}