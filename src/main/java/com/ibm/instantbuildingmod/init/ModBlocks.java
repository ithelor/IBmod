package com.ibm.instantbuildingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ibm.instantbuildingmod.blocks.PinkOreBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//public static final Block DESIGN_BENCH_BLOCK = new BlockBase("design_bench_block", Material.WEB);

	public static final Block PINK_ORE_BLOCK = new PinkOreBlock("pink_ore_block", Material.WEB);

}