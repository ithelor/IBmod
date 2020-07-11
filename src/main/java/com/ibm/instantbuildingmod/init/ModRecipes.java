package com.ibm.instantbuildingmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
    public static void Init()
    {
        GameRegistry.addSmelting(ModItems.PINK_DUST, new ItemStack(ModItems.PINK_INGOT, 1), 6.0F);
        GameRegistry.addSmelting(ModBlocks.PINK_ORE, new ItemStack(ModItems.PINK_SHARD, 1), 4.0F);
    }
}
