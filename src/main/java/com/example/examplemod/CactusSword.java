package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CactusSword extends ItemSword {

    protected CactusSword(ToolMaterial material) {
        super(material);
        this.setMaxDamage(8);
        this.setRegistryName("cactus_sword");
        this.setUnlocalizedName("cactus_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
