package ua.naziktv.utility.common.entity.render;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import ua.naziktv.utility.common.entity.JeckLogEntity;
import ua.naziktv.utility.common.main.NMain;

/**
 * Created by NazikTV on 23.10.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class JeckLogEntityRenderSpruce extends JeckLogEntityRender {
    public JeckLogEntityRenderSpruce(){
        i=1;
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        JeckLogEntity entity = (JeckLogEntity) te;

        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0F, (float) y + 1F, (float) z + 0.5F); // 0.0 <= 0.1

        textures = (new ResourceLocation(NMain.modid+":textures/blocks/JeckLog"+ name[i]+".png"));
        Minecraft.getMinecraft().renderEngine.bindTexture(textures);

        GL11.glPushMatrix();
        GL11.glRotatef(0F, 0F, 180.0F, 1.0F);
        int meta = te.getBlockMetadata();

        super.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }
}