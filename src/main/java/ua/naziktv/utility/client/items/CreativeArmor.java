package ua.naziktv.utility.client.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ua.naziktv.utility.client.main.NMain;

/**
 * Created by Comp on 07.07.2015.
 */
public class CreativeArmor extends ItemArmor {

    private String texturePath = "nazikutility:textures/model/armor/";

    public CreativeArmor(int id, int armorType) {
        super(NItems.BESTMAT, id, armorType);
        this.setCreativeTab(NMain.tabNazikTV);
        this.setMaxStackSize(1);
        this.setTextureName();
    }

    public void setTextureName() {
        if (armorType == 0 || armorType == 1 || armorType == 3) {
            this.texturePath += "CArmor_" + 1 + ".png";
        } else {
            this.texturePath += "CArmor_" + 2 + ".png";
        }
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
        return this.texturePath;
    }
}