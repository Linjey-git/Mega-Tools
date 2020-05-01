package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class CustomSuperSword extends ItemPickaxe {

    protected CustomSuperSword(ToolMaterial material) {
        super(material);
        this.attackDamage = 50.0F;
        this.attackSpeed = 4.0F;
        this.efficiency = 25.0F;
        this.setRegistryName("mega_super_sword");
        this.setUnlocalizedName("mega_super_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
