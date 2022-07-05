package com.example.WaterWorks.datagen;

import com.example.WaterWorks.setup.Registration;
import com.example.WaterWorks.waterworks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.WaterWorks.setup.MODsetup.TAB_NAME;

public class TutLanguageProvider extends LanguageProvider {
    public TutLanguageProvider(DataGenerator gen,String locale){
        super(gen, waterworks.MODID, locale);
    }
    @Override
    protected void addTranslations(){
        add("itemGroup."+ TAB_NAME,"Tutorial");
        add(Registration.WATERSTEEL_ORE_OVERWORLD.get(),"WaterSteel ore");
        add(Registration.WATERSTEEL_ORE_END.get(),"WaterSteel ore");
        add(Registration.WATERSTEEL_ORE_NETHER.get(),"WaterSteel ore");
        add(Registration.WATERSTEEL_ORE_OVERWORLD.get(),"WaterSteel ore");
    }

}
