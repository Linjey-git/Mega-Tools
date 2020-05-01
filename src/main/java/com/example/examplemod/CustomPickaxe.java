package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe {
    protected CustomPickaxe(ToolMaterial material) {
        super(material);
        this.setRegistryName("mega_pickaxe");
        this.setUnlocalizedName("mega_pickaxe");
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.attackSpeed = 0.6F;
        this.efficiency = 15.0F;
    }
}
