package ua.naziktv.utility.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import ua.naziktv.utility.common.api.BlockCropsApi;
import ua.naziktv.utility.common.items.ItemBlockGeneric;
import ua.naziktv.utility.common.main.NMain;

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
    public static Block AdvancFur = new AdvancetFur(false).setBlockName("AdvancFur"),
            AdvancFurAct = new AdvancetFur(true).setBlockName("AdvancFurAct"),
            FASBlock = new FASBlock().setCreativeTab(NMain.tabNazikTV).setBlockTextureName(NMain.modid + ":FASB1"),
            JeckLogOak = new JeckLogOak().setCreativeTab(NMain.tabNazikTV).setBlockName("JeckLogOak").setBlockTextureName("nazikutility:JeckLog/oak"),
            JeckLogBirch = new JeckLogBirch().setCreativeTab(NMain.tabNazikTV).setBlockName("JeckLogBirch").setBlockTextureName("nazikutility:JeckLog/birch"),
            JeckLogSpruce = new JeckLogSpruce().setCreativeTab(NMain.tabNazikTV).setBlockName("JeckLogSpruce").setBlockTextureName("nazikutility:JeckLog/spruce"),
            JeckLogAcacia = new JeckLogAcacia().setCreativeTab(NMain.tabNazikTV).setBlockName("JeckLogAcacia").setBlockTextureName("nazikutility:JeckLog/acacia"),
            JeckLogBigOak = new JeckLogBigOak().setCreativeTab(NMain.tabNazikTV).setBlockName("JeckLogBigOak").setBlockTextureName("nazikutility:JeckLog/bigoak"),
            JeckLogJungle = new JeckLogJungle().setCreativeTab(NMain.tabNazikTV).setBlockName("JeckLogJungle").setBlockTextureName("nazikutility:JeckLog/jungle"),
            ClockN = new ClockNB().setCreativeTab(NMain.tabNazikTV).setBlockName("ClockNum"),
            PaintQuarz = new PaintQuarz().setCreativeTab(NMain.tabNazikTV).setBlockName("PaintQuarz");

    public static void registerBlocks() {
        GameRegistry.registerBlock(PaintQuarz, ItemBlockGeneric.class, "PaintQuarz");
        GameRegistry.registerBlock(ClockN, ItemBlockGeneric.class, "ClockNum");
        GameRegistry.registerBlock(Cotton, "Cotton");
        GameRegistry.registerBlock(testblock, "Testblock").setCreativeTab(NMain.tabNazikTV);
        GameRegistry.registerBlock(FASBlock, "FASBlock");
        GameRegistry.registerBlock(ClockBlock, "ClockBlock");
        GameRegistry.registerBlock(AdvancFur, "AdvancFur").setCreativeTab(NMain.tabNazikTV);
        GameRegistry.registerBlock(AdvancFurAct, "AdvancFurAct");
        GameRegistry.registerBlock(JeckLogOak, "JeckLogOac");
        GameRegistry.registerBlock(JeckLogSpruce, "JeckLogSpruce");
        GameRegistry.registerBlock(JeckLogBigOak, "JeckLogBigOac");
        GameRegistry.registerBlock(JeckLogAcacia, "JeckLogAcacia");
        GameRegistry.registerBlock(JeckLogBirch, "JeckLogBirch");
        GameRegistry.registerBlock(JeckLogJungle, "JeckLogJungle");

        ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST,
                new WeightedRandomChestContent(new ItemStack(testblock), 5, 27, 3));
        ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR,
               new WeightedRandomChestContent(new ItemStack(testblock), 1, 10, 5));
    }

}
