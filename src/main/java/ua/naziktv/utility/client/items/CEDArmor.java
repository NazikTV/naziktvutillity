package ua.naziktv.utility.client.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ua.naziktv.utility.client.main.NMain;

/**
 * Created by NazikTV on 30.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class CEDArmor extends ItemArmor {

    private String texturePath = "nazikutility:textures/model/armor/";


    public CEDArmor(int id, int armorType) {
        super(NItems.ED, id, armorType);
        this.setCreativeTab(NMain.tabNazikTV);
        this.setMaxStackSize(1);
        this.setTextureName();
    }

    public void setTextureName() {
        this.texturePath += "CED_" + 1 + ".png";
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
}
