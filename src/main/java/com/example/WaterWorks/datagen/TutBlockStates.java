package com.example.WaterWorks.datagen;

import com.example.WaterWorks.setup.Registration;
import com.example.WaterWorks.waterworks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockStates  extends BlockStateProvider {
    public TutBlockStates (DataGenerator gen, ExistingFileHelper helper){ super(gen, waterworks.MODID,helper);}
        @Override
        protected void registerStatesAndModels(){
            simpleBlock(Registration.WATERSTEEL_ORE_OVERWORLD.get());
            simpleBlock(Registration.WATERSTEEL_ORE_DEEPSLATE.get());
            simpleBlock(Registration.WATERSTEEL_ORE_NETHER.get());
            simpleBlock(Registration.WATERSTEEL_ORE_END.get());

        }
    }


