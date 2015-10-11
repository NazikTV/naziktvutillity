package ua.naziktv.utility.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import ua.naziktv.utility.common.main.NMain;

/**
 * Created by NazikTV on 07.10.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class ClockB extends Block {
    protected ClockB() {
        super(Material.wood);

    }

    public IIcon[] blockIcons = new IIcon[16];
    public String iconPath;

    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        Block i1 = par1IBlockAccess.getBlock(par2, par3, par4);
        return  i1 == this ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

    public Block setTexturePath(String p)
    {
        iconPath = p;
        this.textureName=NMain.modid+ iconPath+"/norm";
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName());
        blockIcons[0] = p_149651_1_.registerIcon(this.getTextureName());
        blockIcons[1] = p_149651_1_.registerIcon(NMain.modid+ iconPath+"/b");
        blockIcons[2] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/r");
        blockIcons[3] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/l");
        blockIcons[4] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/t");
        blockIcons[5] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/br");
        blockIcons[6] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/bl");
        blockIcons[7] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/tl");
        blockIcons[8] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/tr");
        blockIcons[9] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/lrb");
        blockIcons[10] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/tbr");
        blockIcons[11] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/tbl");
        blockIcons[12] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/lrt");
        blockIcons[13] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/tblr");
        blockIcons[14] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/tb");
        blockIcons[15] = p_149651_1_.registerIcon(NMain.modid+iconPath+"/lr");
    }

    @Override
    public IIcon getIcon(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if(par5 == 1)
        {
            return this.getIconFromTop(par1IBlockAccess, par2, par3, par4);
        }
        if(par5 == 0)
        {
            return this.getIconFromBottom(par1IBlockAccess, par2, par3, par4);
        }
        if(par5 == 2)
        {
            return this.getIconFromFront(par1IBlockAccess, par2, par3, par4);
        }
        if(par5 == 3)
        {
            return this.getIconFromBack(par1IBlockAccess, par2, par3, par4);
        }
        if(par5 == 4)
        {
            return this.getIconFromRight(par1IBlockAccess, par2, par3, par4);
        }
        if(par5 == 5)
        {
            return this.getIconFromLeft(par1IBlockAccess, par2, par3, par4);
        }
        return this.getIcon(par5, par1IBlockAccess.getBlockMetadata(par2, par3, par4));
    }

    public IIcon getIconFromRight(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this&&par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[13];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[11];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[10];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this)
        {
            return this.blockIcons[12];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this&&par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[9];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[7];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[6];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[8];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[5];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[14];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[15];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[3];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[2];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this)
        {
            return this.blockIcons[4];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[1];
        }
        return this.getIcon(4, par1IBlockAccess.getBlockMetadata(par2, par3, par4));
    }

    public IIcon getIconFromLeft(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this&&par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[13];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[11];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[10];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this)
        {
            return this.blockIcons[12];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this&&par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[9];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[7];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[6];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[8];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[5];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[14];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4-1) == this&&par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[15];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[3];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[2];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this)
        {
            return this.blockIcons[4];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[1];
        }
        return this.getIcon(3, par1IBlockAccess.getBlockMetadata(par2, par3, par4));
    }

    public IIcon getIconFromBack(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[13];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[11];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[10];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this)
        {
            return this.blockIcons[12];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this&&par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[9];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[7];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[6];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[8];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[5];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[14];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[15];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[2];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[3];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this)
        {
            return this.blockIcons[4];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[1];
        }
        return this.getIcon(3, par1IBlockAccess.getBlockMetadata(par2, par3, par4));
    }

    public IIcon getIconFromFront(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[13];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[11];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[10];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this&&par1IBlockAccess.getBlock(par2, par3-1, par4) == this)
        {
            return this.blockIcons[12];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this&&par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[9];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[7];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[6];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[8];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[5];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this&&par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[14];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this&&par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[15];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[3];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[2];
        }
        if(par1IBlockAccess.getBlock(par2, par3-1, par4) == this)
        {
            return this.blockIcons[4];
        }
        if(par1IBlockAccess.getBlock(par2, par3+1, par4) == this)
        {
            return this.blockIcons[1];
        }
        return this.getIcon(1, par1IBlockAccess.getBlockMetadata(par2, par3, par4));
    }

    public IIcon getIconFromTop(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[13];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[10];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this && par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[11];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[9];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[12];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[5];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[8];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[6];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[7];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[14];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[15];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[3];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[2];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[4];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[1];
        }
        return this.getIcon(1, par1IBlockAccess.getBlockMetadata(par2, par3, par4));
    }

    public IIcon getIconFromBottom(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[13];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[10];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this && par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[11];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[9];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[12];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[5];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[8];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[6];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[7];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this && par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[14];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this && par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[15];
        }
        if(par1IBlockAccess.getBlock(par2+1, par3, par4) == this)
        {
            return this.blockIcons[3];
        }
        if(par1IBlockAccess.getBlock(par2-1, par3, par4) == this)
        {
            return this.blockIcons[2];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4+1) == this)
        {
            return this.blockIcons[4];
        }
        if(par1IBlockAccess.getBlock(par2, par3, par4-1) == this)
        {
            return this.blockIcons[1];
        }
        return this.getIcon(0, par1IBlockAccess.getBlockMetadata(par2, par3, par4));
    }

    public IIcon getIcon(int par1, int par2)
    {
        return this.blockIcons[0];
    }
}
