package com.example.examplemod;

import io.netty.handler.codec.redis.IntegerRedisMessage;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "megatools";
    public static final String NAME = "Mega Tools";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static Item.ToolMaterial myToolMaterial;
    public static Item mySword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        myToolMaterial = EnumHelper.addToolMaterial("MN", 4, 10428, 50.0F, 28.0F, 3);
        mySword = new CustomSword(myToolMaterial);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

    }
}
