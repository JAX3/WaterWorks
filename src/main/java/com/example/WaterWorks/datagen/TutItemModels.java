package com.example.WaterWorks.datagen;

import com.example.WaterWorks.setup.Registration;
import com.example.WaterWorks.waterworks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class TutItemModels  extends ItemModelProvider {
    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper){
        super(generator, waterworks.MODID,existingFileHelper);

    }


    @Override
    protected  void registerModels(){
        withExistingParent(Registration.WATERSTEEL_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(),modLoc( "block/watersteel_ore_end"));
        withExistingParent(Registration.WATERSTEEL_ORE_nether_ITEM.get().getRegistryName().getPath(),modLoc( "block/watersteel_ore_deepslate"));
        withExistingParent(Registration.WATERSTEEL_ORE_END_ITEM.get().getRegistryName().getPath(),modLoc( "block/watersteel_ore_overworld"));
        withExistingParent(Registration.WATERSTEEL_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(),modLoc( "block/watersteel_ore_nether"));
    }



}
