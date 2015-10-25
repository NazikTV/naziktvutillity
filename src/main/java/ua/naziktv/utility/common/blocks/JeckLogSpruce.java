package ua.naziktv.utility.common.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import ua.naziktv.utility.common.entity.JeckLogSpruceEntity;

/**
 * Created by NazikTV on 24.10.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class JeckLogSpruce extends JeckLogOak {
    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new JeckLogSpruceEntity();
    }
}
