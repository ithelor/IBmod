package com.ibm.instantbuildingmod.items.armor;

import com.ibm.instantbuildingmod.Main;
import com.ibm.instantbuildingmod.init.ModItems;
import com.ibm.instantbuildingmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel
{

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
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
