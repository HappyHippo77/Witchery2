package com.happyhippo77.witchery2.item.items.seeds;

import com.happyhippo77.witchery2.item.ModItems;
import net.minecraft.item.Item;

public class WaterArtichokeSeeds extends Item {
    public WaterArtichokeSeeds() {
        super(new Properties()
                .maxStackSize(64)
                .group(ModItems.itemGroup));
        setRegistryName("water_artichoke_seeds");
    }
}
