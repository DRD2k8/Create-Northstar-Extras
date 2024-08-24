package com.drd.northstar_extras.worldgen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.util.tag.ModBiomeTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_VENUS_LEAD_ORE = registerKey("venus/add_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_JUPITER_IRON_ORE = registerKey("jupiter/add_iron_ore");
    public static final ResourceKey<BiomeModifier> ADD_JUPITER_COPPER_ORE = registerKey("jupiter/add_copper_ore");
    public static final ResourceKey<BiomeModifier> ADD_JUPITER_GOLD_ORE = registerKey("jupiter/add_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_JUPITER_DIAMOND_ORE = registerKey("jupiter/add_diamond_ore");
    public static final ResourceKey<BiomeModifier> ADD_JUPITER_REDSTONE_ORE = registerKey("jupiter/add_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_JUPITER_QUARTZ_ORE = registerKey("jupiter/add_quartz_ore");
    public static final ResourceKey<BiomeModifier> ADD_JUPITER_ZINC_ORE = registerKey("jupiter/add_zinc_ore");
    public static final ResourceKey<BiomeModifier> ADD_JUPITER_GLOWSTONE_ORE = registerKey("jupiter/add_glowstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_JUPITER_PALLADIUM_ORE = registerKey("jupiter/add_palladium_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_VENUS_LEAD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.VENUS_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VENUS_LEAD_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JUPITER_IRON_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.JUPITER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JUPITER_IRON_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JUPITER_COPPER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.JUPITER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JUPITER_COPPER_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JUPITER_GOLD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.JUPITER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JUPITER_GOLD_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JUPITER_DIAMOND_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.JUPITER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JUPITER_DIAMOND_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JUPITER_REDSTONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.JUPITER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JUPITER_REDSTONE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JUPITER_QUARTZ_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.JUPITER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JUPITER_QUARTZ_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JUPITER_ZINC_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.JUPITER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JUPITER_ZINC_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JUPITER_GLOWSTONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.JUPITER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JUPITER_GLOWSTONE_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JUPITER_PALLADIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(ModBiomeTags.JUPITER_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.JUPITER_PALLADIUM_ORE)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(NorthstarExtras.MOD_ID, name));
    }
}
