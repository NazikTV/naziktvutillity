package ua.naziktv.utility.client.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.util.EnumHelper;
import ua.naziktv.utility.API.ItemAPI;
import ua.naziktv.utility.client.blocks.NBlocks;
import ua.naziktv.utility.client.main.NMain;

/**
 * Created by Comp on 24.07.2015.
 */
public class NItems {
    static Item.ToolMaterial NEWMAT = EnumHelper.addToolMaterial("Creative", 3, 5000, 38.5F, 35.3F, 50);
    static Item.ToolMaterial NEWMATSWORD = EnumHelper.addToolMaterial("Creative sword", 3, 5000, 500.5F, 500.5F, 50);
    static ItemArmor.ArmorMaterial BESTMAT = EnumHelper.addArmorMaterial("BESTMAT", 500, new int[]{7, 10, 9, 6}, 300);
    static ItemArmor.ArmorMaterial ED = EnumHelper.addArmorMaterial("ED", 150, new int[]{3, 8, 6, 3}, 40);

    public static Item GoldEgg = new goldegg(1241).setUnlocalizedName("GoldEgg").setCreativeTab(NMain.tabNazikTV),
                        CPickaxe = new CPickaxe(1242).setUnlocalizedName("CPickaxe").setCreativeTab(NMain.tabNazikTV),
                        CAxe = new CAxe(1243).setUnlocalizedName("CAxe").setCreativeTab(NMain.tabNazikTV),
                        Creativehelmet = new CreativeArmor(0, 0).setUnlocalizedName("Creativehelmet").setTextureName("nazikutility:CArmorHelmet").setCreativeTab(NMain.tabNazikTV),
                        Creativeplate = new CreativeArmor(0, 1).setUnlocalizedName("Creativeplate").setTextureName("nazikutility:CArmorPlate").setCreativeTab(NMain.tabNazikTV),
                        Creativepants = new CreativeArmor(0, 2).setUnlocalizedName("Creativepants").setTextureName("nazikutility:CArmorPants").setCreativeTab(NMain.tabNazikTV),
                        Creativeboots = new CreativeArmor(0, 3).setUnlocalizedName("Creativeboots").setTextureName("nazikutility:CArmorBoots").setCreativeTab(NMain.tabNazikTV),
                        EnchantedDiamond = new EnchantedItems(2401,false, false).setUnlocalizedName("EnchantedDiamond").setCreativeTab(NMain.tabNazikTV).setTextureName("nazikutility:diamond"),
                        EDhelmet = new EDArmor(0, 0).setUnlocalizedName("EDhelmet").setTextureName("nazikutility:EDhelmet").setCreativeTab(NMain.tabNazikTV),
                        EDplate = new EDArmor(0, 1).setUnlocalizedName("EDplate").setTextureName("nazikutility:EDplate").setCreativeTab(NMain.tabNazikTV),
                        EDpants = new EDArmor(0, 2).setUnlocalizedName("EDpants").setTextureName("nazikutility:EDpants").setCreativeTab(NMain.tabNazikTV),
                        EDboots = new EDArmor(0, 3).setUnlocalizedName("EDboots").setTextureName("nazikutility:EDboots").setCreativeTab(NMain.tabNazikTV),
                        CottonSeed = new ItemSeeds(NBlocks.Cotton, Blocks.farmland).setUnlocalizedName("CottonSeed").setTextureName("nazikutility:cotton_seeds").setCreativeTab(NMain.tabNazikTV),
                        Cottons = new ItemSeeds(NBlocks.Cotton, Blocks.farmland).setUnlocalizedName("Cotton").setTextureName("nazikutility:cotton_plant").setCreativeTab(NMain.tabNazikTV),
                        EnEmerald = new EnchantedItems(1241,true, false).setCreativeTab(NMain.tabNazikTV).setTextureName("nazikutility:emerald").setUnlocalizedName("EnEm"),
                        EnEmeraldC = new EnchantedItems(1243,false, false).setCreativeTab(NMain.tabNazikTV).setTextureName(NMain.modid + ":emeraldC").setUnlocalizedName("EnEmControler"),
                        CEnEmerald = new EnchantedItems(1244,false, true).setCreativeTab(NMain.tabNazikTV).setTextureName(NMain.modid+":Cemerald").setUnlocalizedName("ControledEnEm"),
                        EED = new EnchantedItems(1245,false,false).setCreativeTab(NMain.tabNazikTV).setTextureName(NMain.modid + ":EED").setUnlocalizedName("EnchEmDust"),
                        EmeraldD = new ItemAPI("ED", true).setTextureName(NMain.modid + ":emeraldDust"),
                        FandStick = new FlintAndStick().setCreativeTab(NMain.tabNazikTV),
                        Bowl = new ItemAPI("StoneBowl", false).setTextureName(NMain.modid + ":bowl"),
                        PaintBukkit = new PaintBukkit().setCreativeTab(NMain.tabNazikTV),
                        CEDplate = new CEDArmor(0, 1).setUnlocalizedName("CEDplate").setTextureName("nazikutility:CEDplate").setCreativeTab(NMain.tabNazikTV);


    public static void registerItem(){

        GameRegistry.registerItem(EnchantedDiamond, "EnchantedDiamond");
        GameRegistry.registerItem(EDplate, "EDplate");
        GameRegistry.registerItem(EDpants, "EDpants");
        GameRegistry.registerItem(EDboots, "EDboots");
        GameRegistry.registerItem(EDhelmet, "EDhelmet");
        GameRegistry.registerItem(Creativehelmet, "Creativehelmet");
        GameRegistry.registerItem(Creativeplate, "Creativeplate");
        GameRegistry.registerItem(CEDplate, "CEDplate");
        GameRegistry.registerItem(Creativepants, "Creativepants");
        GameRegistry.registerItem(Creativeboots, "Creativeboots");
        GameRegistry.registerItem(EnEmerald, "EnEmerald");
        GameRegistry.registerItem(Cottons, "Cotons");
        GameRegistry.registerItem(CottonSeed, "CottonSeed");
        GameRegistry.registerItem(GoldEgg, "GoldEgg");
        GameRegistry.registerItem(CPickaxe, "CPickaxe");
        GameRegistry.registerItem(CAxe, "CAxe");
        GameRegistry.registerItem(EnEmeraldC, "EnEmeraldC");
        GameRegistry.registerItem(CEnEmerald, "CEnEmerald");
        GameRegistry.registerItem(EmeraldD, "EmeraldD");
        GameRegistry.registerItem(EED, "EED");
        GameRegistry.registerItem(FandStick, "FlintAndStick");
        GameRegistry.registerItem(Bowl, "StoneBowl");
        GameRegistry.registerItem(PaintBukkit, "PaintBukkit");

        ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST,
                new WeightedRandomChestContent(new ItemStack(GoldEgg), 3, 15, 4));
    }


}


