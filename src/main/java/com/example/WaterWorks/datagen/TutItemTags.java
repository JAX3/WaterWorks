package com.example.WaterWorks.datagen;

import com.example.WaterWorks.setup.Registration;
import com.example.WaterWorks.waterworks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemTags  extends ItemTagsProvider {

    public TutItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, waterworks.MODID, helper);


    }

    @Override
    protected void addTags(){
        tag(Tags.Items.ORES)
                .add(Registration.WATERSTEEL_ORE_OVERWORLD_ITEM.get())
                .add(Registration.WATERSTEEL_ORE_DEEPSLATE_ITEM.get())
                .add(Registration.WATERSTEEL_ORE_END_ITEM.get())
                .add(Registration.WATERSTEEL_ORE_nether_ITEM.get());




    }
    @Override
    public String getName(){return "Tutorial Tags";}
}
