package romelo333.starflux;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import mcjty.lib.base.ModBase;
import mcjty.lib.varia.Logging;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Logger;
import romelo333.starflux.proxy.CommonProxy;

import java.io.File;

@Mod(modid = StarFlux.MODID, name="StarFlux", dependencies =
        "required-after:Forge@["+StarFlux.MIN_FORGE_VER+
        ",);required-after:McJtyLib@["+StarFlux.MIN_MCJTYLIB_VER+
        ",)",
        version = StarFlux.VERSION)
public class StarFlux implements ModBase {
    public static final String MODID = "starflux";
    public static final String VERSION = "0.0.1";
    public static final String MIN_FORGE_VER = "10.13.2.1291";
    public static final String MIN_MCJTYLIB_VER = "1.7.0";

    @SidedProxy(clientSide="romelo333.starflux.proxy.ClientProxy", serverSide="romelo333.starflux.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance("starflux")
    public static StarFlux instance;
    public static Logger logger;
    public static File mainConfigDir;
    public static Configuration config;

//    public static CreativeTabs tabStarFlux = new CreativeTabs("StarFlux") {
//        @Override
//        @SideOnly(Side.CLIENT)
//        public Item getTabIconItem() {
//            return Item.getItemFromBlock(ModBlocks.resonatingCrystalBlock);
//        }
//    };

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and
     * register them with the GameRegistry.
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();
        mainConfigDir = e.getModConfigurationDirectory();
        config = new Configuration(new File(mainConfigDir.getPath(), "starflux.cfg"));
        proxy.preInit(e);
//        MainCompatHandler.registerWaila();
    }


    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes.
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void serverStopped(FMLServerStoppedEvent event) {
        Logging.log("Star Flux: server is stopping. Shutting down gracefully");
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

    @Override
    public String getModId() {
        return MODID;
    }

    @Override
    public void openManual(EntityPlayer player, int bookIndex, String page) {
//        GuiDeepResonanceManual.locatePage = page;
//        player.openGui(DeepResonance.instance, bookIndex, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
    }
}
