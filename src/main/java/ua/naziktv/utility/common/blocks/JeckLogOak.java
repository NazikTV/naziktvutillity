package ua.naziktv.utility.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import ua.naziktv.utility.common.api.NUtillits;
import ua.naziktv.utility.common.entity.JeckLogEntity;
import ua.naziktv.utility.common.entity.JeckLogOakEntity;

/**
 * Created by NazikTV on 23.10.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class JeckLogOak extends Block implements ITileEntityProvider {
    protected JeckLogOak() {
        super(Material.wood);
        this.setLightLevel(1.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new JeckLogOakEntity();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float p_149660_6_, float p_149660_7_, float p_149660_8_, int meta){
        ForgeDirection dir = ForgeDirection.getOrientation(side).getOpposite();
        int metadata = NUtillits.dirToMeta(dir);
        world.setBlockMetadataWithNotify(x, y, z, metadata, 2);
        return NUtillits.dirToMeta(dir);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack itemStack){
        ForgeDirection dir = NUtillits.metaToDir(world.getBlockMetadata(x, y, z));
        JeckLogEntity te = NUtillits.getTileEntity(JeckLogEntity.class, world, x, y, z);
        if (te != null)
            te.setDirection(dir);
        else
            System.out.println("TE is NULL! :(");
    }
}
