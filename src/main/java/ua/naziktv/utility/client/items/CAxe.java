package ua.naziktv.utility.client.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import ua.naziktv.utility.client.main.NMain;

import java.util.List;
/**
 * Created by NazikTV on 30.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */

public class CAxe extends ItemAxe {
    protected CAxe(int id) {
        super(NItems.NEWMATSWORD);
        this.setCreativeTab(NMain.tabNazikTV);
        this.setTextureName("nazikutility:CAxe");

    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("For Creative");
        par3List.add("And for OP's");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.uncommon;
    }
}
