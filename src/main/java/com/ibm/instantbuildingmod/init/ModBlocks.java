package com.ibm.instantbuildingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ibm.instantbuildingmod.blocks.PinkBlock;
import com.ibm.instantbuildingmod.blocks.PinkOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block PINK_ORE = new PinkOre("pink_ore", Material.ROCK);
	public static final Block PINK_BLOCK = new PinkBlock("pink_block", Material.IRON);

}