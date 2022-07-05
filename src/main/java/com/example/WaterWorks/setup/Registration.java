package com.example.WaterWorks.setup;



import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.WaterWorks.waterworks.MODID;

public class Registration {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,MODID);


    public static void init(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
    public static  final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f);
    public static final Item.Properties ITEM_PROPERTIES =new Item.Properties().tab(MODsetup.ITEM_GROUP);
    //Overworld
    public static final RegistryObject<Block> WATERSTEEL_ORE_OVERWORLD =BLOCKS.register("watersteel_ore_overworld",()-> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> WATERSTEEL_ORE_OVERWORLD_ITEM = fromBlock(WATERSTEEL_ORE_OVERWORLD);
//nether
public static final RegistryObject<Block> WATERSTEEL_ORE_NETHER= BLOCKS.register("watersteel_ore_nether",()-> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> WATERSTEEL_ORE_nether_ITEM = fromBlock(WATERSTEEL_ORE_NETHER);
    //end
    public static final RegistryObject<Block> WATERSTEEL_ORE_END=BLOCKS.register("watersteel_ore_end",()-> new  Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> WATERSTEEL_ORE_END_ITEM = fromBlock(WATERSTEEL_ORE_END);
    //deepslate
    public static final RegistryObject<Block> WATERSTEEL_ORE_DEEPSLATE=BLOCKS.register("watersteel_ore_deepslate",()->  new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> WATERSTEEL_ORE_DEEPSLATE_ITEM = fromBlock(WATERSTEEL_ORE_DEEPSLATE);


    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block){

        return ITEMS.register(block.getId().getPath(),()-> new BlockItem(block.get(), ITEM_PROPERTIES));
    }


}
