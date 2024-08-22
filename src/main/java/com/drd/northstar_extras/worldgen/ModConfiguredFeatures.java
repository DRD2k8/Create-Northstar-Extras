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
    public static final ResourceKey<ConfiguredFeature<?, ?>> VENUS_LEAD_ORE_KEY = registerKey("venus/lead_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest venusStoneReplaceable = new BlockMatchTest(NorthstarBlocks.VENUS_STONE.get());
        RuleTest venusDeepStoneReplaceable = new BlockMatchTest(NorthstarBlocks.VENUS_DEEP_STONE.get());

        List<OreConfiguration.TargetBlockState> venusLeadOres = List.of(OreConfiguration.target(venusStoneReplaceable,
                        ModBlocks.VENUS_LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(venusDeepStoneReplaceable, ModBlocks.VENUS_DEEP_LEAD_ORE.get().defaultBlockState()));

        register(context, VENUS_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(venusLeadOres, 9));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(NorthstarExtras.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
