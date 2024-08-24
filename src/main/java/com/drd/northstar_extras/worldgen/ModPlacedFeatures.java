package com.drd.northstar_extras.worldgen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.worldgen.placement.ModOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    // Venus
    public static final ResourceKey<PlacedFeature> VENUS_LEAD_ORE = registerKey("venus/lead_ore");

    // Jupiter
    public static final ResourceKey<PlacedFeature> JUPITER_IRON_ORE = registerKey("jupiter/iron_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_COPPER_ORE = registerKey("jupiter/copper_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_GOLD_ORE = registerKey("jupiter/gold_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_DIAMOND_ORE = registerKey("jupiter/diamond_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_REDSTONE_ORE = registerKey("jupiter/redstone_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_QUARTZ_ORE = registerKey("jupiter/quartz_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_ZINC_ORE = registerKey("jupiter/zinc_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_GLOWSTONE_ORE = registerKey("jupiter/glowstone_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_PALLADIUM_ORE = registerKey("jupiter/palladium_ore");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // Venus
        register(context, VENUS_LEAD_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.VENUS_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(72))));

        // Jupiter
        register(context, JUPITER_IRON_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUPITER_IRON_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(85))));
        register(context, JUPITER_COPPER_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUPITER_COPPER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(132))));
        register(context, JUPITER_GOLD_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUPITER_GOLD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(48))));
        register(context, JUPITER_DIAMOND_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUPITER_DIAMOND_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, JUPITER_REDSTONE_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUPITER_REDSTONE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(15))));
        register(context, JUPITER_QUARTZ_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUPITER_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(72))));
        register(context, JUPITER_ZINC_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUPITER_ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(48))));
        register(context, JUPITER_GLOWSTONE_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUPITER_GLOWSTONE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(60))));
        register(context, JUPITER_PALLADIUM_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUPITER_PALLADIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(60))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(NorthstarExtras.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
