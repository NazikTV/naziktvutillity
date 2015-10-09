package ua.naziktv.utility.client.main;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import ua.naziktv.utility.client.blocks.NBlocks;
import ua.naziktv.utility.client.enitity.NazikTVEntity;
import ua.naziktv.utility.client.items.NItems;

import java.util.Random;

/**
 * Created by NazikTV on 28.08.2015.
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
        dropped = random.nextInt(2) + 3; //DO NOT CHANGE THIS
        shans = random.nextInt(3);

        if(event.entityLiving instanceof NazikTVEntity)
        {
            if (shans == 0){
                event.entityLiving.entityDropItem(new ItemStack(NBlocks.testblock), dropped);
            }

        }

    }

}
