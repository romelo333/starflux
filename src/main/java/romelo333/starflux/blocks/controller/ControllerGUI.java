package romelo333.starflux.blocks.controller;


import mcjty.lib.container.GenericGuiContainer;
import mcjty.lib.gui.Window;
import mcjty.lib.gui.layout.VerticalLayout;
import mcjty.lib.gui.widgets.Button;
import mcjty.lib.gui.widgets.Panel;
import net.minecraft.inventory.Container;
import romelo333.starflux.StarFlux;

import java.awt.*;

public class ControllerGUI extends GenericGuiContainer<ControllerTile>{
    public ControllerGUI(ControllerTile tileEntity, Container container) {
        super(StarFlux.instance, null, tileEntity, container, 0, null);
        xSize = 300;
        ySize = 300;
    }

    @Override
    public void initGui() {
        super.initGui();
        Button button = new Button(mc, this).setText("blub");
        Panel toplevel = new Panel(mc, this).setLayout(new VerticalLayout()).addChild(button);
        toplevel.setBounds(new Rectangle(guiLeft,guiTop,xSize,ySize));
        window = new Window(this,toplevel);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        drawWindow();
    }
}
