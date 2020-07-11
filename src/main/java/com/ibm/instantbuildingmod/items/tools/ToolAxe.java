package com.ibm.instantbuildingmod.items.tools;

import com.ibm.instantbuildingmod.Main;
import com.ibm.instantbuildingmod.init.ModItems;
import com.ibm.instantbuildingmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel
{
    public ToolAxe(String name, ToolMaterial material)
    {
        super(material, 6.0F, -3.2F);

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
