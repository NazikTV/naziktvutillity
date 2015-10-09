package ua.naziktv.utility.client.gui;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import ua.naziktv.utility.client.main.NMain;

import java.util.Set;

/**
 * Created by Comp on 22.07.2015.
 */
public class GuiFactoryNazikUt implements IModGuiFactory {
    @Override
    public void initialize(Minecraft minecraft) {

    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return EnCraft.class;

    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(IModGuiFactory.RuntimeOptionCategoryElement element) {
        return null;
    }
}
