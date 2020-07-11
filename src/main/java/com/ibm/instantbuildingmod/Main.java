package com.ibm.instantbuildingmod;

import com.ibm.instantbuildingmod.creativetabs.IBMTab;
import com.ibm.instantbuildingmod.init.ModRecipes;
import com.ibm.instantbuildingmod.world.ModWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ibm.instantbuildingmod.proxy.CommonProxy;
import com.ibm.instantbuildingmod.util.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{

	public static final IBMTab IBM_TAB = new IBMTab();
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.Init();
	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) // P...i
	{

	}
	
}