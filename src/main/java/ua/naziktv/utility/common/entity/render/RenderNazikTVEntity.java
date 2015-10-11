package ua.naziktv.utility.common.entity.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by NazikTV on 07.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class RenderNazikTVEntity extends RenderBiped {
    private static final ResourceLocation textureLocation = new ResourceLocation("nazikutility:textures/entity/NazikTV.png");

    public RenderNazikTVEntity(ModelBiped model, float shadowSize) {
        super(model, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return textureLocation;
    }
}

