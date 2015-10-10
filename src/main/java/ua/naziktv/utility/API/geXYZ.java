package ua.naziktv.utility.API;

import net.minecraft.block.Block;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by NazikTV on 23.08.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 * This code is copy off RailCraft part:
 * https://github.com/CovertJaguar/Railcraft
 * http://www.railcraft.info/
 * http://railcraft.info/wiki/
 * http://railcraft.info/wiki/info:license
 */
public class geXYZ {
    public geXYZ(){

    }

    public static int getXOnSide(int x, ForgeDirection side) {
        return x + side.offsetX;
    }

    public static int getYOnSide(int y, ForgeDirection side) {
        return y + side.offsetY;
    }

    public static int getZOnSide(int z, ForgeDirection side) {
        return z + side.offsetZ;
    }

    public static Block getBlock(IBlockAccess world, int x, int y, int z) {
        return world.getBlock(x, y, z);
    }
}
