package com.drd.northstar_extras.datagen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.init.ModBlocks;
import com.drd.northstar_extras.init.ModItems;
import com.lightning.northstar.block.NorthstarBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD.get(), ModBlocks.VENUS_LEAD_ORE.get(), ModBlocks.VENUS_DEEP_LEAD_ORE.get());

    public ModRecipeGenerator(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MOON_STONE.get(), NorthstarBlocks.MOON_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MOON_STONE.get(), NorthstarBlocks.MOON_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MOON_STONE.get(), NorthstarBlocks.MOON_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MOON_STONE.get(), NorthstarBlocks.MOON_STONE_BRICK_SLAB_VERTICAL.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MOON_STONE.get(), NorthstarBlocks.MOON_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MOON_STONE.get(), NorthstarBlocks.MOON_STONE_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MOON_STONE.get(), NorthstarBlocks.POLISHED_MOON_STONE.get(), 1);

        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MARS_STONE.get(), NorthstarBlocks.MARS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MARS_STONE.get(), NorthstarBlocks.MARS_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MARS_STONE.get(), NorthstarBlocks.MARS_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MARS_STONE.get(), NorthstarBlocks.MARS_STONE_BRICK_SLAB_VERTICAL.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MARS_STONE.get(), NorthstarBlocks.MARS_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MARS_STONE.get(), NorthstarBlocks.MARS_STONE_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MARS_STONE.get(), NorthstarBlocks.POLISHED_MARS_STONE.get(), 1);

        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MERCURY_STONE.get(), NorthstarBlocks.MERCURY_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MERCURY_STONE.get(), NorthstarBlocks.MERCURY_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MERCURY_STONE.get(), NorthstarBlocks.MERCURY_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MERCURY_STONE.get(), NorthstarBlocks.MERCURY_STONE_BRICK_SLAB_VERTICAL.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MERCURY_STONE.get(), NorthstarBlocks.MERCURY_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MERCURY_STONE.get(), NorthstarBlocks.MERCURY_STONE_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.MERCURY_STONE.get(), NorthstarBlocks.POLISHED_MERCURY_STONE.get(), 1);

        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.VENUS_STONE.get(), NorthstarBlocks.VENUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.VENUS_STONE.get(), NorthstarBlocks.VENUS_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.VENUS_STONE.get(), NorthstarBlocks.VENUS_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.VENUS_STONE.get(), NorthstarBlocks.VENUS_STONE_BRICK_SLAB_VERTICAL.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.VENUS_STONE.get(), NorthstarBlocks.VENUS_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.VENUS_STONE.get(), NorthstarBlocks.VENUS_STONE_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, NorthstarBlocks.VENUS_STONE.get(), NorthstarBlocks.POLISHED_VENUS_STONE.get(), 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COILER_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.COILER_LOG.get())
                .unlockedBy(getHasName(NorthstarBlocks.COILER_LOG.get()), has(NorthstarBlocks.COILER_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILTER_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.WILTER_LOG.get())
                .unlockedBy(getHasName(NorthstarBlocks.WILTER_LOG.get()), has(NorthstarBlocks.WILTER_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARGYRE_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.ARGYRE_LOG.get())
                .unlockedBy(getHasName(NorthstarBlocks.ARGYRE_LOG.get()), has(NorthstarBlocks.ARGYRE_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALORIAN_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.CALORIAN_LOG.get())
                .unlockedBy(getHasName(NorthstarBlocks.CALORIAN_LOG.get()), has(NorthstarBlocks.CALORIAN_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_COILER_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.STRIPPED_COILER_LOG.get())
                .unlockedBy(getHasName(NorthstarBlocks.STRIPPED_COILER_LOG.get()), has(NorthstarBlocks.STRIPPED_COILER_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_WILTER_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.STRIPPED_WILTER_LOG.get())
                .unlockedBy(getHasName(NorthstarBlocks.STRIPPED_WILTER_LOG.get()), has(NorthstarBlocks.STRIPPED_WILTER_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ARGYRE_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.STRIPPED_ARGYRE_LOG.get())
                .unlockedBy(getHasName(NorthstarBlocks.STRIPPED_ARGYRE_LOG.get()), has(NorthstarBlocks.STRIPPED_ARGYRE_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CALORIAN_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.STRIPPED_CALORIAN_LOG.get())
                .unlockedBy(getHasName(ModBlocks.STRIPPED_CALORIAN_LOG.get()), has(ModBlocks.STRIPPED_CALORIAN_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COILER_FENCE.get(), 3)
                .pattern("#X#")
                .pattern("#X#")
                .define('#', NorthstarBlocks.COILER_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.COILER_PLANKS.get()), has(NorthstarBlocks.COILER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILTER_FENCE.get(), 3)
                .pattern("#X#")
                .pattern("#X#")
                .define('#', NorthstarBlocks.WILTER_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.WILTER_PLANKS.get()), has(NorthstarBlocks.WILTER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARGYRE_FENCE.get(), 3)
                .pattern("#X#")
                .pattern("#X#")
                .define('#', NorthstarBlocks.ARGYRE_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.ARGYRE_PLANKS.get()), has(NorthstarBlocks.ARGYRE_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALORIAN_FENCE.get(), 3)
                .pattern("#X#")
                .pattern("#X#")
                .define('#', NorthstarBlocks.CALORIAN_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.CALORIAN_PLANKS.get()), has(NorthstarBlocks.CALORIAN_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COILER_FENCE_GATE.get())
                .pattern("X#X")
                .pattern("X#X")
                .define('#', NorthstarBlocks.COILER_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.COILER_PLANKS.get()), has(NorthstarBlocks.COILER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILTER_FENCE_GATE.get())
                .pattern("X#X")
                .pattern("X#X")
                .define('#', NorthstarBlocks.WILTER_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.WILTER_PLANKS.get()), has(NorthstarBlocks.WILTER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARGYRE_FENCE_GATE.get())
                .pattern("X#X")
                .pattern("X#X")
                .define('#', NorthstarBlocks.ARGYRE_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.ARGYRE_PLANKS.get()), has(NorthstarBlocks.ARGYRE_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALORIAN_FENCE_GATE.get())
                .pattern("X#X")
                .pattern("X#X")
                .define('#', NorthstarBlocks.CALORIAN_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.CALORIAN_PLANKS.get()), has(NorthstarBlocks.CALORIAN_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COILER_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.COILER_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.COILER_PLANKS.get()), has(NorthstarBlocks.COILER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILTER_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.WILTER_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.WILTER_PLANKS.get()), has(NorthstarBlocks.WILTER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARGYRE_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.ARGYRE_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.ARGYRE_PLANKS.get()), has(NorthstarBlocks.ARGYRE_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALORIAN_DOOR.get(), 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', NorthstarBlocks.CALORIAN_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.CALORIAN_PLANKS.get()), has(NorthstarBlocks.CALORIAN_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COILER_TRAPDOOR.get(), 2)
                .pattern("###")
                .pattern("###")
                .define('#', NorthstarBlocks.COILER_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.COILER_PLANKS.get()), has(NorthstarBlocks.COILER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILTER_TRAPDOOR.get(), 2)
                .pattern("###")
                .pattern("###")
                .define('#', NorthstarBlocks.WILTER_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.WILTER_PLANKS.get()), has(NorthstarBlocks.WILTER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARGYRE_TRAPDOOR.get(), 2)
                .pattern("###")
                .pattern("###")
                .define('#', NorthstarBlocks.ARGYRE_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.ARGYRE_PLANKS.get()), has(NorthstarBlocks.ARGYRE_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALORIAN_TRAPDOOR.get(), 2)
                .pattern("###")
                .pattern("###")
                .define('#', NorthstarBlocks.CALORIAN_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.CALORIAN_PLANKS.get()), has(NorthstarBlocks.CALORIAN_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COILER_PRESSURE_PLATE.get())
                .pattern("##")
                .define('#', NorthstarBlocks.COILER_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.COILER_PLANKS.get()), has(NorthstarBlocks.COILER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILTER_PRESSURE_PLATE.get())
                .pattern("##")
                .define('#', NorthstarBlocks.WILTER_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.WILTER_PLANKS.get()), has(NorthstarBlocks.WILTER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARGYRE_PRESSURE_PLATE.get())
                .pattern("##")
                .define('#', NorthstarBlocks.ARGYRE_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.ARGYRE_PLANKS.get()), has(NorthstarBlocks.ARGYRE_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALORIAN_PRESSURE_PLATE.get())
                .pattern("##")
                .define('#', NorthstarBlocks.CALORIAN_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.CALORIAN_PLANKS.get()), has(NorthstarBlocks.CALORIAN_PLANKS.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COILER_BUTTON.get())
                .requires(NorthstarBlocks.COILER_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.COILER_PLANKS.get()), has(NorthstarBlocks.COILER_PLANKS.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILTER_BUTTON.get())
                .requires(NorthstarBlocks.WILTER_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.WILTER_PLANKS.get()), has(NorthstarBlocks.WILTER_PLANKS.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARGYRE_BUTTON.get())
                .requires(NorthstarBlocks.ARGYRE_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.ARGYRE_PLANKS.get()), has(NorthstarBlocks.ARGYRE_PLANKS.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALORIAN_BUTTON.get())
                .requires(NorthstarBlocks.CALORIAN_PLANKS.get())
                .unlockedBy(getHasName(NorthstarBlocks.CALORIAN_PLANKS.get()), has(NorthstarBlocks.CALORIAN_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COILER_SIGN.get(), 3)
                .pattern("###")
                .pattern("###")
                .pattern(" X ")
                .define('#', NorthstarBlocks.COILER_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.COILER_PLANKS.get()), has(NorthstarBlocks.COILER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILTER_SIGN.get(), 3)
                .pattern("###")
                .pattern("###")
                .pattern(" X ")
                .define('#', NorthstarBlocks.WILTER_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.WILTER_PLANKS.get()), has(NorthstarBlocks.WILTER_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARGYRE_SIGN.get(), 3)
                .pattern("###")
                .pattern("###")
                .pattern(" X ")
                .define('#', NorthstarBlocks.ARGYRE_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.ARGYRE_PLANKS.get()), has(NorthstarBlocks.ARGYRE_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALORIAN_SIGN.get(), 3)
                .pattern("###")
                .pattern("###")
                .pattern(" X ")
                .define('#', NorthstarBlocks.CALORIAN_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.CALORIAN_PLANKS.get()), has(NorthstarBlocks.CALORIAN_PLANKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COILER_HANGING_SIGN.get(), 6)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .define('#', NorthstarBlocks.STRIPPED_COILER_LOG.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.STRIPPED_COILER_LOG.get()), has(NorthstarBlocks.STRIPPED_COILER_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILTER_HANGING_SIGN.get(), 6)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .define('#', NorthstarBlocks.STRIPPED_WILTER_LOG.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.STRIPPED_WILTER_LOG.get()), has(NorthstarBlocks.STRIPPED_WILTER_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARGYRE_HANGING_SIGN.get(), 6)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .define('#', NorthstarBlocks.STRIPPED_ARGYRE_LOG.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(NorthstarBlocks.STRIPPED_ARGYRE_LOG.get()), has(NorthstarBlocks.STRIPPED_ARGYRE_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALORIAN_HANGING_SIGN.get(), 6)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.STRIPPED_CALORIAN_LOG.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(ModBlocks.STRIPPED_CALORIAN_LOG.get()), has(ModBlocks.STRIPPED_CALORIAN_LOG.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MARS_SAND_PAPER.get())
                .requires(NorthstarBlocks.MARS_SAND.get())
                .requires(Items.PAPER)
                .unlockedBy(getHasName(NorthstarBlocks.MARS_SAND.get()), has(NorthstarBlocks.MARS_SAND.get()))
                .save(consumer);

        // Venus
        oreSmelting(consumer, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 200, "item");
        oreBlasting(consumer, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 100, "item");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_LEAD.get(), 9)
                .requires(ModBlocks.RAW_LEAD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_LEAD_BLOCK.get()), has(ModBlocks.RAW_LEAD_BLOCK.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_LEAD_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_LEAD.get())
                .unlockedBy(getHasName(ModItems.RAW_LEAD.get()), has(ModItems.RAW_LEAD.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 9)
                .requires(ModBlocks.LEAD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.LEAD_BLOCK.get()), has(ModBlocks.LEAD_BLOCK.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_NUGGET.get(), 9)
                .requires(ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.LEAD_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.LEAD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.LEAD_NUGGET.get()), has(ModItems.LEAD_NUGGET.get()))
                .save(consumer, NorthstarExtras.MOD_ID + ":lead_ingot_from_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_SHEETMETAL.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.LEAD_SHEET.get())
                .unlockedBy(getHasName(ModItems.LEAD_SHEET.get()), has(ModItems.LEAD_SHEET.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_SHEETMETAL_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.LEAD_SHEETMETAL.get())
                .unlockedBy(getHasName(ModItems.LEAD_SHEET.get()), has(ModItems.LEAD_SHEET.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_SHEETMETAL_VERTICAL_SLAB.get(), 6)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .define('#', ModBlocks.LEAD_SHEETMETAL.get())
                .unlockedBy(getHasName(ModItems.LEAD_SHEET.get()), has(ModItems.LEAD_SHEET.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_PLATING.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_PLATING_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.LEAD_PLATING.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_PLATING_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.LEAD_PLATING.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_PLATING_VERTICAL_SLAB.get(), 6)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .define('#', ModBlocks.LEAD_PLATING.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_PILLAR.get(), 2)
                .pattern("#")
                .pattern("#")
                .define('#', ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_GRATE.get(), 5)
                .pattern("# #")
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModItems.LEAD_SHEET.get())
                .unlockedBy(getHasName(ModItems.LEAD_SHEET.get()), has(ModItems.LEAD_SHEET.get()))
                .save(consumer);

        // Jupiter
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICKS.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.JUPITER_STONE.get())
                .unlockedBy(getHasName(ModBlocks.JUPITER_STONE.get()), has(ModBlocks.JUPITER_STONE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICKS.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.JUPITER_DEEP_STONE.get())
                .unlockedBy(getHasName(ModBlocks.JUPITER_DEEP_STONE.get()), has(ModBlocks.JUPITER_DEEP_STONE.get()))
                .save(consumer, "jupiter_stone_bricks_deep");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICK_STAIRS.get(), 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.JUPITER_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.JUPITER_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICK_VERTICAL_SLAB.get(), 6)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .define('#', ModBlocks.JUPITER_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICK_WALL.get(), 6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.JUPITER_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_PILLAR.get(), 2)
                .pattern("#")
                .pattern("#")
                .define('#', ModBlocks.JUPITER_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_JUPITER_STONE.get())
                .pattern("#")
                .pattern("#")
                .define('#', ModBlocks.JUPITER_STONE_BRICK_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_LAMP.get(), 4)
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .define('#', ModBlocks.JUPITER_STONE_BRICKS.get())
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICK_VERTICAL_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_BRICK_VERTICAL_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_PILLAR.get(), 1);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, NorthstarExtras.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void stonecutting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), category, result, count)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(pFinishedRecipeConsumer, NorthstarExtras.MOD_ID + ":" + getItemName(result) + "_from_" + getItemName(ingredient) + "_stonecutting");
    }
}
