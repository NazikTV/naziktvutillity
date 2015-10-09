package ua.naziktv.utility.client.potion;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import ua.naziktv.utility.client.main.NMain;

/**
 * Created by NazikTV on 02.08.2015.
 */
public class Potionnazikutility extends Potion {

    public Potionnazikutility(int par1, boolean par2, int par3) {
        super(par1, par2, par3);
    }

    public Potion setIconIndex(int par1, int par2) {
        super.setIconIndex(par1, par2);
        super.getStatusIconIndex();
        return this;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasStatusIcon() {
        Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(NMain.modid,"textures/gui/fire.png"));
        return true;
    }
}