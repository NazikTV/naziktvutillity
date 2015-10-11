package ua.naziktv.utility.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
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

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_getSubBlocks_1_, CreativeTabs p_getSubBlocks_2_, List p_getSubBlocks_3_) {
        for (int i = 0; i < names.length; ++i)
        p_getSubBlocks_3_.add(new ItemStack(p_getSubBlocks_1_, 1, i));
    }

    public int damageDropped(int p_damageDropped_1_) {
        return p_damageDropped_1_;
    }

    @SideOnly(Side.CLIENT)
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
    }

}

