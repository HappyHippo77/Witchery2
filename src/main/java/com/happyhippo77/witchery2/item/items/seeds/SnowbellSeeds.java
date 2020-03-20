package com.happyhippo77.witchery2.item.items.seeds;

import com.happyhippo77.witchery2.item.ModItems;
import net.minecraft.item.Item;

public class SnowbellSeeds extends Item {
    public SnowbellSeeds() {
        super(new Properties()
                .maxStackSize(64)
                .group(ModItems.itemGroup));
        setRegistryName("snowbell_seeds");
    }
}
