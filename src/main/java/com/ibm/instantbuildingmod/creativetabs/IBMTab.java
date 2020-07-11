package com.ibm.instantbuildingmod.creativetabs;

import com.ibm.instantbuildingmod.init.ModItems;
import com.ibm.instantbuildingmod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class IBMTab extends CreativeTabs
{
    public IBMTab()
    {
        super(Reference.MOD_ID);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.PINK_SHARD);
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
