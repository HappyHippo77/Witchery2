package com.happyhippo77.witchery2.item;

import com.happyhippo77.witchery2.Witchery2;
import com.happyhippo77.witchery2.block.ModBlocks;
import com.happyhippo77.witchery2.item.items.AnointingPaste;
import com.happyhippo77.witchery2.item.items.seeds.BelladonnaSeeds;
import com.happyhippo77.witchery2.item.items.seeds.MandrakeSeeds;
import com.happyhippo77.witchery2.item.items.seeds.SnowbellSeeds;
import com.happyhippo77.witchery2.item.items.seeds.WaterArtichokeSeeds;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Witchery2.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    public static ItemGroup itemGroup = new ItemGroup(Witchery2.MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.MANDRAKE_SEEDS);
        }
    };

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(ModBlocks.WITCHS_CAULDRON, new Item.Properties().group(ModItems.itemGroup)).setRegistryName("witchs_cauldron"));
        event.getRegistry().register(new MandrakeSeeds());
        event.getRegistry().register(new WaterArtichokeSeeds());
        event.getRegistry().register(new BelladonnaSeeds());
        event.getRegistry().register(new SnowbellSeeds());
        event.getRegistry().register(new AnointingPaste());
    }

    public static final MandrakeSeeds MANDRAKE_SEEDS = null;
    public static final WaterArtichokeSeeds WATER_ARTICHOKE_SEEDS = null;
    public static final BelladonnaSeeds BELLADONNA_SEEDS = null;
    public static final SnowbellSeeds SNOWBELL_SEEDS = null;
    public static final AnointingPaste ANOINTING_PASTE = null;

}