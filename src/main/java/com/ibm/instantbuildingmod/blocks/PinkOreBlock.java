package com.ibm.instantbuildingmod.blocks;

import com.ibm.instantbuildingmod.Main;
import com.ibm.instantbuildingmod.init.ModBlocks;
import com.ibm.instantbuildingmod.util.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class PinkOreBlock extends BlockBase {


    public PinkOreBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.STONE);
        setHardness(2.5F);   // crafting table
        setResistance(6.0F); // stone
        setHarvestLevel("pickaxe", 2);
        //setLightLevel(1.0F);
        //setLightOpacity(1);
        //setBlockUnbreakable();
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.PINK_ORE_BLOCK);
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(ModBlocks.PINK_ORE_BLOCK);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
                                    EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote)
        {
            playerIn.openGui(Main.instance, Reference.GUI_PINK_ORE_BLOCK, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }

        return true;
    }
}