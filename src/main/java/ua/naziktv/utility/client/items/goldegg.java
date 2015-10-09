package ua.naziktv.utility.client.items;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Level;

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


