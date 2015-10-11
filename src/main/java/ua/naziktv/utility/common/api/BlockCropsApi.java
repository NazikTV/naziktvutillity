package ua.naziktv.utility.common.api;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by NazikTV on 17.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class BlockCropsApi  extends BlockBush implements IGrowable
{

    public int growthStage;
    public int growthDelay;
    public int reqLight;
    public boolean requestesFarmland;
    public IIcon[] growthIcons;
    public ItemStack dropItem;
    public ItemStack dropSeed;


    public BlockCropsApi(int stages, int delay, int Light, boolean isCrop){
        super();
        growthStage = stages;
        growthDelay = delay;
        reqLight = Light;
        requestesFarmland = isCrop;


        this.setTickRandomly(true);
        float f = 0.5F;
        if (isCrop)
            this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        else
            this.setBlockBounds(0.25F , 0.0F, .25F , 0.75F , 0.75F, 0.75F );
        setCreativeTab(null);
        setHardness(0.0F);
        setStepSound(soundTypeGrass);
        disableStats();
    }

    protected boolean canPlaceBlockOn(Block b)
    {
        return requestesFarmland ? b == Blocks.farmland : true;
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World w, int x, int y, int z)
    {
        return dropSeed != null ? dropSeed.getItem() : Item.getItemFromBlock(this);
    }


    public void updateTick(World w, int x, int y, int z, Random rnd)
    {
        super.updateTick(w, x, y, z, rnd);
        if (w.getBlockLightValue(x, y + 1, z) >= reqLight)
        {
            int l = w.getBlockMetadata(x, y, z);
            if (l < growthStage)
            {
                float f = this.calculateGrowth(w, x, y, z);
                if (rnd.nextInt((int)((float)growthDelay / f) + 1) == 0)
                {
                    l++;
                    w.setBlockMetadataWithNotify(x, y, z, l, 2);
                }
            }
        }
    }


    private float calculateGrowth(World w, int x, int y, int z)
    {
        float f = 1.0F;
        Block block = w.getBlock(x, y, z - 1);
        Block block1 = w.getBlock(x, y, z + 1);
        Block block2 = w.getBlock(x - 1, y, z);
        Block block3 = w.getBlock(x + 1, y, z);
        Block block4 = w.getBlock(x - 1, y, z - 1);
        Block block5 = w.getBlock(x + 1, y, z - 1);
        Block block6 = w.getBlock(x + 1, y, z + 1);
        Block block7 = w.getBlock(x - 1, y, z + 1);
        boolean flag = (block2 == this) || (block3 == this);
        boolean flag1 = (block == this) || (block1 == this);
        boolean flag2 = (block4 == this) || (block5 == this) || (block6 == this) || (block7 == this);
        for (int l = x - 1; l <= x + 1; l++) {
            for (int i1 = z - 1; i1 <= z + 1; i1++)
            {
                float f1 = 0.0F;
                if (w.getBlock(l, y - 1, i1).canSustainPlant(w, l, y - 1, i1, ForgeDirection.UP, this))
                {
                    f1 = 1.0F;
                    if (w.getBlock(l, y - 1, i1).isFertile(w, l, y - 1, i1)) {
                        f1 = 3.0F;
                    }
                }
                if ((l != x) || (i1 != z)) {
                    f1 /= 4.0F;
                }
                f += f1;
            }
        }
        if ((flag2) || ((flag) && (flag1))) {
            f /= 2.0F;
        }
        return f;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg)
    {
        growthIcons = new IIcon[growthStage];
        for(int i = 0; i < growthStage; ++i) {
            growthIcons[i] = reg.registerIcon(textureName + i);
        }

    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return growthIcons[meta >= growthIcons.length ? growthIcons.length-1 : meta];
    }

    public int getRenderType()
    {
        return requestesFarmland ? 6 : 2;
    }


    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {

        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

        if (metadata >= growthStage) {
            for (int i = 0; i <= 1 + world.rand.nextInt(1); i++) {
                if (world.rand.nextInt(growthStage) <= metadata) {
                    if (dropSeed != null)
                       ret.add(dropSeed.copy());
                }
            }
            for (int i = 0; i <= 2 + world.rand.nextInt(2); i++) {
                    if (dropItem != null)
                        ret.add(dropItem.copy());
            }


        }
        else {
            ret.add(dropSeed.copy());
        }

        return ret;
    }




    //Bonemeal
    @Override
    public boolean func_149851_a(World w, int x, int y, int z, boolean remote) {

        return w.getBlockMetadata(x, y, z) < growthStage;
    }

    @Override
    public boolean func_149852_a(World w, Random r, int x, int y, int z) {
        return w.getBlockLightValue(x, y + 1, z) >= reqLight;

    }

    @Override
    public void func_149853_b(World w, Random r, int x, int y, int z) {
       w.setBlockMetadataWithNotify(x, y, z, w.getBlockMetadata(x, y, z)+1 , 3);
    }
}
