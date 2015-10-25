package romelo333.starflux.blocks;


import cpw.mods.fml.common.registry.GameRegistry;
import romelo333.starflux.blocks.base.BaseBlock;
import romelo333.starflux.blocks.base.BaseTile;
import romelo333.starflux.blocks.controller.Controller;
import romelo333.starflux.blocks.controller.ControllerTile;

public class ModBlocks {
    public static BaseBlock baseBlock;
    public static Controller controller;

    public static void init() {
        baseBlock = new BaseBlock();
        GameRegistry.registerBlock(baseBlock, "baseBlock");
        GameRegistry.registerTileEntity(BaseTile.class, "BaseTile");
        controller = new Controller();
        GameRegistry.registerBlock(controller, "controller");
        GameRegistry.registerTileEntity(ControllerTile.class, "ControllerTile");
    }
}
