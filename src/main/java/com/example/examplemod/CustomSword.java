package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class CustomSword extends ItemSword {
    public CustomSword(ToolMaterial material) {
        super(material);
        this.setRegistryName("mega_sword");
        this.setUnlocalizedName("mega_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.setMaxDamage(50);
//        hitEntity();
    }
//    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
//    {
//        par1ItemStack.damageItem(1, par3EntityLiving);
//        par2EntityLiving.addPotionEffect(new PotionEffect(Potion.getPotionById(20), 80, 10));
//        return true;
//    }
}
