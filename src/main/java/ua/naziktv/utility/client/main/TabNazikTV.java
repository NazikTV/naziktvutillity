package ua.naziktv.utility.client.main;

import DummyCore.Core.CoreInitialiser;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ua.naziktv.utility.client.blocks.NBlocks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NazikTV on 06.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class TabNazikTV extends CreativeTabs {
    private final String tabLabel;
    public TabNazikTV(String name) {
        super(name);
        tabLabel = name;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public String getTranslatedTabLabel()
    {
        return this.tabLabel;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(NBlocks.testblock);
    }
}
