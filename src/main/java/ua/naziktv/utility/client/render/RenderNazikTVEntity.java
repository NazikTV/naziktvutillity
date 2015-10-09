package ua.naziktv.utility.client.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Comp on 07.07.2015.
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

