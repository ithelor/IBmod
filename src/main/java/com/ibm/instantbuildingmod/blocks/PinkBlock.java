package com.ibm.instantbuildingmod.blocks;

import com.ibm.instantbuildingmod.Main;
import com.ibm.instantbuildingmod.init.ModBlocks;
import com.ibm.instantbuildingmod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Random;

public class PinkBlock extends BlockBase
{
    public PinkBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
        //setLightLevel(1.0F);
        //setLightOpacity(1);
        //setBlockUnbreakable();

        setCreativeTab(Main.IBM_TAB);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
