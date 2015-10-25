package ua.naziktv.utility.common.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelJeck extends ModelBase
{
    ModelRenderer Left;
    ModelRenderer Right;
    ModelRenderer down;
    ModelRenderer Up;
    ModelRenderer Block;
    ModelRenderer Torch;
    ModelRenderer Jeck;
    ModelRenderer Jeck1;
    ModelRenderer Jeck2;
    ModelRenderer Jeck3;
    ModelRenderer Jeck4;
    ModelRenderer Jeck5;
    ModelRenderer Jeck6;
    ModelRenderer Jeck7;
    ModelRenderer Jeck8;
    ModelRenderer Jeck9;
    ModelRenderer Jeck10;
    ModelRenderer Jeck11;
    ModelRenderer Jeck12;
    ModelRenderer Jeck13;
    ModelRenderer Jeck14;
    ModelRenderer Jeck15;
    ModelRenderer Jeck16;
    ModelRenderer Jeck17;
    ModelRenderer Jeck18;

    public ModelJeck()
    {
        this( 0.0f );
    }

    public ModelJeck(float par1)
    {
        Left = new ModelRenderer( this, 0, 0 );
        Left.setTextureSize( 64, 32 );
        Left.addBox( -0.5F, -8F, -8F, 1, 16, 16);
        Left.setRotationPoint( 0F, -8F, 0F );
        Right = new ModelRenderer( this, 0, 0 );
        Right.setTextureSize( 64, 32 );
        Right.addBox( -0.5F, -8F, -8F, 1, 16, 16);
        Right.setRotationPoint( 16F, -8F, 0F );
        down = new ModelRenderer( this, 0, 0 );
        down.setTextureSize( 64, 32 );
        down.addBox( -8F, -0.5F, -8F, 16, 1, 16);
        down.setRotationPoint( 8F, 0F, 0F );
        Up = new ModelRenderer( this, 0, 0 );
        Up.setTextureSize( 64, 32 );
        Up.addBox( -8F, -0.5F, -8F, 16, 1, 16);
        Up.setRotationPoint( 8F, -16F, 0F );
        Block = new ModelRenderer( this, 15, 15 );
        Block.setTextureSize( 64, 32 );
        Block.addBox( -8F, -8F, -0.5F, 16, 16, 1);
        Block.setRotationPoint( 8F, -8F, 8F );
        Torch = new ModelRenderer( this, 0, 12 );
        Torch.setTextureSize( 64, 32 );
        Torch.addBox( -1F, -5F, -1F, 2, 10, 2);
        Torch.setRotationPoint( 8F, -5F, 0F );
        Jeck = new ModelRenderer( this, 15, 15 );
        Jeck.setTextureSize( 64, 32 );
        Jeck.addBox( -1F, -8F, -17.5F, 2, 16, 1);
        Jeck.setRotationPoint( 1F, -8F, 9F );
        Jeck1 = new ModelRenderer( this, 15, 15 );
        Jeck1.setTextureSize( 64, 32 );
        Jeck1.addBox( -1F, -8F, -17.5F, 2, 16, 1);
        Jeck1.setRotationPoint( 15F, -8F, 9F );
        Jeck2 = new ModelRenderer( this, 15, 15 );
        Jeck2.setTextureSize( 64, 32 );
        Jeck2.addBox( -8F, -1F, -17.5F, 16, 2, 1);
        Jeck2.setRotationPoint( 8F, -1F, 9F );
        Jeck3 = new ModelRenderer( this, 15, 15 );
        Jeck3.setTextureSize( 64, 32 );
        Jeck3.addBox( -8F, -1F, -17.5F, 16, 2, 1);
        Jeck3.setRotationPoint( 8F, -15F, 9F );
        Jeck4 = new ModelRenderer( this, 15, 15 );
        Jeck4.setTextureSize( 64, 32 );
        Jeck4.addBox( -1F, -1F, -17.5F, 2, 2, 1);
        Jeck4.setRotationPoint( 3F, -13F, 9F );
        Jeck5 = new ModelRenderer( this, 15, 15 );
        Jeck5.setTextureSize( 64, 32 );
        Jeck5.addBox( -1F, -1F, -17.5F, 2, 2, 1);
        Jeck5.setRotationPoint( 13F, -13F, 9F );
        Jeck6 = new ModelRenderer( this, 15, 15 );
        Jeck6.setTextureSize( 64, 32 );
        Jeck6.addBox( -1F, -0.5F, -17.5F, 2, 1, 1);
        Jeck6.setRotationPoint( 13F, -2F, 9F );
        Jeck7 = new ModelRenderer( this, 15, 15 );
        Jeck7.setTextureSize( 64, 32 );
        Jeck7.addBox( -0.5F, -1F, -17.5F, 1, 2, 1);
        Jeck7.setRotationPoint( 2F, -3F, 9F );
        Jeck8 = new ModelRenderer( this, 15, 15 );
        Jeck8.setTextureSize( 64, 32 );
        Jeck8.addBox( -0.5F, -1F, -17.5F, 1, 2, 1);
        Jeck8.setRotationPoint( 12F, -3F, 9F );
        Jeck9 = new ModelRenderer( this, 15, 15 );
        Jeck9.setTextureSize( 64, 32 );
        Jeck9.addBox( -2F, -0.5F, -17.5F, 4, 1, 1);
        Jeck9.setRotationPoint( 8F, -2F, 9F );
        Jeck10 = new ModelRenderer( this, 15, 15 );
        Jeck10.setTextureSize( 64, 32 );
        Jeck10.addBox( -1F, -0.5F, -17.5F, 2, 1, 1);
        Jeck10.setRotationPoint( 4F, -2F, 9F );
        Jeck11 = new ModelRenderer( this, 15, 15 );
        Jeck11.setTextureSize( 64, 32 );
        Jeck11.addBox( -6F, -0.5F, -17.5F, 12, 1, 1);
        Jeck11.setRotationPoint( 8F, -7F, 9F );
        Jeck12 = new ModelRenderer( this, 15, 15 );
        Jeck12.setTextureSize( 64, 32 );
        Jeck12.addBox( -1F, -3.5F, -17.5F, 2, 7, 1);
        Jeck12.setRotationPoint( 8F, -11F, 9F );
        Jeck13 = new ModelRenderer( this, 15, 15 );
        Jeck13.setTextureSize( 64, 32 );
        Jeck13.addBox( -1F, -0.5F, -17.5F, 2, 1, 1);
        Jeck13.setRotationPoint( 9F, -6F, 9F );
        Jeck14 = new ModelRenderer( this, 15, 15 );
        Jeck14.setTextureSize( 64, 32 );
        Jeck14.addBox( -1F, -0.5F, -17.5F, 2, 1, 1);
        Jeck14.setRotationPoint( 5F, -6F, 9F );
        Jeck15 = new ModelRenderer( this, 15, 15 );
        Jeck15.setTextureSize( 64, 32 );
        Jeck15.addBox( -0.5F, -1F, -17.5F, 1, 2, 1);
        Jeck15.setRotationPoint( 14F, -6F, 9F );
        Jeck16 = new ModelRenderer( this, 15, 15 );
        Jeck16.setTextureSize( 64, 32 );
        Jeck16.addBox( -0.5F, -0.5F, -17.5F, 1, 1, 1);
        Jeck16.setRotationPoint( 2F, -6F, 9F );
        Jeck17 = new ModelRenderer( this, 15, 15 );
        Jeck17.setTextureSize( 64, 32 );
        Jeck17.addBox( -1F, -1F, -17.5F, 2, 2, 1);
        Jeck17.setRotationPoint( 10F, -8F, 9F );
        Jeck18 = new ModelRenderer( this, 15, 15 );
        Jeck18.setTextureSize( 64, 32 );
        Jeck18.addBox( -0.5F, -1F, -17.5F, 1, 2, 1);
        Jeck18.setRotationPoint( 7F, -8F, 9F );





        /*Left = new ModelRenderer( this, 0, 0 );
        Left.setTextureSize( 64, 32 );
        Left.addBox( -0.5F, 8F, -8F, 1, 16, 16);
        //Left.setRotationPoint( 0F, -8F, 0F );
        Right = new ModelRenderer( this, 0, 0 );
        Right.setTextureSize( 64, 32 );
        Right.addBox( -0.5F, -8F, -8F, 1, 16, 16);
        Right.setRotationPoint( 0F, -8F, 0F );
        down = new ModelRenderer( this, 0, 0 );
        down.setTextureSize( 64, 32 );
        down.addBox( -8F, -0.5F, -8F, 16, 1, 16);
        //down.setRotationPoint( 8F, 0F, 0F );
        Up = new ModelRenderer( this, 0, 0 );
        Up.setTextureSize( 64, 32 );
        Up.addBox( -8F, -0.5F, -8F, 16, 1, 16);
        //Up.setRotationPoint( 8F, -16F, 0F );
        Block = new ModelRenderer( this, 15, 15 );
        Block.setTextureSize( 64, 32 );
        Block.addBox( -8F, -8F, -0.5F, 16, 16, 1);
        //Block.setRotationPoint( 8F, -8F, 8F );
        Torch = new ModelRenderer( this, 0, 9 );
        Torch.setTextureSize( 64, 32 );
        Torch.addBox( -1F, -5F, -1F, 2, 8, 2);
        //Torch.setRotationPoint( 8F, -5F, 0F );
        Jeck = new ModelRenderer( this, 15, 15 );
        Jeck.setTextureSize( 64, 32 );
        Jeck.addBox( -1F, -8F, -17.5F, 2, 16, 1);
        //Jeck.setRotationPoint( 1F, -8F, 9F );
        Jeck1 = new ModelRenderer( this, 15, 15 );
        Jeck1.setTextureSize( 64, 32 );
        Jeck1.addBox( -1F, -8F, -17.5F, 2, 16, 1);
        //Jeck1.setRotationPoint( 15F, -8F, 9F );
        Jeck2 = new ModelRenderer( this, 15, 15 );
        Jeck2.setTextureSize( 64, 32 );
        Jeck2.addBox( -8F, -1F, -17.5F, 16, 2, 1);
        //Jeck2.setRotationPoint( 8F, -1F, 9F );
        Jeck3 = new ModelRenderer( this, 15, 15 );
        Jeck3.setTextureSize( 64, 32 );
        Jeck3.addBox( -8F, -1F, -17.5F, 16, 2, 1);
        //Jeck3.setRotationPoint( 8F, -15F, 9F );
        Jeck4 = new ModelRenderer( this, 15, 15 );
        Jeck4.setTextureSize( 64, 32 );
        Jeck4.addBox( -1F, -1F, -17.5F, 2, 2, 1);
        //Jeck4.setRotationPoint( 3F, -13F, 9F );
        Jeck5 = new ModelRenderer( this, 15, 15 );
        Jeck5.setTextureSize( 64, 32 );
        Jeck5.addBox( -1F, -1F, -17.5F, 2, 2, 1);
        //Jeck5.setRotationPoint( 13F, -13F, 9F );
        Jeck6 = new ModelRenderer( this, 15, 15 );
        Jeck6.setTextureSize( 64, 32 );
        Jeck6.addBox( -1F, -0.5F, -17.5F, 2, 1, 1);
        //Jeck6.setRotationPoint( 13F, -2F, 9F );
        Jeck7 = new ModelRenderer( this, 15, 15 );
        Jeck7.setTextureSize( 64, 32 );
        Jeck7.addBox( -0.5F, -1F, -17.5F, 1, 2, 1);
        //Jeck7.setRotationPoint( 2F, -3F, 9F );
        Jeck8 = new ModelRenderer( this, 15, 15 );
        Jeck8.setTextureSize( 64, 32 );
        Jeck8.addBox( -0.5F, -1F, -17.5F, 1, 2, 1);
        //Jeck8.setRotationPoint( 12F, -3F, 9F );
        Jeck9 = new ModelRenderer( this, 15, 15 );
        Jeck9.setTextureSize( 64, 32 );
        Jeck9.addBox( -2F, -0.5F, -17.5F, 4, 1, 1);
        //Jeck9.setRotationPoint( 8F, -2F, 9F );
        Jeck10 = new ModelRenderer( this, 15, 15 );
        Jeck10.setTextureSize( 64, 32 );
        Jeck10.addBox( -1F, -0.5F, -17.5F, 2, 1, 1);
        //Jeck10.setRotationPoint( 4F, -2F, 9F );
        Jeck11 = new ModelRenderer( this, 15, 15 );
        Jeck11.setTextureSize( 64, 32 );
        Jeck11.addBox( -6F, -0.5F, -17.5F, 12, 1, 1);
        //Jeck11.setRotationPoint( 8F, -7F, 9F );
        Jeck12 = new ModelRenderer( this, 15, 15 );
        Jeck12.setTextureSize( 64, 32 );
        Jeck12.addBox( -1F, -3.5F, -17.5F, 2, 7, 1);
        //Jeck12.setRotationPoint( 8F, -11F, 9F );
        Jeck13 = new ModelRenderer( this, 15, 15 );
        Jeck13.setTextureSize( 64, 32 );
        Jeck13.addBox( -1F, -0.5F, -17.5F, 2, 1, 1);
        //Jeck13.setRotationPoint( 9F, -6F, 9F );
        Jeck14 = new ModelRenderer( this, 15, 15 );
        Jeck14.setTextureSize( 64, 32 );
        Jeck14.addBox( -1F, -0.5F, -17.5F, 2, 1, 1);
        //Jeck14.setRotationPoint( 5F, -6F, 9F );
        Jeck15 = new ModelRenderer( this, 15, 15 );
        Jeck15.setTextureSize( 64, 32 );
        Jeck15.addBox( -0.5F, -1F, -17.5F, 1, 2, 1);
        Jeck15.setRotationPoint( 14F, -6F, 9F );
        //Jeck16 = new ModelRenderer( this, 15, 15 );
        //Jeck16.setTextureSize( 64, 32 );
        //Jeck16.addBox( -0.5F, -0.5F, -17.5F, 1, 1, 1);
        Jeck16.setRotationPoint( 2F, -6F, 9F );
        Jeck17 = new ModelRenderer( this, 15, 15 );
        Jeck17.setTextureSize( 64, 32 );
        Jeck17.addBox( -1F, -1F, -17.5F, 2, 2, 1);
        //Jeck17.setRotationPoint( 10F, -8F, 9F );
        Jeck18 = new ModelRenderer( this, 15, 15 );
        Jeck18.setTextureSize( 64, 32 );
        Jeck18.addBox( -0.5F, -1F, -17.5F, 1, 2, 1);
        //Jeck18.setRotationPoint( 7F, -8F, 9F );*/
    }

   public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
   {
        Left.rotateAngleX = 0F;
        Left.rotateAngleY = 0F;
        Left.rotateAngleZ = 0F;
        Left.renderWithRotation(par7);

        Right.rotateAngleX = 0F;
        Right.rotateAngleY = 0F;
        Right.rotateAngleZ = 0F;
        Right.renderWithRotation(par7);

        down.rotateAngleX = 0F;
        down.rotateAngleY = 0F;
        down.rotateAngleZ = 0F;
        down.renderWithRotation(par7);

        Up.rotateAngleX = 0F;
        Up.rotateAngleY = 0F;
        Up.rotateAngleZ = 0F;
        Up.renderWithRotation(par7);

        Block.rotateAngleX = 0F;
        Block.rotateAngleY = 0F;
        Block.rotateAngleZ = 0F;
        Block.renderWithRotation(par7);

        Torch.rotateAngleX = 0F;
        Torch.rotateAngleY = 0F;
        Torch.rotateAngleZ = 0F;
        Torch.renderWithRotation(par7);

        Jeck.rotateAngleX = 0F;
        Jeck.rotateAngleY = 0F;
        Jeck.rotateAngleZ = 0F;
        Jeck.renderWithRotation(par7);

        Jeck1.rotateAngleX = 0F;
        Jeck1.rotateAngleY = 0F;
        Jeck1.rotateAngleZ = 0F;
        Jeck1.renderWithRotation(par7);

        Jeck2.rotateAngleX = 0F;
        Jeck2.rotateAngleY = 0F;
        Jeck2.rotateAngleZ = 0F;
        Jeck2.renderWithRotation(par7);

        Jeck3.rotateAngleX = 0F;
        Jeck3.rotateAngleY = 0F;
        Jeck3.rotateAngleZ = 0F;
        Jeck3.renderWithRotation(par7);

        Jeck4.rotateAngleX = 0F;
        Jeck4.rotateAngleY = 0F;
        Jeck4.rotateAngleZ = 0F;
        Jeck4.renderWithRotation(par7);

        Jeck5.rotateAngleX = 0F;
        Jeck5.rotateAngleY = 0F;
        Jeck5.rotateAngleZ = 0F;
        Jeck5.renderWithRotation(par7);

        Jeck6.rotateAngleX = 0F;
        Jeck6.rotateAngleY = 0F;
        Jeck6.rotateAngleZ = 0F;
        Jeck6.renderWithRotation(par7);

        Jeck7.rotateAngleX = 0F;
        Jeck7.rotateAngleY = 0F;
        Jeck7.rotateAngleZ = 0F;
        Jeck7.renderWithRotation(par7);

        Jeck8.rotateAngleX = 0F;
        Jeck8.rotateAngleY = 0F;
        Jeck8.rotateAngleZ = 0F;
        Jeck8.renderWithRotation(par7);

        Jeck9.rotateAngleX = 0F;
        Jeck9.rotateAngleY = 0F;
        Jeck9.rotateAngleZ = 0F;
        Jeck9.renderWithRotation(par7);

        Jeck10.rotateAngleX = 0F;
        Jeck10.rotateAngleY = 0F;
        Jeck10.rotateAngleZ = 0F;
        Jeck10.renderWithRotation(par7);

        Jeck11.rotateAngleX = 0F;
        Jeck11.rotateAngleY = 0F;
        Jeck11.rotateAngleZ = 0F;
        Jeck11.renderWithRotation(par7);

        Jeck12.rotateAngleX = 0F;
        Jeck12.rotateAngleY = 0F;
        Jeck12.rotateAngleZ = 0F;
        Jeck12.renderWithRotation(par7);

        Jeck13.rotateAngleX = 0F;
        Jeck13.rotateAngleY = 0F;
        Jeck13.rotateAngleZ = 0F;
        Jeck13.renderWithRotation(par7);

        Jeck14.rotateAngleX = 0F;
        Jeck14.rotateAngleY = 0F;
        Jeck14.rotateAngleZ = 0F;
        Jeck14.renderWithRotation(par7);

        Jeck15.rotateAngleX = 0F;
        Jeck15.rotateAngleY = 0F;
        Jeck15.rotateAngleZ = 0F;
        Jeck15.renderWithRotation(par7);

        Jeck16.rotateAngleX = 0F;
        Jeck16.rotateAngleY = 0F;
        Jeck16.rotateAngleZ = 0F;
        Jeck16.renderWithRotation(par7);

        Jeck17.rotateAngleX = 0F;
        Jeck17.rotateAngleY = 0F;
        Jeck17.rotateAngleZ = 0F;
        Jeck17.renderWithRotation(par7);

        Jeck18.rotateAngleX = 0F;
        Jeck18.rotateAngleY = 0F;
        Jeck18.rotateAngleZ = 0F;
        Jeck18.renderWithRotation(par7);

    }

}
