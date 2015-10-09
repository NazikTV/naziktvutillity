package ua.naziktv.utility.client.main;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.event.entity.living.LivingEvent;
import ua.naziktv.utility.API.NLoger;
import ua.naziktv.utility.API.geXYZ;

import java.util.Random;

import static ua.naziktv.utility.client.items.NItems.*;
import static ua.naziktv.utility.client.items.NItems.CEDplate;

/**
 * Created by NazikTV on 02.08.2015.
 */
public class nazikutEventHooks {

    public nazikutEventHooks(){

    }

    private boolean canBurn(World world, int x, int y, int z) {
        if (world.getBlock(x, y, z) != Blocks.air)
            return false;
        for (ForgeDirection side : ForgeDirection.VALID_DIRECTIONS) {
            int sx = geXYZ.getXOnSide(x, side);
            int sy = geXYZ.getYOnSide(y, side);
            int sz = geXYZ.getZOnSide(z, side);
            if (!world.isAirBlock(sx, sy, sz)) {
                Block block = geXYZ.getBlock(world, sx, sy, sz);
                if (block != Blocks.fire)
                    return true;
            }
        }
        return false;
    }

    public void SpawnFire(LivingEvent.LivingUpdateEvent event) {
        if (NConfig.ESF) {
            EntityLivingBase player = event.entityLiving;
            Random rnd = player.getRNG();
            int x = (int) Math.round(player.posX) - 5 + rnd.nextInt(12);
            int y = (int) Math.round(player.posY) - 5 + rnd.nextInt(12);
            int z = (int) Math.round(player.posZ) - 3 + rnd.nextInt(10);
            int x1 = (int) Math.round(player.posX);
            int y1 = (int) Math.round(player.posY);
            int z1 = (int) Math.round(player.posZ);

            if (y < 1)
                y = 1;
            if (y > player.worldObj.getActualHeight())
                y = player.worldObj.getActualHeight() - 2;
            if (canBurn(player.worldObj, x, y, z)) {
                player.worldObj.setBlock(x, y, z, Blocks.fire);
            }
            if (canBurn(player.worldObj, x1, y1, z1)) {
                player.worldObj.setBlock(x1, y1, z1, Blocks.fire);
            }
        }
    }


    @SubscribeEvent
    public void onEntityUpdate(LivingEvent.LivingUpdateEvent event) {
        if (event.entityLiving.isPotionActive(NMain.hotarms)) {
            if (event.entityLiving.getActivePotionEffect(NMain.hotarms).getDuration()==0) {
                event.entityLiving.removePotionEffect(NMain.hotarms.id);
                return;
            }
            else SpawnFire(event);
        }

    }
    @SubscribeEvent
    public void ConfigChangedEvent(ConfigChangedEvent event) { //.OnConfigChangedEvent
        if (event.modID.equals(NMain.modid)) {
            saveconfig1();
            //NConfig.cfg.save();

            NLoger.WARN("change a config");
        }

    }
    @SubscribeEvent
    public void WorldTick(TickEvent event){
        if (NConfig.config1.hasChanged()){
            NConfig.config1.save();
        }


    }

    public void saveconfig1(){
        NConfig.ECGE = NConfig.config1.get("enablecraft", "ECGE", true).getBoolean();
        NConfig.ECV = NConfig.config1.get("enablecraft", "ECVillager", true).getBoolean();
        NConfig.ECN = NConfig.config1.get("enablecraft", "ECNazikEntity", true).getBoolean();
        NConfig.ECED = NConfig.config1.get("enablecraft", "ECED", true).getBoolean();
        NConfig.ECEDA = NConfig.config1.get("enablecraft", "ECEDArmor", true).getBoolean();
        NConfig.ECSC = NConfig.config1.get("enablecraft", "ECStringFromCoton", true).getBoolean();
        NConfig.ECTB = NConfig.config1.get("enablecraft", "ECTestblock", true).getBoolean();
        NConfig.ECEE = NConfig.config1.get("enablecraft", "ECEE", true).getBoolean();
        NConfig.EC = NConfig.config1.get("enablecraft", "ECALL", true).getBoolean();
        NConfig.EM = NConfig.config1.get(Configuration.CATEGORY_GENERAL, "EALLMOD", true).getBoolean();
        //config.setCategoryComment("enablecraft", "Enable craft from items");
        NConfig.config1.save();
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(NMain.modid))
        {

            saveconfig1();
        }
    }

}
