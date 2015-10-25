package romelo333.starflux.blocks.controller;


import mcjty.lib.container.EmptyContainer;
import mcjty.lib.container.GenericBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import romelo333.starflux.StarFlux;

public class Controller extends GenericBlock {

    public Controller() {
        super(StarFlux.instance, Material.iron, ControllerTile.class, false);
    }

    @Override
    public int getGuiID() {
        return StarFlux.GUI_CONTROLLER;
    }

    @Override
    public GuiContainer createClientGui(EntityPlayer entityPlayer, TileEntity tileEntity) {
        return new ControllerGUI((ControllerTile) tileEntity,new EmptyContainer(entityPlayer));
    }

    @Override
    public Container createServerContainer(EntityPlayer entityPlayer, TileEntity tileEntity) {
        return super.createServerContainer(entityPlayer, tileEntity);
    }
}
