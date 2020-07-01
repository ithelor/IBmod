package com.ibm.instantbuildingmod.items.tools;

import com.ibm.instantbuildingmod.Main;
import com.ibm.instantbuildingmod.init.ModItems;
import com.ibm.instantbuildingmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel
{
    public ToolHoe(String name, ToolMaterial material)
    {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.DECORATIONS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
