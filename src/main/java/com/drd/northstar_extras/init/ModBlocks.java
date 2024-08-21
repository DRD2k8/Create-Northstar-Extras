package com.drd.northstar_extras.init;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.block.*;
import com.drd.northstar_extras.util.ModWoodTypes;
import com.lightning.northstar.block.GrateBlock;
import com.lightning.northstar.block.LogBlock;
import com.lightning.northstar.block.NorthstarBlocks;
import com.lightning.northstar.block.VerticalSlabBlock;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NorthstarExtras.MOD_ID);

    public static final RegistryObject<Block> STRIPPED_COILER_WOOD = registerBlock("stripped_coiler_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.STRIPPED_COILER_LOG.get())));
    public static final RegistryObject<Block> COILER_WOOD = registerBlock("coiler_wood",
            () -> new LogBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.COILER_LOG.get()), (Block) STRIPPED_COILER_WOOD.get()));
    public static final RegistryObject<Block> STRIPPED_WILTER_WOOD = registerBlock("stripped_wilter_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.STRIPPED_WILTER_LOG.get())));
    public static final RegistryObject<Block> WILTER_WOOD = registerBlock("wilter_wood",
            () -> new LogBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.WILTER_LOG.get()), (Block) STRIPPED_WILTER_WOOD.get()));
    public static final RegistryObject<Block> STRIPPED_ARGYRE_WOOD = registerBlock("stripped_argyre_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.STRIPPED_ARGYRE_LOG.get())));
    public static final RegistryObject<Block> ARGYRE_WOOD = registerBlock("argyre_wood",
            () -> new LogBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.ARGYRE_LOG.get()), (Block) STRIPPED_ARGYRE_WOOD.get()));
    public static final RegistryObject<Block> STRIPPED_CALORIAN_LOG = registerBlock("stripped_calorian_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().sound(SoundType.BASALT).mapColor(MapColor.COLOR_GRAY).strength(4.0F, 4.0F)));
    public static final RegistryObject<Block> STRIPPED_CALORIAN_WOOD = registerBlock("stripped_calorian_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(STRIPPED_CALORIAN_LOG.get())));
    public static final RegistryObject<Block> CALORIAN_WOOD = registerBlock("calorian_wood",
            () -> new LogBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.CALORIAN_LOG.get()), (Block) STRIPPED_CALORIAN_WOOD.get()));
    public static final RegistryObject<Block> COILER_FENCE = registerBlock("coiler_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.COILER_PLANKS.get())));
    public static final RegistryObject<Block> WILTER_FENCE = registerBlock("wilter_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.WILTER_PLANKS.get())));
    public static final RegistryObject<Block> ARGYRE_FENCE = registerBlock("argyre_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.ARGYRE_PLANKS.get())));
    public static final RegistryObject<Block> CALORIAN_FENCE = registerBlock("calorian_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.CALORIAN_PLANKS.get()).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> COILER_FENCE_GATE = registerBlock("coiler_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.COILER_PLANKS.get()), ModWoodTypes.COILER));
    public static final RegistryObject<Block> WILTER_FENCE_GATE = registerBlock("wilter_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.WILTER_PLANKS.get()), ModWoodTypes.WILTER));
    public static final RegistryObject<Block> ARGYRE_FENCE_GATE = registerBlock("argyre_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.ARGYRE_PLANKS.get()), ModWoodTypes.ARGYRE));
    public static final RegistryObject<Block> CALORIAN_FENCE_GATE = registerBlock("calorian_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.CALORIAN_PLANKS.get()).sound(SoundType.BASALT), ModWoodTypes.CALORIAN));
    public static final RegistryObject<Block> COILER_DOOR = registerBlock("coiler_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.COILER_PLANKS.get()).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> WILTER_DOOR = registerBlock("wilter_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.WILTER_PLANKS.get()).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> ARGYRE_DOOR = registerBlock("argyre_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.ARGYRE_PLANKS.get()).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> CALORIAN_DOOR = registerBlock("calorian_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.CALORIAN_PLANKS.get()).noOcclusion().sound(SoundType.BASALT), BlockSetType.OAK));
    public static final RegistryObject<Block> COILER_TRAPDOOR = registerBlock("coiler_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.COILER_PLANKS.get()).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> WILTER_TRAPDOOR = registerBlock("wilter_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.WILTER_PLANKS.get()).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> ARGYRE_TRAPDOOR = registerBlock("argyre_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.ARGYRE_PLANKS.get()).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> CALORIAN_TRAPDOOR = registerBlock("calorian_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(NorthstarBlocks.CALORIAN_PLANKS.get()).noOcclusion().sound(SoundType.BASALT), BlockSetType.OAK));
    public static final RegistryObject<Block> COILER_PRESSURE_PLATE = registerBlock("coiler_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(NorthstarBlocks.COILER_PLANKS.get()),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> WILTER_PRESSURE_PLATE = registerBlock("wilter_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(NorthstarBlocks.WILTER_PLANKS.get()),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> ARGYRE_PRESSURE_PLATE = registerBlock("argyre_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(NorthstarBlocks.ARGYRE_PLANKS.get()),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> CALORIAN_PRESSURE_PLATE = registerBlock("calorian_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(NorthstarBlocks.CALORIAN_PLANKS.get()).sound(SoundType.BASALT),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> COILER_BUTTON = registerBlock("coiler_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> WILTER_BUTTON = registerBlock("wilter_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> ARGYRE_BUTTON = registerBlock("argyre_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> CALORIAN_BUTTON = registerBlock("calorian_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_BUTTON).sound(SoundType.BASALT),
                    BlockSetType.STONE, 30, true));
    public static final RegistryObject<Block> COILER_SIGN = BLOCKS.register("coiler_sign",
            () -> new CustomStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.COILER));
    public static final RegistryObject<Block> COILER_WALL_SIGN = BLOCKS.register("coiler_wall_sign",
            () -> new CustomWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.COILER));
    public static final RegistryObject<Block> WILTER_SIGN = BLOCKS.register("wilter_sign",
            () -> new CustomStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WILTER));
    public static final RegistryObject<Block> WILTER_WALL_SIGN = BLOCKS.register("wilter_wall_sign",
            () -> new CustomWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WILTER));
    public static final RegistryObject<Block> ARGYRE_SIGN = BLOCKS.register("argyre_sign",
            () -> new CustomStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ARGYRE));
    public static final RegistryObject<Block> ARGYRE_WALL_SIGN = BLOCKS.register("argyre_wall_sign",
            () -> new CustomWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ARGYRE));
    public static final RegistryObject<Block> CALORIAN_SIGN = BLOCKS.register("calorian_sign",
            () -> new CustomStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CALORIAN));
    public static final RegistryObject<Block> CALORIAN_WALL_SIGN = BLOCKS.register("calorian_wall_sign",
            () -> new CustomWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CALORIAN));
    public static final RegistryObject<Block> COILER_HANGING_SIGN = BLOCKS.register("coiler_hanging_sign",
            () -> new CustomCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.COILER));
    public static final RegistryObject<Block> COILER_WALL_HANGING_SIGN = BLOCKS.register("coiler_wall_hanging_sign",
            () -> new CustomWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.COILER));
    public static final RegistryObject<Block> WILTER_HANGING_SIGN = BLOCKS.register("wilter_hanging_sign",
            () -> new CustomCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WILTER));
    public static final RegistryObject<Block> WILTER_WALL_HANGING_SIGN = BLOCKS.register("wilter_wall_hanging_sign",
            () -> new CustomWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WILTER));
    public static final RegistryObject<Block> ARGYRE_HANGING_SIGN = BLOCKS.register("argyre_hanging_sign",
            () -> new CustomCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ARGYRE));
    public static final RegistryObject<Block> ARGYRE_WALL_HANGING_SIGN = BLOCKS.register("argyre_wall_hanging_sign",
            () -> new CustomWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ARGYRE));
    public static final RegistryObject<Block> CALORIAN_HANGING_SIGN = BLOCKS.register("calorian_hanging_sign",
            () -> new CustomCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CALORIAN));
    public static final RegistryObject<Block> CALORIAN_WALL_HANGING_SIGN = BLOCKS.register("calorian_wall_hanging_sign",
            () -> new CustomWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CALORIAN));
    public static final RegistryObject<Block> VENUS_LEAD_ORE = registerBlock("venus_lead_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).mapColor(MapColor.TERRACOTTA_YELLOW).strength(6.0F, 20.0F).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> VENUS_DEEP_LEAD_ORE = registerBlock("venus_deep_lead_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).mapColor(MapColor.TERRACOTTA_YELLOW).strength(7.0F, 20.0F).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(6.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(30.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_SHEETMETAL = registerBlock("lead_sheetmetal",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(6.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_SHEETMETAL_SLAB = registerBlock("lead_sheetmetal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(6.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_SHEETMETAL_VERTICAL_SLAB = registerBlock("lead_sheetmetal_vertical_slab",
            () -> new VerticalSlabBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(6.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_PLATING = registerBlock("lead_plating",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(6.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_PLATING_STAIRS = registerBlock("lead_plating_stairs",
            () -> new StairBlock(((Block) LEAD_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(6.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_PLATING_SLAB = registerBlock("lead_plating_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(6.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_PLATING_VERTICAL_SLAB = registerBlock("lead_plating_vertical_slab",
            () -> new VerticalSlabBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(6.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_PILLAR = registerBlock("lead_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(6.0F, 16.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_GRATE = registerBlock("lead_grate",
            () -> new GrateBlock(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.DEEPSLATE).strength(5.0F, 16.0F).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
