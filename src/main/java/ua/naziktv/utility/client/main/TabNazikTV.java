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
 * Created by Comp on 06.07.2015.
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
