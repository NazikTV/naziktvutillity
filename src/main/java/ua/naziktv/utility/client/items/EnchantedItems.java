package ua.naziktv.utility.client.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import ua.naziktv.utility.API.NLoger;
import ua.naziktv.utility.client.main.NMain;
import java.util.List;

/**
 * Created by NazikTV on 12.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class EnchantedItems extends Item implements IBauble {

    public boolean hott;
    public boolean amulet;

    protected EnchantedItems(int id, boolean hot, boolean isamulet) {
        super();
        hott = hot;
        amulet = isamulet;
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("Enchanted Diamond");
        par3List.add("Using for armor");
    }

    public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
        if (hott) {
            player.addPotionEffect(new PotionEffect(NMain.hotarms.id, 20));
            if (player.worldObj.rand.nextInt(2) == 0) {
                player.attackEntityFrom(DamageSource.inFire, 2);
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.epic;
    }

    @Override
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }

    @Override
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
        if (hott == true) {
            {
                if (world.isRemote) {
                    if (entity instanceof EntityPlayer) {
                        EntityPlayer player = (EntityPlayer) entity;
                        player.addPotionEffect(new PotionEffect(NMain.hotarms.id, 20 * 2, 2));
                    }
                }
            }
        }
    }

    @Override

    public BaubleType getBaubleType(ItemStack itemstack) {
        if (hott|amulet){
            return BaubleType.AMULET;
        }else
            return null;
    }

    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
        if (hott == true){
            player.addPotionEffect(new PotionEffect(NMain.hotarms.id, 20*2, 2));
            System.out.println("[Debug]  on worn tick");
        }
        if (amulet == true){
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 50, 1));
        }
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        if (hott == true){
            player.addPotionEffect(new PotionEffect(NMain.hotarms.id, Integer.MAX_VALUE));
            NLoger.DEBUG("HH");
        }
        if(!player.worldObj.isRemote) {
            player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.3F);
        }
    }

    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        if(!player.worldObj.isRemote) {
            player.worldObj.playSoundAtEntity(player, "random.pop", 0.1F, 1.3F);
            if(hott) {
                player.removePotionEffect(NMain.hotarms.id);
            }
            else if(amulet){
                player.removePotionEffect(Potion.fireResistance.id);
            }
        }
    }

    @Override
    public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
        return hott == true | amulet == true;
    }

    @Override
    public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
        return hott == true | amulet == true;
    }
}