package com.drd.northstar_extras.worldgen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.init.ModBlocks;
import com.lightning.northstar.block.NorthstarBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ModConfiguredFeatures {
    // Venus
    public static final ResourceKey<ConfiguredFeature<?, ?>> VENUS_LEAD_ORE_KEY = registerKey("venus/lead_ore");

    // Jupiter
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUPITER_IRON_ORE_KEY = registerKey("jupiter/iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUPITER_COPPER_ORE_KEY = registerKey("jupiter/copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUPITER_GOLD_ORE_KEY = registerKey("jupiter/gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUPITER_DIAMOND_ORE_KEY = registerKey("jupiter/diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUPITER_REDSTONE_ORE_KEY = registerKey("jupiter/redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUPITER_QUARTZ_ORE_KEY = registerKey("jupiter/quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUPITER_ZINC_ORE_KEY = registerKey("jupiter/zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUPITER_GLOWSTONE_ORE_KEY = registerKey("jupiter/glowstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JUPITER_PALLADIUM_ORE_KEY = registerKey("jupiter/palladium_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest venusStoneReplaceable = new BlockMatchTest(NorthstarBlocks.VENUS_STONE.get());
        RuleTest venusDeepStoneReplaceable = new BlockMatchTest(NorthstarBlocks.VENUS_DEEP_STONE.get());
        RuleTest jupiterStoneReplaceable = new BlockMatchTest(ModBlocks.JUPITER_STONE.get());
        RuleTest jupiterDeepStoneReplaceable = new BlockMatchTest(ModBlocks.JUPITER_DEEP_STONE.get());

        // Venus Ores
        List<OreConfiguration.TargetBlockState> venusLeadOres = List.of(OreConfiguration.target(venusStoneReplaceable,
                        ModBlocks.VENUS_LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(venusDeepStoneReplaceable, ModBlocks.VENUS_DEEP_LEAD_ORE.get().defaultBlockState()));

        // Jupiter Ores
        List<OreConfiguration.TargetBlockState> jupiterIronOres = List.of(OreConfiguration.target(jupiterStoneReplaceable,
                        ModBlocks.JUPITER_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(jupiterDeepStoneReplaceable, ModBlocks.JUPITER_DEEP_IRON_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> jupiterCopperOres = List.of(OreConfiguration.target(jupiterStoneReplaceable,
                        ModBlocks.JUPITER_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(jupiterDeepStoneReplaceable, ModBlocks.JUPITER_DEEP_COPPER_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> jupiterGoldOres = List.of(OreConfiguration.target(jupiterStoneReplaceable,
                        ModBlocks.JUPITER_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(jupiterDeepStoneReplaceable, ModBlocks.JUPITER_DEEP_GOLD_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> jupiterDiamondOres = List.of(OreConfiguration.target(jupiterStoneReplaceable,
                        ModBlocks.JUPITER_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(jupiterDeepStoneReplaceable, ModBlocks.JUPITER_DEEP_DIAMOND_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> jupiterRedstoneOres = List.of(OreConfiguration.target(jupiterStoneReplaceable,
                        ModBlocks.JUPITER_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(jupiterDeepStoneReplaceable, ModBlocks.JUPITER_DEEP_REDSTONE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> jupiterQuartzOres = List.of(OreConfiguration.target(jupiterStoneReplaceable,
                        ModBlocks.JUPITER_QUARTZ_ORE.get().defaultBlockState()),
                OreConfiguration.target(jupiterDeepStoneReplaceable, ModBlocks.JUPITER_DEEP_QUARTZ_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> jupiterZincOres = List.of(OreConfiguration.target(jupiterStoneReplaceable,
                        ModBlocks.JUPITER_ZINC_ORE.get().defaultBlockState()),
                OreConfiguration.target(jupiterDeepStoneReplaceable, ModBlocks.JUPITER_DEEP_ZINC_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> jupiterGlowstoneOres = List.of(OreConfiguration.target(jupiterStoneReplaceable,
                        ModBlocks.JUPITER_GLOWSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(jupiterDeepStoneReplaceable, ModBlocks.JUPITER_DEEP_GLOWSTONE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> jupiterPalladiumOres = List.of(OreConfiguration.target(jupiterStoneReplaceable,
                        ModBlocks.JUPITER_PALLADIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(jupiterDeepStoneReplaceable, ModBlocks.JUPITER_DEEP_PALLADIUM_ORE.get().defaultBlockState()));

        // Venus Registries
        register(context, VENUS_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(venusLeadOres, 9));

        // Jupiter Registries
        register(context, JUPITER_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(jupiterIronOres, 13));
        register(context, JUPITER_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(jupiterCopperOres, 7));
        register(context, JUPITER_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(jupiterGoldOres, 5));
        register(context, JUPITER_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(jupiterDiamondOres, 2));
        register(context, JUPITER_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(jupiterRedstoneOres, 10));
        register(context, JUPITER_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(jupiterQuartzOres, 12));
        register(context, JUPITER_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(jupiterZincOres, 9));
        register(context, JUPITER_GLOWSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(jupiterGlowstoneOres, 3));
        register(context, JUPITER_PALLADIUM_ORE_KEY, Feature.ORE, new OreConfiguration(jupiterPalladiumOres, 5));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(NorthstarExtras.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
