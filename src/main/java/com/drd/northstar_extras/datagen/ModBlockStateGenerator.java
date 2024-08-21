package com.drd.northstar_extras.datagen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

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
    }
}
