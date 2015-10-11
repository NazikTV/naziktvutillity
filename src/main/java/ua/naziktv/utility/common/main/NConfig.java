package ua.naziktv.utility.common.main;


import DummyCore.Utils.IDummyConfig;
import net.minecraftforge.common.config.Configuration;
import ua.naziktv.utility.common.api.NLoger;

/**
 * Created by NazikTV on 21.08.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class NConfig implements IDummyConfig {
    //public static Configuration cfg;
    public static boolean ECGE, //enable craft GoldEgg
                          ECV,  //enable craft Villeger
                          ECN,  //enable craft Nazik entity
                          ECED, //enable craft Ench Diamont
                          ECEDA, //enable craft Ench Diamont Armor
                          ECSC, //enable craft string from coton
                          ECTB, //enable craft TestBlock
                          ECEE, //enable craft EnchEmerald
                          EC,   //enable all craft
                          EM,   //enable all mod
                          EDEBUG, //enable debug
                          ESF;  //enable spawn fire when firearms
    public static Configuration config1;
    @Override
    public void load(Configuration config) {
        NLoger.DEBUG("Load config");
        config.load();
        //public static
        ECGE = config.get("Enablecraft", "ECGE", true).getBoolean();
        ECV = config.get("Enablecraft", "ECVillager", true).getBoolean();
        ECN = config.get("Enablecraft", "ECNazikEntity", true).getBoolean();
        ECED = config.get("Enablecraft", "ECED", true).getBoolean();
        ECEDA = config.get("Enablecraft", "ECEDArmor", true).getBoolean();
        ECSC = config.get("Enablecraft", "ECStringFromCoton", true).getBoolean();
        ECTB = config.get("Enablecraft", "ECTestblock", true).getBoolean();
        ECEE = config.get("Enablecraft", "ECEE", true).getBoolean();
        EC = config.get("Enablecraft", "ECALL", true).getBoolean();
        EM = config.get(Configuration.CATEGORY_GENERAL, "EALLMOD", true).getBoolean();
        EDEBUG = config.get(Configuration.CATEGORY_GENERAL, "EnDEBUG", false).getBoolean();
        ESF = config.get(Configuration.CATEGORY_GENERAL, "ESpawnFire", true).getBoolean();
        //config.setCategoryComment("Enablecraft", "Enable craft from items");
        config.save();
        config1 = config;
    }

    public static void save(Configuration config){
        config.save();
    }

}
