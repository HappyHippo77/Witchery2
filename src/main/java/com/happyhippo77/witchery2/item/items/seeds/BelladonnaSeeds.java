package com.happyhippo77.witchery2.item.items.seeds;

import com.happyhippo77.witchery2.item.ModItems;
import net.minecraft.item.Item;

public class BelladonnaSeeds extends Item {
    public BelladonnaSeeds() {
        super(new Properties()
                .maxStackSize(64)
                .group(ModItems.itemGroup));
        setRegistryName("belladonna_seeds");
    }
}
