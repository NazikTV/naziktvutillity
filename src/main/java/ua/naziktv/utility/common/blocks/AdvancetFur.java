package ua.naziktv.utility.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import ua.naziktv.utility.common.main.NMain;
import ua.naziktv.utility.common.entity.TileEntityAdvancFur;

import java.util.Random;

/**
 * Created by NazikTV on 31.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
    public  class AdvancetFur extends BlockContainer { //static

        @SideOnly(Side.CLIENT)
        private IIcon top;
        @SideOnly(Side.CLIENT)
        private IIcon front;

        private static boolean isBurning;
        private final boolean isBurning2;
        private final Random random = new Random();

        public AdvancetFur(boolean isActive) {
            super(Material.rock);
            isBurning2 = isActive;
            this.setHardness(3F);

        }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister) {
        this.blockIcon = iconregister.registerIcon(NMain.modid + ":FurnaceSide");
        this.front = iconregister.registerIcon(this.isBurning2 ? NMain.modid + ":FurnaceActive" : NMain.modid + ":Furnace");
        this.top = iconregister.registerIcon(NMain.modid + ":FurnaceTop");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.top : (par1 == 0 ? this.blockIcon : (par1 != par2 ? this.blockIcon : this.front));
    }


    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        this.setDefaultDirection(par1World, par2, par3, par4);
    }

    /**
     * set a blocks direction
     */
    private void setDefaultDirection(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {

            byte b0 = 3;

            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
        }
    }



    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
    {
        return Container.calcRedstoneFromInventory((IInventory) par1World.getTileEntity(par2, par3, par4));
    }





        public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
            player.openGui(NMain.instance, 0, world, x, y, z);
            return true;
        }

        public Item getItemDropped(int par1, Random random, int par3) {
            return Item.getItemFromBlock(NBlocks.AdvancFur);
        }

        public Item getItem(World world, int par2, int par3, int par4) {
            return Item.getItemFromBlock(NBlocks.AdvancFur);
        }

        /**
         * Returns a new instance of a block's tile entity class. Called on placing the block.
         */
        public TileEntity createNewTileEntity(World world, int par2)
        {
            return new TileEntityAdvancFur();
        }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
        int direction = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (direction == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (direction == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (direction == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (direction == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if (itemstack.hasDisplayName()) {
            ((TileEntityAdvancFur) world.getTileEntity(x, y, z)).furnaceName(itemstack.getDisplayName());
        }
    }

        public static void updateBlockState(boolean burning, World world, int x, int y, int z) {
            int direction = world.getBlockMetadata(x, y, z);
            TileEntity tileentity = world.getTileEntity(x, y, z);
            isBurning = true;

            if (burning) {
                world.setBlock(x, y, z, NBlocks.AdvancFurAct);
            } else {
                world.setBlock(x, y, z, NBlocks.AdvancFur);
            }

            isBurning = false;
            world.setBlockMetadataWithNotify(x, y, z, direction, 2);

            if (tileentity != null) {
                tileentity.validate();
                world.setTileEntity(x, y, z, tileentity);
            }
        }

        public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
            if (!isBurning) {
                TileEntityAdvancFur tileentitytutfurnace = (TileEntityAdvancFur) world.getTileEntity(x, y, z);

                if (tileentitytutfurnace != null) {
                    for (int i = 0; i < tileentitytutfurnace.getSizeInventory(); ++i) {
                        ItemStack itemstack = tileentitytutfurnace.getStackInSlot(i);

                        if (itemstack != null) {
                            float f = this.random.nextFloat() * 0.6F + 0.1F;
                            float f1 = this.random.nextFloat() * 0.6F + 0.1F;
                            float f2 = this.random.nextFloat() * 0.6F + 0.1F;

                            while (itemstack.stackSize > 0) {
                                int j = this.random.nextInt(21) + 10;

                                if (j > itemstack.stackSize) {
                                    j = itemstack.stackSize;
                                }

                                itemstack.stackSize -= j;
                                EntityItem entityitem = new EntityItem(world, (double) ((float) x + f), (double) ((float) y + f1), (double) ((float) z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));

                                if (itemstack.hasTagCompound()) {
                                    entityitem.getEntityItem().setTagCompound(((NBTTagCompound) itemstack.getTagCompound().copy()));
                                }

                                float f3 = 0.025F;
                                entityitem.motionX = (double) ((float) this.random.nextGaussian() * f3);
                                entityitem.motionY = (double) ((float) this.random.nextGaussian() * f3 + 0.1F);
                                entityitem.motionZ = (double) ((float) this.random.nextGaussian() * f3);
                                world.spawnEntityInWorld(entityitem);
                            }
                        }
                    }
                    world.func_147453_f(x, y, z, block);
                }
            }
            super.breakBlock(world, x, y, z, block, meta);
        }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_randomDisplayTick_1_, int p_randomDisplayTick_2_, int p_randomDisplayTick_3_, int p_randomDisplayTick_4_, Random p_randomDisplayTick_5_) {
        if(isBurning2) {
            int var6 = p_randomDisplayTick_1_.getBlockMetadata(p_randomDisplayTick_2_, p_randomDisplayTick_3_, p_randomDisplayTick_4_);
            float var7 = (float)p_randomDisplayTick_2_ + 0.5F;
            float var8 = (float)p_randomDisplayTick_3_ + 0.0F + p_randomDisplayTick_5_.nextFloat() * 6.0F / 16.0F;
            float var9 = (float)p_randomDisplayTick_4_ + 0.5F;
            float var10 = 0.52F;
            float var11 = p_randomDisplayTick_5_.nextFloat() * 0.6F - 0.3F;
            if(var6 == 4) {
                p_randomDisplayTick_1_.spawnParticle("smoke", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
                p_randomDisplayTick_1_.spawnParticle("flame", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            } else if(var6 == 5) {
                p_randomDisplayTick_1_.spawnParticle("smoke", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
                p_randomDisplayTick_1_.spawnParticle("flame", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            } else if(var6 == 2) {
                p_randomDisplayTick_1_.spawnParticle("smoke", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
                p_randomDisplayTick_1_.spawnParticle("flame", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
            } else if(var6 == 3) {
                p_randomDisplayTick_1_.spawnParticle("smoke", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
                p_randomDisplayTick_1_.spawnParticle("flame", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
            }

        }
    }

    }