package com.happyhippo77.witchery2.block;

import com.happyhippo77.witchery2.Witchery2;
import com.happyhippo77.witchery2.block.blocks.WitchsCauldron;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Witchery2.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new WitchsCauldron());
    }

    public static final WitchsCauldron WITCHS_CAULDRON = null;
}
