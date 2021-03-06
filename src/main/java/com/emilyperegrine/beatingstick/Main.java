package com.emilyperegrine.beatingstick;

import com.emilyperegrine.beatingstick.proxy.CommonProxy;
import com.emilyperegrine.beatingstick.util.Reference;
import net.minecraft.init.Blocks;
import  net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent e) {

    }

    @EventHandler
    public static void Init(FMLInitializationEvent e) {

    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent e) {

    }
}
