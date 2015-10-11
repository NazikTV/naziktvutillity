package ua.naziktv.utility.network;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import ua.naziktv.utility.common.entity.FASBEntity;
import ua.naziktv.utility.common.entity.NazikTVEntity;
import ua.naziktv.utility.common.entity.render.FASBEntityRender;
import ua.naziktv.utility.common.entity.render.RenderNazikTVEntity;

/**
 * Created by NazikTV on 11.10.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(NazikTVEntity.class, new RenderNazikTVEntity(new ModelBiped(), 0.5F));
    }

    public void registerRenderThings() {
        ClientRegistry.bindTileEntitySpecialRenderer(FASBEntity.class, new FASBEntityRender());
    }


}
