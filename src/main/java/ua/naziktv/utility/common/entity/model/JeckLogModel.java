package ua.naziktv.utility.common.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by NazikTV on 23.10.2015.
 * This work is licensed under a Creative Commons
 * Attribution-ShareAlike 4.0 International License.
 * For show sourse visit https://github.com/NazikTV/naziktvutillity
 * My site http://naziktv.zz.mu/
 */
public class JeckLogModel extends ModelBase {

    private ForgeDirection dir;

    //fields
    public ModelRenderer Shape1;
    public ModelRenderer Shape2;
    public ModelRenderer Shape3;
    public ModelRenderer Shape4;
    public ModelRenderer Shape5;
    public ModelRenderer Shape6;
    public ModelRenderer Shape7;
    public ModelRenderer Shape8;
    //public

public JeckLogModel()
    {
        Shape1 = new ModelRenderer(this, 0, 0);// modelBase, texture ofset x, texture ofset y
        Shape1.addBox(-8F, 0F, -8F, 1, 16, 16, 0F);// положення X, y, Z, товщина x, y, z, Alfa??
        Shape1.setRotationPoint(0F, 0F, 0F);
        Shape1.rotateAngleX = 0F;
        Shape1.rotateAngleY = 0F;
        Shape1.rotateAngleZ = 0F;//                                                                 |  y   z
        Shape1.mirror = false;//                                                                    |  |  /
        Shape2 = new ModelRenderer(this, 0, 0);// modelBase, texture ofset x, texture ofset y       |  | /
        Shape2.addBox(7F, 0F, -8F, 1, 16, 16, 0F);// положення X, y, Z, товщина x, y, z, Alfa??     |  |/_______x
        Shape2.setRotationPoint(0F, 0F, 0F);
        Shape2.rotateAngleX = 0F;
        Shape2.rotateAngleY = 0F;
        Shape2.rotateAngleZ = 0F;
        Shape2.mirror = false;

        Shape3 = new ModelRenderer(this, 0, 0);
        Shape3.addBox(0F, 0F, 0F, 16, 1, 16, 0F);
        Shape3.setRotationPoint(0F, 0F, 0F);
        Shape3.rotateAngleX = 0F;
        Shape3.rotateAngleY = 0F;
        Shape3.rotateAngleZ = 0F;
        Shape3.mirror = false;
        /*Shape3 = new ModelRenderer(this, 0, 0);
        Shape3.addBox(0F, 0F, 0F, 1, 16, 16, 0F);
        Shape3.setRotationPoint(7F, 0F, -9F);
        Shape3.rotateAngleX = 0F;
        Shape3.rotateAngleY = 0F;
        Shape3.rotateAngleZ = 0F;
        Shape3.mirror = false;
        Shape4 = new ModelRenderer(this, 0, 0);
        Shape4.addBox(0F, 0F, 0F, 1, 14, 14, 0F);
        Shape4.setRotationPoint(7F, 0F, -8F);
        Shape4.rotateAngleX = 0F;
        Shape4.rotateAngleY = 0F;
        Shape4.rotateAngleZ = 1.570796F;
        Shape4.mirror = false;
        Shape5 = new ModelRenderer(this, 0, 0);
        Shape5.addBox(0F, 0F, 0F, 1, 14, 14, 0F);
        Shape5.setRotationPoint(7F, 15F, -8F);
        Shape5.rotateAngleX = 0F;
        Shape5.rotateAngleY = 0F;
        Shape5.rotateAngleZ = 1.570796F;
        Shape5.mirror = false;
        Shape6 = new ModelRenderer(this, 48, 52);
        Shape6.addBox(0F, 1F, 0F, 2, 7, 2, 0F);
        Shape6.setRotationPoint(-1F, 7F, 0F);
        Shape6.rotateAngleX = 0F;
        Shape6.rotateAngleY = 0F;
        Shape6.rotateAngleZ = 0F;
        Shape6.mirror = false;
        Shape7 = new ModelRenderer(this, 0, 0);
        Shape7.addBox(0F, 0F, 0F, 16, 2, 1, 0F);
        Shape7.setRotationPoint(-8F, 14F, 6F);
        Shape7.rotateAngleX = 0F;
        Shape7.rotateAngleY = 0F;
        Shape7.rotateAngleZ = 0F;
        Shape7.mirror = false;
        Shape8 = new ModelRenderer(this, 30, 16);
        Shape8.addBox(0F, 0F, 0F, 1, 16, 16, 0F);
        Shape8.setRotationPoint(-8F, 0F, 7F);
        Shape8.rotateAngleX = 0F;
        Shape8.rotateAngleY = 1.570796F;
        Shape8.rotateAngleZ = 0F;
        Shape8.mirror = false;*/

    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        /*Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
        Shape7.render(f5);
        Shape8.render(f5);*/
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}