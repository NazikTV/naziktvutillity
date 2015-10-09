package ua.naziktv.utility.client.blocks;

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
import ua.naziktv.utility.API.NLoger;
import ua.naziktv.utility.client.enitity.FASBEntity;
import ua.naziktv.utility.client.items.NItems;
import ua.naziktv.utility.client.main.NMain;

import java.util.Random;

/**
 * Created by NazikTV on 30.08.2015.
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
                breakBlock(w, x, y, z, null, 1);
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
            //breakBlock(w, x, y, z, null, 1);
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