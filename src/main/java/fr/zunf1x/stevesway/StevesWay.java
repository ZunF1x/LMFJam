package fr.zunf1x.stevesway;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StevesWay.MODID)
public class StevesWay {

    public static final String MODID = "stevesway";

    public StevesWay() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    public void setup(FMLCommonSetupEvent e) {

    }

    public void clientSetup(FMLClientSetupEvent e) {

    }

    public void serverSetup(FMLDedicatedServerSetupEvent e) {

    }
}
