package com.drd.northstar_extras.planet;

import com.drd.northstar_extras.NorthstarExtras;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensionKeys {
    public static final ResourceKey<Level> JUPITER_DIM_KEY = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(NorthstarExtras.MOD_ID, "jupiter"));
    public static final ResourceKey<DimensionType> JUPITER_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(NorthstarExtras.MOD_ID, "jupiter"));

    public static void register() {
        System.out.println("Registering dimensions for Create: Northstar Extras");
    }
}
