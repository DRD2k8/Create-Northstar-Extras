package com.drd.northstar_extras.datagen.loot;

import com.drd.northstar_extras.init.ModBlocks;
import com.drd.northstar_extras.init.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.COILER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_COILER_WOOD.get());
        this.dropSelf(ModBlocks.COILER_FENCE.get());
        this.dropSelf(ModBlocks.COILER_FENCE_GATE.get());
        this.dropSelf(ModBlocks.COILER_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.COILER_BUTTON.get());
        this.add(ModBlocks.COILER_DOOR.get(),
                block -> createDoorTable(ModBlocks.COILER_DOOR.get()));
        this.dropSelf(ModBlocks.COILER_TRAPDOOR.get());
        this.add(ModBlocks.COILER_SIGN.get(), block ->
                createSingleItemTable(ModItems.COILER_SIGN.get()));
        this.add(ModBlocks.COILER_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.COILER_SIGN.get()));
        this.add(ModBlocks.COILER_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.COILER_HANGING_SIGN.get()));
        this.add(ModBlocks.COILER_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.COILER_HANGING_SIGN.get()));
        this.dropSelf(ModBlocks.WILTER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WILTER_WOOD.get());
        this.dropSelf(ModBlocks.WILTER_FENCE.get());
        this.dropSelf(ModBlocks.WILTER_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WILTER_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WILTER_BUTTON.get());
        this.add(ModBlocks.WILTER_DOOR.get(),
                block -> createDoorTable(ModBlocks.WILTER_DOOR.get()));
        this.dropSelf(ModBlocks.WILTER_TRAPDOOR.get());
        this.add(ModBlocks.WILTER_SIGN.get(), block ->
                createSingleItemTable(ModItems.WILTER_SIGN.get()));
        this.add(ModBlocks.WILTER_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.WILTER_SIGN.get()));
        this.add(ModBlocks.WILTER_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.WILTER_HANGING_SIGN.get()));
        this.add(ModBlocks.WILTER_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.WILTER_HANGING_SIGN.get()));
        this.dropSelf(ModBlocks.ARGYRE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ARGYRE_WOOD.get());
        this.dropSelf(ModBlocks.ARGYRE_FENCE.get());
        this.dropSelf(ModBlocks.ARGYRE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ARGYRE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ARGYRE_BUTTON.get());
        this.add(ModBlocks.ARGYRE_DOOR.get(),
                block -> createDoorTable(ModBlocks.ARGYRE_DOOR.get()));
        this.dropSelf(ModBlocks.ARGYRE_TRAPDOOR.get());
        this.add(ModBlocks.ARGYRE_SIGN.get(), block ->
                createSingleItemTable(ModItems.ARGYRE_SIGN.get()));
        this.add(ModBlocks.ARGYRE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.ARGYRE_SIGN.get()));
        this.add(ModBlocks.ARGYRE_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.ARGYRE_HANGING_SIGN.get()));
        this.add(ModBlocks.ARGYRE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.ARGYRE_HANGING_SIGN.get()));
        this.dropSelf(ModBlocks.STRIPPED_CALORIAN_LOG.get());
        this.dropSelf(ModBlocks.CALORIAN_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CALORIAN_WOOD.get());
        this.dropSelf(ModBlocks.CALORIAN_FENCE.get());
        this.dropSelf(ModBlocks.CALORIAN_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CALORIAN_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CALORIAN_BUTTON.get());
        this.add(ModBlocks.CALORIAN_DOOR.get(),
                block -> createDoorTable(ModBlocks.CALORIAN_DOOR.get()));
        this.dropSelf(ModBlocks.CALORIAN_TRAPDOOR.get());
        this.add(ModBlocks.CALORIAN_SIGN.get(), block ->
                createSingleItemTable(ModItems.CALORIAN_SIGN.get()));
        this.add(ModBlocks.CALORIAN_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.CALORIAN_SIGN.get()));
        this.add(ModBlocks.CALORIAN_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CALORIAN_HANGING_SIGN.get()));
        this.add(ModBlocks.CALORIAN_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CALORIAN_HANGING_SIGN.get()));
        this.add(ModBlocks.VENUS_LEAD_ORE.get(), createOreDrop(ModBlocks.VENUS_LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.VENUS_DEEP_LEAD_ORE.get(), createOreDrop(ModBlocks.VENUS_DEEP_LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.LEAD_SHEETMETAL.get());
        this.add(ModBlocks.LEAD_SHEETMETAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LEAD_SHEETMETAL_SLAB.get()));
        this.add(ModBlocks.LEAD_SHEETMETAL_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LEAD_SHEETMETAL_VERTICAL_SLAB.get()));
        this.dropSelf(ModBlocks.LEAD_PLATING.get());
        this.dropSelf(ModBlocks.LEAD_PLATING_STAIRS.get());
        this.add(ModBlocks.LEAD_PLATING_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LEAD_PLATING_SLAB.get()));
        this.add(ModBlocks.LEAD_PLATING_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LEAD_PLATING_VERTICAL_SLAB.get()));
        this.dropSelf(ModBlocks.LEAD_PILLAR.get());
        this.dropSelf(ModBlocks.LEAD_GRATE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
