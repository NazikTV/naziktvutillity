package ua.naziktv.utility.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import ua.naziktv.utility.API.TileEntityAdvancFur;

/**
 * Created by NazikTV on 30.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class NGuiHandler implements IGuiHandler {

    public NGuiHandler (){

    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == 0){
            TileEntityAdvancFur tileEntityAdvancFur = (TileEntityAdvancFur) world.getTileEntity(x, y, z);
            return new ContainerAdwFur(player.inventory, tileEntityAdvancFur);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == 0){
            TileEntityAdvancFur tileEntityAdvancFur = (TileEntityAdvancFur) world.getTileEntity(x, y, z);
            return new GuiAdwFur(player.inventory, tileEntityAdvancFur);
        }
        return null;
    }

}
