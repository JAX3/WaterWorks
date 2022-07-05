package com.example.WaterWorks;

import com.example.WaterWorks.setup.ClientSetup;
import com.example.WaterWorks.setup.MODsetup;
import com.example.WaterWorks.setup.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("waterworks")
public class waterworks {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "waterworks";



    public waterworks(){
        //register the deferred registery
        Registration.init();
        //register the setup method for mod loading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(MODsetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT,()->()->modbus.addListener(ClientSetup::init));
    }






}