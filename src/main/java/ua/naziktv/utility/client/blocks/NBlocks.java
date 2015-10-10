package ua.naziktv.utility.client.blocks;

import DummyCore.Blocks.BlocksRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import ua.naziktv.utility.API.BlockCropsApi;
import ua.naziktv.utility.API.FurAPI;
import ua.naziktv.utility.client.items.ItemBlockGeneric;
import ua.naziktv.utility.client.main.NMain;

/**
 * Created by NazikTV on 24.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class NBlocks {
    public static Block Cotton = new BlockCropsApi(5, 8,9, true).setBlockName("CottonCrops").setBlockTextureName("nazikutility:cotton/cotton_");
    public static Block testblock = new Testblock(1240);
    public static Block ClockBlock = new ClockB().setTexturePath(":ClockBlock").setCreativeTab(NMain.tabNazikTV).setBlockName("ClockBlock");
    public static Block AdvancFur = new FurAPI(false).setBlockName("AdvancFur"),
            AdvancFurAct = new FurAPI(true).setBlockName("AdvancFurAct"),
            FASBlock = new FASBlock().setCreativeTab(NMain.tabNazikTV).setBlockTextureName(NMain.modid + ":FASB1"),
            ClockN = new ClockNB().setCreativeTab(NMain.tabNazikTV).setBlockName("ClockNum"),
            PaintQuarz = new PaintQuarz().setCreativeTab(NMain.tabNazikTV).setBlockName("PaintQuarz");

    public static void registerBlocks() {
        GameRegistry.registerBlock(PaintQuarz, ItemBlockGeneric.class, "PaintQuarz");
        GameRegistry.registerBlock(ClockN, ItemBlockGeneric.class, "ClockNum");
        GameRegistry.registerBlock((Cotton), "Cotton");
        GameRegistry.registerBlock(testblock, "Testblock").setCreativeTab(NMain.tabNazikTV);
        GameRegistry.registerBlock(FASBlock, "FASBlock");
        GameRegistry.registerBlock(ClockBlock, "ClockBlock");
        GameRegistry.registerBlock((AdvancFur), "AdvancFur").setCreativeTab(NMain.tabNazikTV);
        GameRegistry.registerBlock((AdvancFurAct), "AdvancFurAct");

        ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST,
                new WeightedRandomChestContent(new ItemStack(testblock), 5, 27, 3));
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR,
               new WeightedRandomChestContent(new ItemStack(testblock), 1, 10, 5));
    }

}
