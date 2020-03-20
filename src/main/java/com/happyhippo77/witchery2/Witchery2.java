package com.happyhippo77.witchery2;

import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Witchery2.MODID)
public class Witchery2 {
    public static final String MODID = "witchery2";

    public Witchery2() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        OBJLoader.INSTANCE.addDomain(Witchery2.MODID);
    }
}
