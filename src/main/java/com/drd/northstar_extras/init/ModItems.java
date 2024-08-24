package com.drd.northstar_extras.init;

import com.drd.northstar_extras.NorthstarExtras;
import com.simibubi.create.content.equipment.sandPaper.SandPaperItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NorthstarExtras.MOD_ID);

    public static final RegistryObject<Item> ARGYRE_SIGN = ITEMS.register("argyre_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ARGYRE_SIGN.get(), ModBlocks.ARGYRE_WALL_SIGN.get()));
    public static final RegistryObject<Item> COILER_SIGN = ITEMS.register("coiler_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.COILER_SIGN.get(), ModBlocks.COILER_WALL_SIGN.get()));
    public static final RegistryObject<Item> WILTER_SIGN = ITEMS.register("wilter_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WILTER_SIGN.get(), ModBlocks.WILTER_WALL_SIGN.get()));
    public static final RegistryObject<Item> CALORIAN_SIGN = ITEMS.register("calorian_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CALORIAN_SIGN.get(), ModBlocks.CALORIAN_WALL_SIGN.get()));
    public static final RegistryObject<Item> ARGYRE_HANGING_SIGN = ITEMS.register("argyre_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ARGYRE_HANGING_SIGN.get(), ModBlocks.ARGYRE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> COILER_HANGING_SIGN = ITEMS.register("coiler_hanging_sign",
            () -> new HangingSignItem(ModBlocks.COILER_HANGING_SIGN.get(), ModBlocks.COILER_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> WILTER_HANGING_SIGN = ITEMS.register("wilter_hanging_sign",
            () -> new HangingSignItem(ModBlocks.WILTER_HANGING_SIGN.get(), ModBlocks.WILTER_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> CALORIAN_HANGING_SIGN = ITEMS.register("calorian_hanging_sign",
            () -> new HangingSignItem(ModBlocks.CALORIAN_HANGING_SIGN.get(), ModBlocks.CALORIAN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MARS_SAND_PAPER = ITEMS.register("mars_sand_paper",
            () -> new SandPaperItem(new Item.Properties().defaultDurability(512)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_SHEET = ITEMS.register("lead_sheet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_RAW_PALLADIUM = ITEMS.register("crushed_raw_palladium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_NUGGET = ITEMS.register("palladium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_SHEET = ITEMS.register("palladium_sheet",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
