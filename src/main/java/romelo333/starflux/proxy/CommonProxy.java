package romelo333.starflux.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mcjty.lib.base.GeneralConfig;
import net.minecraftforge.common.config.Configuration;
import romelo333.starflux.StarFlux;

public abstract class CommonProxy {

    private Configuration mainConfig;

    public void preInit(FMLPreInitializationEvent e) {
        GeneralConfig.preInit(e);
        mainConfig = StarFlux.config;
        readMainConfig();
//        ModItems.init();
//        ModBlocks.init();
//        ModCrafting.init();
    }

    private void readMainConfig() {
//        Configuration cfg = mainConfig;
//        try {
//            cfg.load();
//            cfg.addCustomCategoryComment(WorldGenConfiguration.CATEGORY_WORLDGEN, "Configuration for wodlgen");
//            cfg.addCustomCategoryComment(GeneratorConfiguration.CATEGORY_GENERATOR, "Configuration for the generator multiblock");
//            cfg.addCustomCategoryComment(RadiationConfiguration.CATEGORY_RADIATION, "Configuration for the radiation");
//            WorldGenConfiguration.init(cfg);
//            GeneratorConfiguration.init(cfg);
//
//            RadiationConfiguration.init(cfg);
//        } catch (Exception e1) {
//            FMLLog.log(Level.ERROR, e1, "Problem loading config file!");
//        } finally {
//            if (mainConfig.hasChanged()) {
//                mainConfig.save();
//            }
//        }
    }

    public void init(FMLInitializationEvent e) {
//        NetworkRegistry.INSTANCE.registerGuiHandler(DeepResonance.instance, new GuiProxy());
//        MinecraftForge.EVENT_BUS.register(new ForgeEventHandlers());
//        FMLCommonHandler.instance().bus().register(new FMLEventHandlers());
    }

    public void postInit(FMLPostInitializationEvent e) {
//        if (mainConfig.hasChanged()) {
//            mainConfig.save();
//        }
//        mainConfig = null;
//        WrenchChecker.init();
    }
}
