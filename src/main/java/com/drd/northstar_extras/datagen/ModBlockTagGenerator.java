package com.drd.northstar_extras.datagen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.init.ModBlocks;
import com.drd.northstar_extras.util.tag.ModBlockTags;
import com.lightning.northstar.block.NorthstarBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NorthstarExtras.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.STRIPPED_CALORIAN_LOG.get())
                .add(ModBlocks.ARGYRE_WOOD.get())
                .add(ModBlocks.STRIPPED_ARGYRE_WOOD.get())
                .add(ModBlocks.COILER_WOOD.get())
                .add(ModBlocks.STRIPPED_COILER_WOOD.get())
                .add(ModBlocks.WILTER_WOOD.get())
                .add(ModBlocks.STRIPPED_WILTER_WOOD.get())
                .add(ModBlocks.CALORIAN_WOOD.get())
                .add(ModBlocks.STRIPPED_CALORIAN_WOOD.get())
                .add(ModBlocks.COILER_FENCE.get())
                .add(ModBlocks.WILTER_FENCE.get())
                .add(ModBlocks.ARGYRE_FENCE.get())
                .add(ModBlocks.CALORIAN_FENCE.get())
                .add(ModBlocks.COILER_FENCE_GATE.get())
                .add(ModBlocks.WILTER_FENCE_GATE.get())
                .add(ModBlocks.ARGYRE_FENCE_GATE.get())
                .add(ModBlocks.CALORIAN_FENCE_GATE.get())
                .add(ModBlocks.COILER_DOOR.get())
                .add(ModBlocks.WILTER_DOOR.get())
                .add(ModBlocks.ARGYRE_DOOR.get())
                .add(ModBlocks.CALORIAN_DOOR.get())
                .add(ModBlocks.COILER_TRAPDOOR.get())
                .add(ModBlocks.WILTER_TRAPDOOR.get())
                .add(ModBlocks.ARGYRE_TRAPDOOR.get())
                .add(ModBlocks.CALORIAN_TRAPDOOR.get())
                .add(ModBlocks.COILER_PRESSURE_PLATE.get())
                .add(ModBlocks.WILTER_PRESSURE_PLATE.get())
                .add(ModBlocks.ARGYRE_PRESSURE_PLATE.get())
                .add(ModBlocks.CALORIAN_PRESSURE_PLATE.get())
                .add(ModBlocks.COILER_BUTTON.get())
                .add(ModBlocks.WILTER_BUTTON.get())
                .add(ModBlocks.ARGYRE_BUTTON.get())
                .add(ModBlocks.CALORIAN_BUTTON.get())
                .add(ModBlocks.COILER_SIGN.get())
                .add(ModBlocks.WILTER_SIGN.get())
                .add(ModBlocks.ARGYRE_SIGN.get())
                .add(ModBlocks.CALORIAN_SIGN.get())
                .add(ModBlocks.COILER_WALL_SIGN.get())
                .add(ModBlocks.WILTER_WALL_SIGN.get())
                .add(ModBlocks.ARGYRE_WALL_SIGN.get())
                .add(ModBlocks.CALORIAN_WALL_SIGN.get())
                .add(ModBlocks.COILER_HANGING_SIGN.get())
                .add(ModBlocks.WILTER_HANGING_SIGN.get())
                .add(ModBlocks.ARGYRE_HANGING_SIGN.get())
                .add(ModBlocks.CALORIAN_HANGING_SIGN.get())
                .add(ModBlocks.COILER_WALL_HANGING_SIGN.get())
                .add(ModBlocks.WILTER_WALL_HANGING_SIGN.get())
                .add(ModBlocks.ARGYRE_WALL_HANGING_SIGN.get())
                .add(ModBlocks.CALORIAN_WALL_HANGING_SIGN.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Venus
                .add(ModBlocks.VENUS_LEAD_ORE.get())
                .add(ModBlocks.VENUS_DEEP_LEAD_ORE.get())
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_SHEETMETAL.get())
                .add(ModBlocks.LEAD_SHEETMETAL_SLAB.get())
                .add(ModBlocks.LEAD_SHEETMETAL_VERTICAL_SLAB.get())
                .add(ModBlocks.LEAD_PLATING.get())
                .add(ModBlocks.LEAD_PLATING_STAIRS.get())
                .add(ModBlocks.LEAD_PLATING_SLAB.get())
                .add(ModBlocks.LEAD_PLATING_VERTICAL_SLAB.get())
                .add(ModBlocks.LEAD_PILLAR.get())
                .add(ModBlocks.LEAD_GRATE.get())

                // Jupiter
                .add(ModBlocks.JUPITER_STONE.get())
                .add(ModBlocks.JUPITER_DEEP_STONE.get())
                .add(ModBlocks.JUPITER_STONE_BRICKS.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_VERTICAL_SLAB.get())
                .add(ModBlocks.JUPITER_STONE_BRICK_WALL.get())
                .add(ModBlocks.JUPITER_STONE_PILLAR.get())
                .add(ModBlocks.CHISELED_JUPITER_STONE.get())
                .add(ModBlocks.POLISHED_JUPITER_STONE.get())
                .add(ModBlocks.JUPITER_STONE_LAMP.get())
                .add(ModBlocks.JUPITER_IRON_ORE.get())
                .add(ModBlocks.JUPITER_COPPER_ORE.get())
                .add(ModBlocks.JUPITER_GOLD_ORE.get())
                .add(ModBlocks.JUPITER_DIAMOND_ORE.get())
                .add(ModBlocks.JUPITER_REDSTONE_ORE.get())
                .add(ModBlocks.JUPITER_QUARTZ_ORE.get())
                .add(ModBlocks.JUPITER_ZINC_ORE.get())
                .add(ModBlocks.JUPITER_GLOWSTONE_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_IRON_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_COPPER_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_GOLD_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_DIAMOND_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_REDSTONE_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_QUARTZ_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_ZINC_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_GLOWSTONE_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.JUPITER_ASH.get());

        this.tag(ModBlockTags.MARTIAN_STEEL_BLOCKS)
                .add(NorthstarBlocks.MARTIAN_STEEL_BLOCK.get());

        this.tag(ModBlockTags.TUNGSTEN_BLOCKS)
                .add(NorthstarBlocks.TUNGSTEN_BLOCK.get());

        this.tag(ModBlockTags.LEAD_BLOCKS)
                .add(ModBlocks.LEAD_BLOCK.get());

        this.tag(Tags.Blocks.ORES)
                .addTag(ModBlockTags.TUNGSTEN_ORES)
                .addTag(ModBlockTags.LEAD_ORES);

        this.tag(ModBlockTags.TUNGSTEN_ORES)
                .add(NorthstarBlocks.MERCURY_TUNGSTEN_ORE.get())
                .add(NorthstarBlocks.MERCURY_DEEP_TUNGSTEN_ORE.get());

        this.tag(ModBlockTags.LEAD_ORES)
                .add(ModBlocks.VENUS_LEAD_ORE.get())
                .add(ModBlocks.VENUS_DEEP_LEAD_ORE.get());

        this.tag(BlockTags.STAIRS)
                // Venus
                .add(ModBlocks.LEAD_PLATING_STAIRS.get())

                // Jupiter
                .add(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get());

        this.tag(BlockTags.SLABS)
                // Venus
                .add(ModBlocks.LEAD_SHEETMETAL_SLAB.get())
                .add(ModBlocks.LEAD_PLATING_SLAB.get())

                // Jupiter
                .add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get());

        this.tag(BlockTags.WALLS)
                // For fixing the walls from Northstar
                .add(NorthstarBlocks.MOON_STONE_BRICK_WALL.get())
                .add(NorthstarBlocks.MARS_STONE_BRICK_WALL.get())
                .add(NorthstarBlocks.MERCURY_STONE_BRICK_WALL.get())
                .add(NorthstarBlocks.VENUS_STONE_BRICK_WALL.get())

                // For the mod
                .add(ModBlocks.JUPITER_STONE_BRICK_WALL.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.COILER_FENCE.get())
                .add(ModBlocks.WILTER_FENCE.get())
                .add(ModBlocks.ARGYRE_FENCE.get())
                .add(ModBlocks.CALORIAN_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.COILER_FENCE_GATE.get())
                .add(ModBlocks.WILTER_FENCE_GATE.get())
                .add(ModBlocks.ARGYRE_FENCE_GATE.get())
                .add(ModBlocks.CALORIAN_FENCE_GATE.get());

        this.tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.COILER_DOOR.get())
                .add(ModBlocks.WILTER_DOOR.get())
                .add(ModBlocks.ARGYRE_DOOR.get())
                .add(ModBlocks.CALORIAN_DOOR.get());

        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.COILER_TRAPDOOR.get())
                .add(ModBlocks.WILTER_TRAPDOOR.get())
                .add(ModBlocks.ARGYRE_TRAPDOOR.get())
                .add(ModBlocks.CALORIAN_TRAPDOOR.get());

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.COILER_PRESSURE_PLATE.get())
                .add(ModBlocks.WILTER_PRESSURE_PLATE.get())
                .add(ModBlocks.ARGYRE_PRESSURE_PLATE.get())
                .add(ModBlocks.CALORIAN_PRESSURE_PLATE.get());

        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.COILER_BUTTON.get())
                .add(ModBlocks.WILTER_BUTTON.get())
                .add(ModBlocks.ARGYRE_BUTTON.get())
                .add(ModBlocks.CALORIAN_BUTTON.get());

        this.tag(BlockTags.LOGS)
                .add(NorthstarBlocks.CALORIAN_LOG.get())
                .add(ModBlocks.STRIPPED_CALORIAN_LOG.get())
                .add(ModBlocks.ARGYRE_WOOD.get())
                .add(ModBlocks.STRIPPED_ARGYRE_WOOD.get())
                .add(ModBlocks.COILER_WOOD.get())
                .add(ModBlocks.STRIPPED_COILER_WOOD.get())
                .add(ModBlocks.WILTER_WOOD.get())
                .add(ModBlocks.STRIPPED_WILTER_WOOD.get())
                .add(ModBlocks.CALORIAN_WOOD.get())
                .add(ModBlocks.STRIPPED_CALORIAN_WOOD.get());

        this.tag(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.COILER_SIGN.get())
                .add(ModBlocks.WILTER_SIGN.get())
                .add(ModBlocks.ARGYRE_SIGN.get())
                .add(ModBlocks.CALORIAN_SIGN.get());

        this.tag(BlockTags.WALL_SIGNS)
                .add(ModBlocks.COILER_WALL_SIGN.get())
                .add(ModBlocks.WILTER_WALL_SIGN.get())
                .add(ModBlocks.ARGYRE_WALL_SIGN.get())
                .add(ModBlocks.CALORIAN_WALL_SIGN.get());

        this.tag(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.COILER_HANGING_SIGN.get())
                .add(ModBlocks.WILTER_HANGING_SIGN.get())
                .add(ModBlocks.ARGYRE_HANGING_SIGN.get())
                .add(ModBlocks.CALORIAN_HANGING_SIGN.get());

        this.tag(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.COILER_WALL_HANGING_SIGN.get())
                .add(ModBlocks.WILTER_WALL_HANGING_SIGN.get())
                .add(ModBlocks.ARGYRE_WALL_HANGING_SIGN.get())
                .add(ModBlocks.CALORIAN_WALL_HANGING_SIGN.get());

        this.tag(Tags.Blocks.ORES_IRON)
                .add(ModBlocks.JUPITER_IRON_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_IRON_ORE.get());

        this.tag(Tags.Blocks.ORES_COPPER)
                .add(ModBlocks.JUPITER_COPPER_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_COPPER_ORE.get());

        this.tag(Tags.Blocks.ORES_GOLD)
                .add(ModBlocks.JUPITER_GOLD_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_GOLD_ORE.get());

        this.tag(Tags.Blocks.ORES_DIAMOND)
                .add(ModBlocks.JUPITER_DIAMOND_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_DIAMOND_ORE.get());

        this.tag(Tags.Blocks.ORES_REDSTONE)
                .add(ModBlocks.JUPITER_REDSTONE_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_REDSTONE_ORE.get());

        this.tag(Tags.Blocks.ORES_QUARTZ)
                .add(ModBlocks.JUPITER_QUARTZ_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_QUARTZ_ORE.get());

        this.tag(ModBlockTags.ZINC_ORES)
                .add(ModBlocks.JUPITER_ZINC_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_ZINC_ORE.get());

        this.tag(ModBlockTags.GLOWSTONE_ORES)
                .add(ModBlocks.JUPITER_GLOWSTONE_ORE.get())
                .add(ModBlocks.JUPITER_DEEP_GLOWSTONE_ORE.get());

        this.tag(ModBlockTags.TIER_4_HEAT_RESISTANCE)
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.LEAD_SHEETMETAL.get())
                .add(ModBlocks.LEAD_SHEETMETAL_SLAB.get())
                .add(ModBlocks.LEAD_SHEETMETAL_VERTICAL_SLAB.get())
                .add(ModBlocks.LEAD_PLATING.get())
                .add(ModBlocks.LEAD_PLATING_STAIRS.get())
                .add(ModBlocks.LEAD_PLATING_SLAB.get())
                .add(ModBlocks.LEAD_PLATING_VERTICAL_SLAB.get())
                .add(ModBlocks.LEAD_PILLAR.get())
                .add(ModBlocks.LEAD_GRATE.get());
    }
}
