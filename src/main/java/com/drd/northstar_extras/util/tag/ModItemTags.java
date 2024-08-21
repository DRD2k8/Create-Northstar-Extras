package com.drd.northstar_extras.util.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> MARTIAN_STEEL_INGOTS = tag("forge", "ingots/martian_steel");
    public static final TagKey<Item> MARTIAN_STEEL_PLATES = tag("forge", "plates/martian_steel");
    public static final TagKey<Item> MARTIAN_STEEL_BLOCKS = tag("forge", "storage_blocks/martian_steel");
    public static final TagKey<Item> RAW_TUNGSTEN = tag("forge", "raw_materials/tungsten");
    public static final TagKey<Item> TUNGSTEN_INGOTS = tag("forge", "ingots/tungsten");
    public static final TagKey<Item> TUNGSTEN_NUGGETS = tag("forge", "nuggets/tungsten");
    public static final TagKey<Item> TUNGSTEN_PLATES = tag("forge", "plates/tungsten");
    public static final TagKey<Item> TUNGSTEN_BLOCKS = tag("forge", "storage_blocks/tungsten");
    public static final TagKey<Item> TUNGSTEN_ORES = tag("forge", "ores/tungsten");
    public static final TagKey<Item> RAW_LEAD = tag("forge", "raw_materials/lead");
    public static final TagKey<Item> LEAD_INGOTS = tag("forge", "ingots/lead");
    public static final TagKey<Item> LEAD_NUGGETS = tag("forge", "nuggets/lead");
    public static final TagKey<Item> LEAD_PLATES = tag("forge", "plates/lead");
    public static final TagKey<Item> LEAD_BLOCKS = tag("forge", "storage_blocks/lead");
    public static final TagKey<Item> LEAD_ORES = tag("forge", "ores/lead");

    private static TagKey<Item> tag(String modid, String name) {
        return ItemTags.create(new ResourceLocation(modid, name));
    }
}
