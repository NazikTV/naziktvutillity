package ua.naziktv.utility.client.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class Testblock extends Block {
    protected Testblock(int id) {
        super(Material.iron);
        this.setBlockName("Testblock");
        this.setHardness(2F);
        this.setResistance(95555F);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(150F);
        this.setBlockTextureName("nazikutility:testblock");

    }
}
