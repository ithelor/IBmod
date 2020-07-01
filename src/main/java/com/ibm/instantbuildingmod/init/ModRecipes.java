package com.ibm.instantbuildingmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
    public static void Init()
    {
        GameRegistry.addSmelting(ModBlocks.PINK_ORE_BLOCK, new ItemStack(ModItems.PINK_INGOT, 1), 1.5F);
        //GameRegistry.addSmelting();
    }
}
