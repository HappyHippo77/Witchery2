package com.happyhippo77.witchery2.item.items.seeds;

import com.happyhippo77.witchery2.item.ModItems;
import net.minecraft.item.Item;

public class MandrakeSeeds extends Item {
    public MandrakeSeeds() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ModItems.itemGroup));
        setRegistryName("mandrake_seeds");
    }
}
