package ua.naziktv.utility.API;

import cpw.mods.fml.common.FMLCommonHandler;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ua.naziktv.utility.client.main.NConfig;

import java.io.IOException;

/**
 * Created by NazikTV on 02.08.2015.
 */
public class NLoger {
    //public static class LOG{
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
