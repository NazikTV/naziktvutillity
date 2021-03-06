package ua.naziktv.utility.common.api;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Keyboard;
import ua.naziktv.utility.common.main.NMain;

import java.util.List;


/**
 * Created by NazikTV on 29.07.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public  class ItemAPI extends Item {
    public Boolean haseffeckt;
    public String Name;
    public ItemAPI(String name, boolean efeckt){
        super();
        this.setMaxStackSize(64);
        this.setCreativeTab(NMain.tabNazikTV);
        this.setTextureName("nazikutility:none");
        this.setUnlocalizedName(name);
        haseffeckt = efeckt;
        Name = name;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.epic;
    }
    @Override
    public boolean hasEffect(ItemStack par1ItemStack) {
        return haseffeckt;
    }
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add(holdShift);
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
            translate();
            par3List.add(line1);
            par3List.add(line2);
            par3List.add(line3);
        }else{
			par3List.add(EnumChatFormatting.BLUE+""+ EnumChatFormatting.ITALIC+StatCollector.translateToLocal("items.holdshift"));
		}
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
    }
    public String line1;
    public String line2;
    public String line3;
    String holdShift;
    public void translate(){
        line1 = StatCollector.translateToLocal("item." + Name + ".line1");
        line2 = StatCollector.translateToLocal("item." + Name + ".line2");
        line3 = StatCollector.translateToLocal("item." + Name + ".line3");

        holdShift = StatCollector.translateToLocal("items.holdshift");
    }
}

