package com.ibm.instantbuildingmod.items;

import com.ibm.instantbuildingmod.Main;
import com.ibm.instantbuildingmod.init.ModItems;
import com.ibm.instantbuildingmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.DECORATIONS);
		
		ModItems.ITEMS.add(this);
		setCreativeTab(Main.IBM_TAB);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}