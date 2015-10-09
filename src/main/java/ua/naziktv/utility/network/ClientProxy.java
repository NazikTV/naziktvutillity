package ua.naziktv.utility.network;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import ua.naziktv.utility.client.enitity.FASBEntity;
import ua.naziktv.utility.client.enitity.FASBEntityRender;
import ua.naziktv.utility.client.enitity.NazikTVEntity;
import ua.naziktv.utility.client.render.RenderNazikTVEntity;

/**
 * Created by Comp on 07.07.2015.
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
