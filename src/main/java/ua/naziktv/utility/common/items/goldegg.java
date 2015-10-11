package ua.naziktv.utility.common.items;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Level;
/**
 * Created by NazikTV on 12.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */

public class goldegg extends ItemEgg {
    public goldegg(int id) {
        super();
        this.setMaxStackSize(32);
        //this.setCreativeTab(NMain.tabNazikTV);
        this.setTextureName("nazikutility:egg");
        FMLLog.log(Level.DEBUG, "hdjs");

        }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.epic;
    }


}


