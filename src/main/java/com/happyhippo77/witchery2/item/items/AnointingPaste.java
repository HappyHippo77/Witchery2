package com.happyhippo77.witchery2.item.items;

import com.happyhippo77.witchery2.block.ModBlocks;
import com.happyhippo77.witchery2.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class AnointingPaste extends Item {
    public AnointingPaste() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ModItems.itemGroup));
        setRegistryName("anointing_paste");
    }

    private IItemHandler createHandler() {
        return new ItemStackHandler(1);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        Block block = context.getWorld().getBlockState(context.getPos()).getBlock();
        if (block == Blocks.CAULDRON) {
            Block.replaceBlock(Blocks.CAULDRON.getDefaultState(), ModBlocks.WITCHS_CAULDRON.getDefaultState(), context.getWorld(), context.getPos(), 0);
            if (!context.getPlayer().abilities.isCreativeMode) {
                context.getItem().shrink(1);
            }
            return ActionResultType.PASS;
        } else {
            return ActionResultType.PASS;
        }
    }
}
