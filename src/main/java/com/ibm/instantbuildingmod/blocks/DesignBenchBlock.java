package com.ibm.instantbuildingmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DesignBenchBlock extends BlockBase
{

    public DesignBenchBlock(String name, Material material)
    {
        super(name, material);
        setSoundType(SoundType.WOOD);
        setHardness(2.5F);   // crafting table
        setResistance(6.0F); // stone
        setHarvestLevel("axe", 0);
        //setLightLevel(1.0F);
        //setLightOpacity(1);
        //setBlockUnbreakable();
    }
}