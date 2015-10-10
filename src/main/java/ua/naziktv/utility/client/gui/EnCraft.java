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
 * Created by NazikTV on 24.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
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
