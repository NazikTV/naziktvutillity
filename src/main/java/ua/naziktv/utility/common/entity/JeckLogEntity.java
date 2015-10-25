package ua.naziktv.utility.common.entity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import ua.naziktv.utility.common.api.NUtillits;

/**
 * Created by NazikTV on 30.08.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class JeckLogEntity extends TileEntity {

    public static ForgeDirection direction = ForgeDirection.NORTH;
    public static int tupe = 1;

    public void setTupe(int newInt)
    {
        tupe = newInt;
    }

    public int getTupe()
    {
        return tupe;
    }

    public void setDirection(ForgeDirection newDir)
    {
        direction = newDir;
    }

    public ForgeDirection getDirection()
    {
        return direction;
    }

    @Override
    public void writeToNBT(NBTTagCompound par1) {
        //super.writeToNBT(par1);
        par1.setInteger("direction", NUtillits.dirToMeta(this.direction));
        par1.setInteger("tupe", tupe);
    }

    @Override
    public void readFromNBT(NBTTagCompound par1) {
        super.readFromNBT(par1);
        this.direction = NUtillits.metaToDir(par1.getInteger("direction"));
        this.tupe = par1.getInteger("tupe");
    }


}
