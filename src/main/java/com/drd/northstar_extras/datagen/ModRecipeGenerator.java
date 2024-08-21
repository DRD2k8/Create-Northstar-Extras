package com.drd.northstar_extras.datagen;

import com.drd.northstar_extras.init.ModBlocks;
import com.drd.northstar_extras.init.ModItems;
import com.lightning.northstar.block.NorthstarBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public ModRecipeGenerator(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
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
    }
}
