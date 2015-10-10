package ua.naziktv.utility.client.main;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.init.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ua.naziktv.utility.client.blocks.*;
import ua.naziktv.utility.client.items.*;


/**
 * Created by NazikTV on 22.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class Craft {

    public static void Setup() {

        if (NConfig.ECGE == true) {
            GameRegistry.addRecipe(new ItemStack(NItems.GoldEgg, 2), "xxx", "xyx", "xxx", 'x', Items.gold_ingot, 'y', Items.egg);
        }
        if (NConfig.ECED == true) {
            GameRegistry.addRecipe(new ItemStack(NItems.EnchantedDiamond, 1), "#X#", "XYX", "#X#", ('X'), Items.enchanted_book, ('Y'), Items.diamond);
        }
        if (NConfig.ECV == true) {
            GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 120), "#X#", "XYX", "#X#", ('X'), Items.emerald, ('Y'), NItems.GoldEgg);
        }
        if (NConfig.ECN == true) {
            GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 3), "#X#", "XYX", "#X#", ('X'), NBlocks.testblock, ('Y'), NItems.GoldEgg);
        }
        if (NConfig.ECEDA == true) {
            GameRegistry.addRecipe(new ItemStack(NItems.EDhelmet, 1), "ZXZ", "YYY", "Y#Y", ('X'), Blocks.glowstone, ('Y'), NItems.EnchantedDiamond, ('Z'), Items.gold_nugget);
            GameRegistry.addRecipe(new ItemStack(NItems.EDboots, 1), "XYX", "ZYZ", "ZYZ", ('X'), Items.feather, ('Z'), NItems.EnchantedDiamond);
            GameRegistry.addRecipe(new ItemStack(NItems.EDpants, 1), "XXX", "XYX", "XYX", ('X'), NItems.EnchantedDiamond);
            GameRegistry.addRecipe(new ItemStack(NItems.EDplate, 1), "XYX", "XXX", "XXX", ('X'), NItems.EnchantedDiamond);
        }
        if (NConfig.ECSC == true) {
            GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 3), new Object[]{NItems.Cottons, NItems.Cottons, NItems.Cottons});
        }
        if (NConfig.ECTB == true) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NBlocks.testblock, 32), new Object[]{"dustGlowstone", new ItemStack(Blocks.beacon), new ItemStack(Blocks.obsidian)}));
        }
        GameRegistry.addRecipe(new ItemStack(NItems.CEnEmerald, 1), "YXY", "XOX", "YXY", ('X'), NItems.EnEmerald, ('O'), NItems.EnEmeraldC, ('Y'), Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(NBlocks.AdvancFur, 1), "###", "X5X", "XZX", ('Z'), Items.cauldron, ('X'), Items.brick, ('5'), Blocks.iron_block);
        GameRegistry.addShapelessRecipe(new ItemStack(NItems.EED), new Object[]{NItems.EmeraldD, Items.enchanted_book, Items.blaze_powder});
        ItemStack fandstick = new ItemStack(NItems.FandStick.setContainerItem(NItems.FandStick), 1, OreDictionary.WILDCARD_VALUE);
        GameRegistry.addShapelessRecipe(new ItemStack(NItems.EmeraldD), new Object[]{fandstick, Items.emerald});
        GameRegistry.addShapelessRecipe(new ItemStack(NItems.FandStick), new Object[]{NItems.Bowl, Items.stick, Items.flint});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_powder, 3), new Object[]{fandstick, Items.blaze_rod});
        GameRegistry.addRecipe(new ItemStack(NItems.Bowl), "NNN", "XNX", "NXN", ('X'), Blocks.stone);
        GameRegistry.addRecipe(new ItemStack(NBlocks.ClockN, 3), "NXN", "XYX", "NZN", ('X'), NBlocks.ClockBlock, ('Y'), Items.gold_ingot, ('Z'), Items.iron_ingot);
        GameRegistry.addRecipe(new ItemStack(NBlocks.ClockBlock, 5), "NYN", "YXY", "NYN", ('X'), new ItemStack(Blocks.planks, 1, 1), ('Y'), new ItemStack(Blocks.planks, 1, 5));
        //new ItemStack()
        for (int i = 0; i < 16; ++i) {
            GameRegistry.addRecipe(new ItemStack(NItems.PaintBukkit, 1, i), "XYN", "ZNN", "NNN", ('X'), new ItemStack(Items.dye, 1, i), ('Y'), fandstick, ('Z'), Items.milk_bucket);
            GameRegistry.addShapelessRecipe(new ItemStack(NBlocks.PaintQuarz, 1, i), new Object[]{new ItemStack(NItems.PaintBukkit, 1, i), Blocks.quartz_block});
        }
        for (int i = 0; i < 12; i++) {
            if(i<11)
              GameRegistry.addShapelessRecipe(new ItemStack(NBlocks.ClockN, 1, i+1), new Object[]{ new ItemStack(NBlocks.ClockN, 1, i)});
            else
                GameRegistry.addShapelessRecipe(new ItemStack(NBlocks.ClockN, 1), new Object[]{new ItemStack(NBlocks.ClockN, 1, 11)});
        }



    }

}