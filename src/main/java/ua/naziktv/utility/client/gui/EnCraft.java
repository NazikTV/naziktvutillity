package ua.naziktv.utility.client.gui;


import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import ua.naziktv.utility.client.main.NConfig;
import ua.naziktv.utility.client.main.NMain;

import java.util.List;

/**
 * Created by Comp on 24.07.2015.
 */
public class EnCraft extends GuiConfig {

    @SuppressWarnings("unchecked")
    public EnCraft(GuiScreen parent)
    {
        super(parent, getAllCategory(), NMain.modid, false, false, GuiConfig.getAbridgedConfigPath(NConfig.class.toString()));
        this.title = "Nazik Utility mod Configuration";
    }

    static List<IConfigElement> configElementList;
    @SuppressWarnings({ "rawtypes", "unchecked" })
    static List<IConfigElement> getAllCategory()
    {
        if(configElementList == null)
        {
            //NMain.cfg.load();
            configElementList = new ConfigElement(NConfig.config1.getCategory("Enablecraft")).getChildElements();
            configElementList = new ConfigElement(NConfig.config1.getCategory("enablecraft")).getChildElements();
            configElementList.addAll(new ConfigElement(NConfig.config1.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements());
            NConfig.save(null);
        }

        return configElementList;

    }


}
