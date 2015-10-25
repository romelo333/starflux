package romelo333.starflux.blocks.base;


import mcjty.lib.container.GenericBlock;
import net.minecraft.block.material.Material;
import romelo333.starflux.StarFlux;

public class BaseBlock extends GenericBlock {

    public BaseBlock() {
        super(StarFlux.instance, Material.iron, BaseTile.class, false);
    }

    @Override
    public int getGuiID() {
        return -1;
    }
}
