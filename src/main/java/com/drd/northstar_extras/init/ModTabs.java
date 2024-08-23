package com.drd.northstar_extras.init;

import com.drd.northstar_extras.NorthstarExtras;
import com.lightning.northstar.item.NorthstarItems;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NorthstarExtras.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NORTHSTAR_EXTRAS_TAB = TABS.register("northstar_extras_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LEAD_INGOT.get()))
                    .title(Component.translatable("itemGroup.northstar_extras"))
                    .displayItems((pParameters, pOutput) -> {
                        addStarMaps(pOutput);

                        pOutput.accept(ModBlocks.ARGYRE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_ARGYRE_WOOD.get());
                        pOutput.accept(ModBlocks.ARGYRE_FENCE.get());
                        pOutput.accept(ModBlocks.ARGYRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ARGYRE_DOOR.get());
                        pOutput.accept(ModBlocks.ARGYRE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.ARGYRE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.ARGYRE_BUTTON.get());
                        pOutput.accept(ModItems.ARGYRE_SIGN.get());
                        pOutput.accept(ModItems.ARGYRE_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.COILER_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_COILER_WOOD.get());
                        pOutput.accept(ModBlocks.COILER_FENCE.get());
                        pOutput.accept(ModBlocks.COILER_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.COILER_DOOR.get());
                        pOutput.accept(ModBlocks.COILER_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.COILER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.COILER_BUTTON.get());
                        pOutput.accept(ModItems.COILER_SIGN.get());
                        pOutput.accept(ModItems.COILER_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.WILTER_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_WILTER_WOOD.get());
                        pOutput.accept(ModBlocks.WILTER_FENCE.get());
                        pOutput.accept(ModBlocks.WILTER_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.WILTER_DOOR.get());
                        pOutput.accept(ModBlocks.WILTER_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.WILTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.WILTER_BUTTON.get());
                        pOutput.accept(ModItems.WILTER_SIGN.get());
                        pOutput.accept(ModItems.WILTER_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.STRIPPED_CALORIAN_LOG.get());
                        pOutput.accept(ModBlocks.CALORIAN_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_CALORIAN_WOOD.get());
                        pOutput.accept(ModBlocks.CALORIAN_FENCE.get());
                        pOutput.accept(ModBlocks.CALORIAN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.CALORIAN_DOOR.get());
                        pOutput.accept(ModBlocks.CALORIAN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.CALORIAN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.CALORIAN_BUTTON.get());
                        pOutput.accept(ModItems.CALORIAN_SIGN.get());
                        pOutput.accept(ModItems.CALORIAN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.MARS_SAND_PAPER.get());

                        // Venus
                        pOutput.accept(ModBlocks.VENUS_LEAD_ORE.get());
                        pOutput.accept(ModBlocks.VENUS_DEEP_LEAD_ORE.get());
                        pOutput.accept(ModItems.RAW_LEAD.get());
                        pOutput.accept(ModItems.LEAD_INGOT.get());
                        pOutput.accept(ModItems.LEAD_NUGGET.get());
                        pOutput.accept(ModItems.LEAD_SHEET.get());
                        pOutput.accept(ModBlocks.RAW_LEAD_BLOCK.get());
                        pOutput.accept(ModBlocks.LEAD_BLOCK.get());
                        pOutput.accept(ModBlocks.LEAD_SHEETMETAL.get());
                        pOutput.accept(ModBlocks.LEAD_SHEETMETAL_SLAB.get());
                        pOutput.accept(ModBlocks.LEAD_SHEETMETAL_VERTICAL_SLAB.get());
                        pOutput.accept(ModBlocks.LEAD_PLATING.get());
                        pOutput.accept(ModBlocks.LEAD_PLATING_STAIRS.get());
                        pOutput.accept(ModBlocks.LEAD_PLATING_SLAB.get());
                        pOutput.accept(ModBlocks.LEAD_PLATING_VERTICAL_SLAB.get());
                        pOutput.accept(ModBlocks.LEAD_PILLAR.get());
                        pOutput.accept(ModBlocks.LEAD_GRATE.get());

                        // Jupiter
                        pOutput.accept(ModBlocks.JUPITER_ASH.get());
                        pOutput.accept(ModBlocks.JUPITER_STONE.get());
                        pOutput.accept(ModBlocks.JUPITER_DEEP_STONE.get());
                        pOutput.accept(ModBlocks.JUPITER_STONE_BRICKS.get());
                        pOutput.accept(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.JUPITER_STONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.JUPITER_STONE_BRICK_VERTICAL_SLAB.get());
                        pOutput.accept(ModBlocks.JUPITER_STONE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.JUPITER_STONE_PILLAR.get());
                        pOutput.accept(ModBlocks.CHISELED_JUPITER_STONE.get());
                        pOutput.accept(ModBlocks.POLISHED_JUPITER_STONE.get());
                        pOutput.accept(ModBlocks.JUPITER_STONE_LAMP.get());
                        pOutput.accept(ModBlocks.JUPITER_IRON_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_COPPER_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_GOLD_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_DIAMOND_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_REDSTONE_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_QUARTZ_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_ZINC_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_GLOWSTONE_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_DEEP_IRON_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_DEEP_COPPER_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_DEEP_GOLD_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_DEEP_DIAMOND_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_DEEP_REDSTONE_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_DEEP_QUARTZ_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_DEEP_ZINC_ORE.get());
                        pOutput.accept(ModBlocks.JUPITER_DEEP_GLOWSTONE_ORE.get());
                    })
                    .build());

    public static void addStarMaps(CreativeModeTab.Output pGroup) {
        ItemStack ceres = new ItemStack((ItemLike) NorthstarItems.STAR_MAP.get());
        ceres.setHoverName(Component.translatable("item.northstar.star_map_ceres").setStyle(Style.EMPTY.withColor(ChatFormatting.AQUA).withItalic(false)));
        CompoundTag ceresTag = ceres.getOrCreateTagElement("Planet");
        ceresTag.putString("name", "ceres");
        pGroup.accept(ceres);
        ItemStack jupiter = new ItemStack((ItemLike) NorthstarItems.STAR_MAP.get());
        jupiter.setHoverName(Component.translatable("item.northstar.star_map_jupiter").setStyle(Style.EMPTY.withColor(ChatFormatting.AQUA).withItalic(false)));
        CompoundTag jupiterTag = jupiter.getOrCreateTagElement("Planet");
        jupiterTag.putString("name", "jupiter");
        pGroup.accept(jupiter);
        ItemStack saturn = new ItemStack((ItemLike) NorthstarItems.STAR_MAP.get());
        saturn.setHoverName(Component.translatable("item.northstar.star_map_saturn").setStyle(Style.EMPTY.withColor(ChatFormatting.AQUA).withItalic(false)));
        CompoundTag saturnTag = saturn.getOrCreateTagElement("Planet");
        saturnTag.putString("name", "saturn");
        pGroup.accept(saturn);
        ItemStack uranus = new ItemStack((ItemLike) NorthstarItems.STAR_MAP.get());
        uranus.setHoverName(Component.translatable("item.northstar.star_map_uranus").setStyle(Style.EMPTY.withColor(ChatFormatting.AQUA).withItalic(false)));
        CompoundTag uranusTag = uranus.getOrCreateTagElement("Planet");
        uranusTag.putString("name", "uranus");
        pGroup.accept(uranus);
        ItemStack neptune = new ItemStack((ItemLike) NorthstarItems.STAR_MAP.get());
        neptune.setHoverName(Component.translatable("item.northstar.star_map_neptune").setStyle(Style.EMPTY.withColor(ChatFormatting.AQUA).withItalic(false)));
        CompoundTag neptuneTag = neptune.getOrCreateTagElement("Planet");
        neptuneTag.putString("name", "neptune");
        pGroup.accept(neptune);
        ItemStack pluto = new ItemStack((ItemLike) NorthstarItems.STAR_MAP.get());
        pluto.setHoverName(Component.translatable("item.northstar.star_map_pluto").setStyle(Style.EMPTY.withColor(ChatFormatting.AQUA).withItalic(false)));
        CompoundTag plutoTag = pluto.getOrCreateTagElement("Planet");
        plutoTag.putString("name", "pluto");
        pGroup.accept(pluto);
        ItemStack eris = new ItemStack((ItemLike) NorthstarItems.STAR_MAP.get());
        eris.setHoverName(Component.translatable("item.northstar.star_map_eris").setStyle(Style.EMPTY.withColor(ChatFormatting.AQUA).withItalic(false)));
        CompoundTag erisTag = eris.getOrCreateTagElement("Planet");
        erisTag.putString("name", "eris");
        pGroup.accept(eris);
    }

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
