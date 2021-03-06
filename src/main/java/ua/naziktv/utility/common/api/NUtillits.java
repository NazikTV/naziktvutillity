package ua.naziktv.utility.common.api;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Calendar;
import java.util.List;

/**
 * Created by NazikTV on 16.10.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class NUtillits {

    //public static Date date = new Date();
    //public static DateFormat dateFormatMonth = new SimpleDateFormat("MM");
    //public static DateFormat dateFormatDay = new SimpleDateFormat("dd");
    //public static boolean isHalloween;

    public NUtillits() {
        //System.out.println(dateFormatDay.format(date)); //2014/08/06 15:59:48
        //System.out.println(dateFormatMonth.format(date));
        //System.out.println(date.getMonth());
    }

    public static <T> T getTileEntity(Class<T> type, IBlockAccess world, int x, int y, int z)
    {
        if (world == null)
            return null;

        TileEntity te = world.getTileEntity(x, y, z);
        if (te == null)
            return null;

        try
        {
            return type.cast(te);
        }
        catch (ClassCastException e)
        {
            return null;
        }
    }

    public static Calendar calendar = Calendar.getInstance();

    public static boolean isHalloween() {
        if(calendar.get(2) + 1 == 10 && calendar.get(5) >= 26 && calendar.get(5) <= 31) {
            return true;
        }
        if(calendar.get(2) + 1 == 11 && calendar.get(5) <= 3) {
            return true;
        }
        return false;
        //return true;
    }

    public static boolean isCrismas(){

        if(calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
           return true;
        }
        return false;
        //return true;
    }

    public static void removeRecipe(ItemStack resultItem)
    {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
        for (int i = 0; i < recipes.size(); i++)
        {
            IRecipe tmpRecipe = recipes.get(i);
            ItemStack recipeResult = tmpRecipe.getRecipeOutput();
            if (ItemStack.areItemStacksEqual(resultItem, recipeResult))
                recipes.remove(i--);
        }
    }

    public static final int DIR_WEST = 3;
    public static final int DIR_NORTH = 0;
    public static final int DIR_EAST = 1;
    public static final int DIR_SOUTH = 2;

    public static int dirToMeta(ForgeDirection dir)
    {
        if (dir == ForgeDirection.NORTH)
            return DIR_NORTH;
        else if (dir == ForgeDirection.EAST)
            return DIR_EAST;
        else if (dir == ForgeDirection.SOUTH)
            return DIR_SOUTH;
        return DIR_WEST;
    }

    public static ForgeDirection metaToDir(int metadata)
    {
        if (metadata == DIR_NORTH)
            return ForgeDirection.NORTH;
        else if (metadata == DIR_EAST)
            return ForgeDirection.EAST;
        else if (metadata == DIR_SOUTH)
            return ForgeDirection.SOUTH;
        return ForgeDirection.WEST;
    }
}
