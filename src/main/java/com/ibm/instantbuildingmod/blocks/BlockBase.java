package com.ibm.instantbuildingmod.blocks;

import com.ibm.instantbuildingmod.Main;
import com.ibm.instantbuildingmod.init.ModBlocks;
import com.ibm.instantbuildingmod.init.ModItems;
import com.ibm.instantbuildingmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.DECORATIONS);
		
		ModBlocks.BLOCKS.add(this);
		setCreativeTab(Main.IBM_TAB);

		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}