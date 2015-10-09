package ua.naziktv.utility.client.potion;

import net.minecraft.potion.Potion;
import ua.naziktv.utility.API.NLoger;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by NazikTV on 02.08.2015.
 */
public class Npotion {
 public static void register(){
    Potion[] potionTypes = null;
     new NLoger().DEBUG("Start loading Potion class");
    for (Field f : Potion.class.getDeclaredFields()) {
        f.setAccessible(true);
        try {
            if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")) {
                Field modfield = Field.class.getDeclaredField("modifiers");
                modfield.setAccessible(true);
                modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);

                potionTypes = (Potion[])f.get(null);
                final Potion[] newPotionTypes = new Potion[256];
                System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
                f.set(null, newPotionTypes);
            }
        }
        catch (Exception e) {
            System.err.println("Severe error, please report this to the mod author:");
            System.err.println(e);
        }
    }
     new NLoger().DEBUG("Stop loading Potion class");

}

}
