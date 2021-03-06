package ua.naziktv.utility.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ua.naziktv.utility.common.blocks.NBlocks;
import ua.naziktv.utility.common.main.NMain;

import java.util.Random;

/**
 * Created by NazikTV on 24.08.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class FlintAndStick extends Item {

    FlintAndStick() {
        super();
        this.setMaxStackSize(1);
        this.setContainerItem(this);
        this.setUnlocalizedName("FlintAndStick");
        this.setMaxDamage(64);
        this.setNoRepair();
        this.setTextureName(NMain.modid + ":FlintAndStick");
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack item) {
        if (item.getItem() == this) {
            Random rand = Item.itemRand;
            boolean flag = item.attemptDamageItem(1, rand);
            return flag ? null : item;
        }
        return super.getContainerItem(item);
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack) {
        return false;
    }

    //@Override
    //public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World w, int int1, int int2, int int3, int int4, float f1, float f2, float f3){
    //    w.setBlock(int1, int2, int3, NBlocks.FASBlock);
    //    return false;
    //}

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
        if (!stack.isItemDamaged()) {
            if (par7 == 5 & world.isAirBlock(x + 1, y - 1, z) == false) {
                world.setBlock(x + 1, y, z, NBlocks.FASBlock);
                world.notifyBlockOfNeighborChange(x + 1, y, z, NBlocks.FASBlock);
                --stack.stackSize;
                return true;
            } else if (par7 == 4 & world.isAirBlock(x - 1, y - 1, z) == false) {
                world.setBlock(x - 1, y, z, NBlocks.FASBlock);
                world.notifyBlockOfNeighborChange(x - 1, y, z, NBlocks.FASBlock);
                --stack.stackSize;
                return true;
            } else if (par7 == 3 & world.isAirBlock(x, y - 1, z + 1) == false) {
                world.setBlock(x, y, z + 1, NBlocks.FASBlock);
                world.notifyBlockOfNeighborChange(x, y, z + 1, NBlocks.FASBlock);
                --stack.stackSize;
                return true;
            } else if (par7 == 2 & world.isAirBlock(x, y - 1, z - 1) == false) {
                world.setBlock(x, y, z - 1, NBlocks.FASBlock);
                world.notifyBlockOfNeighborChange(x, y, z - 1, NBlocks.FASBlock);
                --stack.stackSize;
                return true;
            } else if (par7 == 1 & world.isAirBlock(x, y, z) == false) {
                if (player.canPlayerEdit(x, y + 1, z, par7, stack)) {
                    world.setBlock(x, y + 1, z, NBlocks.FASBlock);
                    world.notifyBlockOfNeighborChange(x, y + 1, z, NBlocks.FASBlock);
                    --stack.stackSize;
                    return true;
                }
            }
            if (par7 <= 1) {
                return false;

            } else return true;
        } else return false;
    }
}
