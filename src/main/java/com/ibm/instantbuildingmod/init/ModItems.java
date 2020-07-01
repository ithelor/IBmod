package com.ibm.instantbuildingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ibm.instantbuildingmod.items.ItemBase;

import com.ibm.instantbuildingmod.items.tools.*;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Materials
	public static final Item.ToolMaterial MATERIAL_PINK = EnumHelper.addToolMaterial(
			"material_pink", 3, 656, 8.0F, 3.0F, 10);

	// Items
	public static final Item PINK_INGOT = new ItemBase("pink_ingot");

	//Tools
	public static final ItemSword PINK_SWORD = new ToolSword("pink_sword", MATERIAL_PINK);

	public static final ItemPickaxe PINK_PICKAXE = new ToolPickaxe("pink_pickaxe", MATERIAL_PINK);
	public static final ItemSpade PINK_SHOWEL = new ToolSpade("pink_spade", MATERIAL_PINK);
	public static final ItemAxe PINK_AXE = new ToolAxe("pink_axe", MATERIAL_PINK);
	public static final ItemHoe PINK_HOE = new ToolHoe("pink_hoe", MATERIAL_PINK);
}