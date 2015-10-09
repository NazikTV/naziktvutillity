package ua.naziktv.utility.client.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import ua.naziktv.utility.client.main.NMain;

import java.util.List;

/**
 * Created by NazikTV on 31.08.2015.
 */
public class PaintBukkit extends Item {
    public PaintBukkit() {
        this.setHasSubtypes(true);
        this.setMaxStackSize(1);
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
                    "white"
            };

    public static IIcon[] icons = new IIcon[names.length];

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
        return icons[meta];
    }

    public int getMetadata(int meta) {
        return meta;
    }

    public String getUnlocalizedName(ItemStack is) {
        return names[is.getItemDamage()].replace('/', '.') +" PaintBukkit";
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg) {
        for (int i = 0; i < names.length; ++i)
            icons[i] = reg.registerIcon(NMain.modid + ":" + "PaintBukkit/"+ names[i] + " PaintBukkit");
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itm, CreativeTabs tab, List list) {
        for (int i = 0; i < names.length; ++i)
            list.add(new ItemStack(itm, 1, i));
    }

}