package ua.naziktv.utility.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import ua.naziktv.utility.common.main.NMain;

import java.util.List;

/**
 * Created by NazikTV on 31.08.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class PaintQuarz extends Block {
    public PaintQuarz() {
        super(Material.rock);
        this.setCreativeTab(NMain.tabNazikTV);
        this.setStepSound(soundTypePiston).setHardness(0.8F);
    }

    public static final String names[] = new String[]
            {
                    "black",
                    "red",
                    "green",
                    "brown",
                    "blue",
                    "purple",
                    "cyan",
                    "silver",
                    "gray",
                    "pink",
                    "lime",
                    "yellow",
                    "light_blue",
                    "magenta",
                    "orange",
                    "white"};

    @SideOnly(Side.CLIENT)
    private IIcon[] icon = new IIcon[names.length];

    /*@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_getSubBlocks_1_, CreativeTabs p_getSubBlocks_2_, List p_getSubBlocks_3_) {
        for (int i = 0; i < names.length; ++i)
        p_getSubBlocks_3_.add(new ItemStack(p_getSubBlocks_1_, 1, i));
    }*/

    public int damageDropped(int p_damageDropped_1_) {
        return p_damageDropped_1_;
    }

    /*@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg)
    {
        for(int i = 0; i < names.length; ++i) {
            icon[i] = reg.registerIcon(NMain.modid + ":PaintQuarz/" + names[i]);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return this.icon[meta];
    }*/

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_getIcon_1_, int p_getIcon_2_) {
        return this.icon[p_getIcon_2_ % this.icon.length];
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_getSubBlocks_1_, CreativeTabs p_getSubBlocks_2_, List p_getSubBlocks_3_) {
        for(int var4 = 0; var4 < 16; ++var4) {
            p_getSubBlocks_3_.add(new ItemStack(p_getSubBlocks_1_, 1, var4));
        }

    }

    public static int func_150032_b(int p_150032_0_) {
        return func_150031_c(p_150032_0_);
    }

    public static int func_150031_c(int p_150031_0_) {
        return ~p_150031_0_ & 15;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_registerBlockIcons_1_) {
        this.icon = new IIcon[16];

        for(int var2 = 0; var2 < this.names.length; ++var2) {
            this.icon[var2] = p_registerBlockIcons_1_.registerIcon(NMain.modid + ":PaintQuarz/" + names[var2]);
        }

    }

    public MapColor getMapColor(int p_getMapColor_1_) {
        return MapColor.getMapColorForBlockColored(p_getMapColor_1_);
    }

}

