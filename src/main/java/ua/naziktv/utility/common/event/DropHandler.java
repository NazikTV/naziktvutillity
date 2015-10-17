package ua.naziktv.utility.common.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import ua.naziktv.utility.common.api.NUtillits;
import ua.naziktv.utility.common.blocks.NBlocks;
import ua.naziktv.utility.common.entity.NazikTVEntity;
import ua.naziktv.utility.common.items.NItems;

import java.util.Random;

/**
 * Created by NazikTV on 28.08.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class DropHandler
{
    public static Random random;
    public static int dropped;
    public static int shans;

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event)
    {
        random = new Random();
        dropped = (int)random.nextInt(25)/10 + 3; //DO NOT CHANGE THIS
        shans = random.nextInt(3);

        if(event.entityLiving instanceof NazikTVEntity)
        {
            if (shans == 0){
                event.entityLiving.entityDropItem(new ItemStack(NBlocks.testblock), dropped);
                if(dropped <2){
                    event.entityLiving.entityDropItem(new ItemStack(NBlocks.testblock), 1);
                    if (NUtillits.isCrismas()== false)
                        event.entityLiving.entityDropItem(new ItemStack(Items.diamond).setStackDisplayName("Surprise! =)"), 2);
                }
            }
            if (random.nextInt(10)==1){
                event.entityLiving.entityDropItem(new ItemStack(NItems.CEnEmerald), dropped);
                if(dropped < 2){
                    event.entityLiving.entityDropItem(new ItemStack(NItems.CEnEmerald), random.nextInt(2));
                }
            }
        }

    }

}
