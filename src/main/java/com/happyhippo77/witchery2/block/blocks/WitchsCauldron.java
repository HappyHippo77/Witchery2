package com.happyhippo77.witchery2.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WitchsCauldron extends Block {
    public WitchsCauldron() {
        super(Block.Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(3.0f));
        setRegistryName("witchs_cauldron");
    }
}
