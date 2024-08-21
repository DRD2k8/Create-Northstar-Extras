package com.drd.northstar_extras.datagen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateGenerator extends BlockStateProvider {
    public ModBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NorthstarExtras.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        doorBlockWithRenderType(((DoorBlock) ModBlocks.COILER_DOOR.get()), modLoc("block/coiler_door_lower"), modLoc("block/coiler_door_upper"), "solid");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.COILER_TRAPDOOR.get()), modLoc("block/coiler_trapdoor"), true, "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.WILTER_DOOR.get()), modLoc("block/wilter_door_lower"), modLoc("block/wilter_door_upper"), "solid");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WILTER_TRAPDOOR.get()), modLoc("block/wilter_trapdoor"), true, "solid");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.ARGYRE_DOOR.get()), modLoc("block/argyre_door_lower"), modLoc("block/argyre_door_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ARGYRE_TRAPDOOR.get()), modLoc("block/argyre_trapdoor"), true, "cutout");
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CALORIAN_LOG.get()), blockTexture(ModBlocks.STRIPPED_CALORIAN_LOG.get()),
                new ResourceLocation(NorthstarExtras.MOD_ID, "block/stripped_calorian_log_top"));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.CALORIAN_DOOR.get()), modLoc("block/calorian_door_lower"), modLoc("block/calorian_door_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CALORIAN_TRAPDOOR.get()), modLoc("block/calorian_trapdoor"), true, "cutout");
        blockWithItem(ModBlocks.VENUS_LEAD_ORE);
        blockWithItem(ModBlocks.VENUS_DEEP_LEAD_ORE);
        blockWithItem(ModBlocks.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.LEAD_BLOCK);
        blockWithItem(ModBlocks.LEAD_SHEETMETAL);
        slabBlock(((SlabBlock) ModBlocks.LEAD_SHEETMETAL_SLAB.get()), blockTexture(ModBlocks.LEAD_SHEETMETAL.get()), blockTexture(ModBlocks.LEAD_SHEETMETAL.get()));
        blockWithItem(ModBlocks.LEAD_PLATING);
        stairsBlock(((StairBlock) ModBlocks.LEAD_PLATING_STAIRS.get()), blockTexture(ModBlocks.LEAD_PLATING.get()));
        slabBlock(((SlabBlock) ModBlocks.LEAD_PLATING_SLAB.get()), blockTexture(ModBlocks.LEAD_PLATING.get()), blockTexture(ModBlocks.LEAD_PLATING.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.LEAD_PILLAR.get()), blockTexture(ModBlocks.LEAD_PILLAR.get()),
                new ResourceLocation(NorthstarExtras.MOD_ID, "block/lead_pillar_top"));
        blockWithItem(ModBlocks.LEAD_GRATE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
