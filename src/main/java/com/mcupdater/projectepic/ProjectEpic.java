package com.mcupdater.projectepic;

import com.mcupdater.projectepic.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "projectepic", useMetadata = true)
public class ProjectEpic {

	@SidedProxy(clientSide = "com.mcupdater.projectepic.proxy.ClientProxy", serverSide = "com.mcupdater.projectepic.proxy.CommonProxy")
	public static CommonProxy proxy;
	public ModMetadata metadata;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		this.metadata = event.getModMetadata();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
