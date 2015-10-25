package ua.naziktv.utility.common.entity.render;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;
import ua.naziktv.utility.common.api.NUtillits;
import ua.naziktv.utility.common.entity.JeckLogEntity;
import ua.naziktv.utility.common.entity.model.ModelJeck;

/**
 * Created by NazikTV on 23.10.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class JeckLogEntityRender extends TileEntitySpecialRenderer {
    public final ModelJeck model;
    public static ResourceLocation textures;

    public static final String[] name = new String[]{"Oak", "Spruce", "Birch", "Jungle", "Acacia", "Big_oak"};public int i;
    public JeckLogEntityRender() {
        this.model = new ModelJeck();
    }

    @SubscribeEvent
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
        ForgeDirection direction = NUtillits.getTileEntity(JeckLogEntity.class, world, x, y, z).getDirection();
        int meta = NUtillits.dirToMeta(direction);
        GL11.glPushMatrix();
        GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
        GL11.glPopMatrix();
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
    }

    //Set the lighting stuff, so it changes it's brightness properly.

    private void adjustLightFixture(World world, int i, int j, int k, Block block) {
        Tessellator tess = Tessellator.instance;
        float brightness = block.getLightValue(world, i, j, k);
        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 65536;
        tess.setColorOpaque_F(brightness, brightness, brightness);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) modulousModifier, divModifier);

    }
}
