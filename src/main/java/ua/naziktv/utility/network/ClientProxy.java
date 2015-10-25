package ua.naziktv.utility.network;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import ua.naziktv.utility.common.entity.*;
import ua.naziktv.utility.common.entity.render.*;

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
        ClientRegistry.bindTileEntitySpecialRenderer(JeckLogOakEntity.class, new JeckLogEntityRenderOak());
        ClientRegistry.bindTileEntitySpecialRenderer(JeckLogSpruceEntity.class, new JeckLogEntityRenderSpruce());
        ClientRegistry.bindTileEntitySpecialRenderer(JeckLogBircheEntity.class, new JeckLogEntityRenderBirch());
        ClientRegistry.bindTileEntitySpecialRenderer(JeckLogJungleEntity.class, new JeckLogEntityRenderJungle());
        ClientRegistry.bindTileEntitySpecialRenderer(JeckLogAcaciaEntity.class, new JeckLogEntityRenderAcacia());
        ClientRegistry.bindTileEntitySpecialRenderer(JeckLogBigOakEntity.class, new JeckLogEntityRenderBigOak());
    }


}
