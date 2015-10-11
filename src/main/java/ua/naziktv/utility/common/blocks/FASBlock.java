package ua.naziktv.utility.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import ua.naziktv.utility.common.api.NLoger;
import ua.naziktv.utility.common.entity.FASBEntity;
import ua.naziktv.utility.common.items.NItems;

import java.util.Random;

/**
 * Created by NazikTV on 30.08.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class FASBlock extends BlockContainer {
    protected FASBlock() {
        super(Material.wood);
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.30F, 0.75F);

    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World w, int x, int y, int z) {
        return NItems.FandStick;
    }
    public Random random = new Random();

    public void updateTick(World w, int x, int y, int z, Random r) {
        //if(!w.isRemote) {
            if(w.isAirBlock(x, y-1, z)){
                w.setBlock(x, y, z, Blocks.air);
                //w.
                w.setBlockToAir(x, y, z);
                breakBlock(w, x, y, z, null, 1);
                w.setBlockToAir(x, y, z);
                NLoger.DEBUG("ZZZZZ");
            }
        //}
        NLoger.DEBUG("XXXX");

    }
    public void onNeighborBlockChange(World w, int x, int y, int z, Block b) {
        if(w.isAirBlock(x, y-1, z)){
            float f = this.random.nextFloat() * 0.6F + 0.1F;
            float f1 = this.random.nextFloat() * 0.6F + 0.1F;
            float f2 = this.random.nextFloat() * 0.6F + 0.1F;
            float f3 = 0.025F;
            EntityItem entityitem = new EntityItem(w, (double) ((float) x + f), (double) ((float) y + f1), (double) ((float) z + f2), new ItemStack(NItems.FandStick, 1));
            w.setBlock(x, y, z, Blocks.air);
            entityitem.motionX = (double) ((float) this.random.nextGaussian() * f3);
            entityitem.motionY = (double) ((float) this.random.nextGaussian() * f3 + 0.1F);
            entityitem.motionZ = (double) ((float) this.random.nextGaussian() * f3);
            w.spawnEntityInWorld(entityitem);
            NLoger.DEBUG("ZZZZZ1");
        }
        NLoger.DEBUG("XXXX1");
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return NItems.FandStick;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new FASBEntity();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
        return false;
    }
}
