package ua.naziktv.utility.common.api;

import cpw.mods.fml.common.FMLCommonHandler;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ua.naziktv.utility.common.main.NConfig;

import java.io.IOException;

/**
 * Created by NazikTV on 11.10.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class NLoger {
    public static final Logger logger = LogManager.getLogger();
    public static void DEBUG(String text) {if(NConfig.EDEBUG) logger.log(Level.DEBUG ,"[NazikUtilityMod][DEBUG]"+text);}
    public static void DEBUG(int text) {if(NConfig.EDEBUG) logger.log(Level.DEBUG, "[NazikUtilityMod][DEBUG]"+text);}
    public static void DEBUG(double text){if(NConfig.EDEBUG) logger.log(Level.DEBUG, "[NazikUtilityMod][DEBUG]"+text);}
    public static void WARN(String text){logger.log(Level.WARN, "[NazikUtilityMod][WARN]"+text);}
    public static void ERROR(String text, boolean stopGame, IOException ioe) {
        String Text = "[NazikUtilityMod][ERROR]" + " " + text;
        FMLCommonHandler.instance().raiseException(ioe, Text, stopGame);
        logger.log(Level.ERROR, text);
    }


}
