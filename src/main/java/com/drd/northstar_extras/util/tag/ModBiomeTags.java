package com.drd.northstar_extras.util.tag;

import com.drd.northstar_extras.NorthstarExtras;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class ModBiomeTags {
    public static final TagKey<Biome> VENUS_BIOMES = tag(NorthstarExtras.MOD_ID, "venus_biomes");
    public static final TagKey<Biome> JUPITER_BIOMES = tag(NorthstarExtras.MOD_ID, "jupiter_biomes");

    private static TagKey<Biome> tag(String modid, String name) {
        return TagKey.create(Registries.BIOME, new ResourceLocation(modid, name));
    }
}
