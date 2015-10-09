package ua.naziktv.utility.client.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ua.naziktv.utility.client.main.NMain;

/**
 * Created by Comp on 12.07.2015.
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
