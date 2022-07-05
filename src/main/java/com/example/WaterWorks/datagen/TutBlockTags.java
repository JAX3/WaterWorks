package com.example.WaterWorks.datagen;

import com.example.WaterWorks.setup.Registration;
import com.example.WaterWorks.waterworks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.ApiStatus;

public class TutBlockTags extends BlockTagsProvider {
    public TutBlockTags(DataGenerator generator, ExistingFileHelper helper){
    super (generator, waterworks.MODID,helper);

    }

    @Override
    protected  void addTags(){
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.WATERSTEEL_ORE_OVERWORLD.get())
                .add(Registration.WATERSTEEL_ORE_DEEPSLATE.get())
                .add(Registration.WATERSTEEL_ORE_END.get())
                .add(Registration.WATERSTEEL_ORE_NETHER.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.WATERSTEEL_ORE_OVERWORLD.get())
                .add(Registration.WATERSTEEL_ORE_DEEPSLATE.get())
                .add(Registration.WATERSTEEL_ORE_END.get())
                .add(Registration.WATERSTEEL_ORE_NETHER.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.WATERSTEEL_ORE_OVERWORLD.get())
                .add(Registration.WATERSTEEL_ORE_DEEPSLATE.get())
                .add(Registration.WATERSTEEL_ORE_END.get())
                .add(Registration.WATERSTEEL_ORE_NETHER.get());


    }
@Override
public String getName(){return "Tutorial tags";
    }





}

