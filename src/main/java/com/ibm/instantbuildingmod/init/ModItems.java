package com.ibm.instantbuildingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.ibm.instantbuildingmod.items.ItemBase;

import com.ibm.instantbuildingmod.items.armor.ArmorBase;
import com.ibm.instantbuildingmod.items.tools.*;
import com.ibm.instantbuildingmod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Materials
	public static final Item.ToolMaterial MATERIAL_PINK = EnumHelper.addToolMaterial(
			"material_pink", 3, 2343, 9.0F, 4.0F, 10);
	public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_PINK = EnumHelper.addArmorMaterial(
			"armor_material_pink", Reference.MOD_ID + ":pink", 17,
			new int[] {4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

	// Items
	public static final Item PINK_SHARD = new ItemBase("pink_shard");
	public static final Item PINK_DUST = new ItemBase("pink_dust");
	public static final Item PINK_INGOT = new ItemBase("pink_ingot");

	//Tools
	public static final ItemSword PINK_SWORD = new ToolSword("pink_sword", MATERIAL_PINK);
	public static final ItemPickaxe PINK_PICKAXE = new ToolPickaxe("pink_pickaxe", MATERIAL_PINK);
	public static final ItemSpade PINK_SHOWEL = new ToolSpade("pink_spade", MATERIAL_PINK);
	public static final ItemAxe PINK_AXE = new ToolAxe("pink_axe", MATERIAL_PINK);
	public static final ItemHoe PINK_HOE = new ToolHoe("pink_hoe", MATERIAL_PINK);

	//Armor
	public static final Item PINK_HELMET = new ArmorBase("pink_helmet", ARMOR_MATERIAL_PINK, 1, EntityEquipmentSlot.HEAD);
	public static final Item PINK_CHESTPLATE = new ArmorBase("pink_chestplate", ARMOR_MATERIAL_PINK, 1, EntityEquipmentSlot.CHEST);
	public static final Item PINK_LEGGINGS = new ArmorBase("pink_leggings", ARMOR_MATERIAL_PINK, 2, EntityEquipmentSlot.LEGS);
	public static final Item PINK_BOOTS = new ArmorBase("pink_boots", ARMOR_MATERIAL_PINK, 1, EntityEquipmentSlot.FEET);

}