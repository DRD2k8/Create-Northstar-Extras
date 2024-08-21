package com.drd.northstar_extras.util.tag;

import com.drd.northstar_extras.NorthstarExtras;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> MARTIAN_STEEL_BLOCKS = tag("forge", "storage_blocks/martian_steel");
    public static final TagKey<Block> TUNGSTEN_BLOCKS = tag("forge", "storage_blocks/tungsten");
    public static final TagKey<Block> TUNGSTEN_ORES = tag("forge", "ores/tungsten");
    public static final TagKey<Block> LEAD_BLOCKS = tag("forge", "storage_blocks/lead");
    public static final TagKey<Block> LEAD_ORES = tag("forge", "ores/lead");
    public static final TagKey<Block> TIER_4_HEAT_RESISTANCE = tag(NorthstarExtras.MOD_ID, "tier_4_heat_resistance");

    private static TagKey<Block> tag(String modid, String name) {
        return BlockTags.create(new ResourceLocation(modid, name));
    }
}
