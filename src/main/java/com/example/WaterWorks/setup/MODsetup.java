package com.example.WaterWorks.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class MODsetup{

public static final String TAB_NAME ="WaterWorks";
public static  final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.BUCKET);}

};

    public static void init(FMLCommonSetupEvent event){

    }
}
