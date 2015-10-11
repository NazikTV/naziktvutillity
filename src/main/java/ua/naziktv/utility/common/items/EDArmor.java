package ua.naziktv.utility.common.items;

import com.sun.istack.internal.NotNull;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ua.naziktv.utility.common.main.NMain;

import static ua.naziktv.utility.common.items.NItems.*;

/**
 * Created by NazikTV on 12.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class EDArmor extends ItemArmor {

    private String texturePath = "nazikutility:textures/model/armor/";


    public EDArmor(int id, int armorType) {
        super(NItems.ED, id, armorType);
        this.setCreativeTab(NMain.tabNazikTV);
        this.setMaxStackSize(1);
        this.setTextureName();
    }

    public void setTextureName() {
        if (armorType == 0 || armorType == 3) {
            this.texturePath += "ED_" + 1 + ".png";
        } else if (armorType == 1){
            this.texturePath += "ED_" + 11 + ".png";
        } else
            this.texturePath += "ED_" + 2 + ".png";
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
        return this.texturePath;
    }

    /*@Override
    public ISpecialArmor.ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
        if(source == DamageSource.inFire || source == DamageSource.lava || source == DamageSource.onFire) { //Check for fire damage, you can use other types of damage too.
            return new ISpecialArmor.ArmorProperties(1, 1, MathHelper.floor_double(damage * .15D));
        }
        return new ISpecialArmor.ArmorProperties(0, 0, 0);
    }*/

    @Override
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;


    }

    @NotNull
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (player.getCurrentArmor(0) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(3) != null) {
            ItemStack boots = player.getCurrentArmor(0);
            ItemStack leggings = player.getCurrentArmor(1);
            ItemStack chestplate = player.getCurrentArmor(2);
            ItemStack helmet = player.getCurrentArmor(3);
            if (boots.getItem() != null && boots.getItem() == EDboots && helmet.getItem() == EDhelmet && leggings.getItem() == EDpants) {
                if (chestplate.getItem() == EDplate) {
                    player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40, 5, false));
                    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));
                } else if (chestplate.getItem() == CEDplate) {
                    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));
                    player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 40, 5, false));
                    player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1, 5));

                }

            }

        }

    }

}

