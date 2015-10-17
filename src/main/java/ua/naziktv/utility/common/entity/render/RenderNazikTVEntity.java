package ua.naziktv.utility.common.entity.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import ua.naziktv.utility.common.api.NUtillits;

/**
 * Created by NazikTV on 07.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class RenderNazikTVEntity extends RenderBiped {
    private static final ResourceLocation textureLocationN = new ResourceLocation("nazikutility:textures/entity/NazikTV.png");
    private static final ResourceLocation textureLocationH = new ResourceLocation("nazikutility:textures/entity/NazikTVH.png");
    private static final ResourceLocation textureLocationC = new ResourceLocation("nazikutility:textures/entity/NazikTVC.png");

    public RenderNazikTVEntity(ModelBiped model, float shadowSize) {
        super(model, shadowSize);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        if (NUtillits.isHalloween())
            return textureLocationH;
        if (NUtillits.isCrismas())
            return textureLocationC;
        return textureLocationN;
    }
}

