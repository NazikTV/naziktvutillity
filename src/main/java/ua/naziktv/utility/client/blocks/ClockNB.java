package ua.naziktv.utility.client.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import ua.naziktv.utility.client.main.NMain;

import java.util.List;

/**
 * Created by NazikTV on 10.10.2015.
 */
public class ClockNB extends Block {
    public String iconPath = ":ClockBlock";
    public ClockNB() {
        super(Material.rock);
        this.setCreativeTab(NMain.tabNazikTV);
        this.setStepSound(soundTypePiston).setHardness(0.8F);
    }

    public static final String names[] = new String[]
            {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12"};

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
            icon[i] = reg.registerIcon(NMain.modid+ iconPath+ names[i]);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return this.icon[meta];
    }
}
