package com.drd.northstar_extras.datagen.loot;

import com.drd.northstar_extras.init.ModBlocks;
import com.drd.northstar_extras.init.ModItems;
import com.lightning.northstar.item.NorthstarItems;
import com.simibubi.create.AllItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
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

        // Venus
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

        // Jupiter
        this.dropSelf(ModBlocks.JUPITER_ASH.get());
        this.dropSelf(ModBlocks.JUPITER_STONE.get());
        this.dropSelf(ModBlocks.JUPITER_DEEP_STONE.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get());
        this.add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.JUPITER_STONE_BRICK_SLAB.get()));
        this.add(ModBlocks.JUPITER_STONE_BRICK_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.JUPITER_STONE_BRICK_VERTICAL_SLAB.get()));
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_PILLAR.get());
        this.dropSelf(ModBlocks.CHISELED_JUPITER_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_JUPITER_STONE.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_LAMP.get());
        this.add(ModBlocks.JUPITER_IRON_ORE.get(), createOreDrop(ModBlocks.JUPITER_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.JUPITER_COPPER_ORE.get(), createCopperLikeOreDrops(ModBlocks.JUPITER_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.JUPITER_GOLD_ORE.get(), createOreDrop(ModBlocks.JUPITER_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.JUPITER_DIAMOND_ORE.get(), createOreDrop(ModBlocks.JUPITER_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.JUPITER_REDSTONE_ORE.get(), createOreDrop(ModBlocks.JUPITER_REDSTONE_ORE.get(), Items.REDSTONE));
        this.add(ModBlocks.JUPITER_QUARTZ_ORE.get(), createOreDrop(ModBlocks.JUPITER_QUARTZ_ORE.get(), Items.QUARTZ));
        this.add(ModBlocks.JUPITER_ZINC_ORE.get(), createOreDrop(ModBlocks.JUPITER_ZINC_ORE.get(), AllItems.RAW_ZINC.get()));
        this.add(ModBlocks.JUPITER_GLOWSTONE_ORE.get(), createOreDrop(ModBlocks.JUPITER_GLOWSTONE_ORE.get(), NorthstarItems.RAW_GLOWSTONE_ORE.get()));
        this.add(ModBlocks.JUPITER_PALLADIUM_ORE.get(), createOreDrop(ModBlocks.JUPITER_PALLADIUM_ORE.get(), ModItems.RAW_PALLADIUM.get()));
        this.add(ModBlocks.JUPITER_DEEP_IRON_ORE.get(), createOreDrop(ModBlocks.JUPITER_DEEP_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.JUPITER_DEEP_COPPER_ORE.get(), createCopperLikeOreDrops(ModBlocks.JUPITER_DEEP_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.JUPITER_DEEP_GOLD_ORE.get(), createOreDrop(ModBlocks.JUPITER_DEEP_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.JUPITER_DEEP_DIAMOND_ORE.get(), createOreDrop(ModBlocks.JUPITER_DEEP_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.JUPITER_DEEP_REDSTONE_ORE.get(), createOreDrop(ModBlocks.JUPITER_DEEP_REDSTONE_ORE.get(), Items.REDSTONE));
        this.add(ModBlocks.JUPITER_DEEP_QUARTZ_ORE.get(), createOreDrop(ModBlocks.JUPITER_DEEP_QUARTZ_ORE.get(), Items.QUARTZ));
        this.add(ModBlocks.JUPITER_DEEP_ZINC_ORE.get(), createOreDrop(ModBlocks.JUPITER_DEEP_ZINC_ORE.get(), AllItems.RAW_ZINC.get()));
        this.add(ModBlocks.JUPITER_DEEP_GLOWSTONE_ORE.get(), createOreDrop(ModBlocks.JUPITER_DEEP_GLOWSTONE_ORE.get(), NorthstarItems.RAW_GLOWSTONE_ORE.get()));
        this.add(ModBlocks.JUPITER_DEEP_PALLADIUM_ORE.get(), createOreDrop(ModBlocks.JUPITER_DEEP_PALLADIUM_ORE.get(), ModItems.RAW_PALLADIUM.get()));
        this.dropSelf(ModBlocks.RAW_PALLADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PALLADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PALLADIUM_SHEETMETAL.get());
        this.add(ModBlocks.PALLADIUM_SHEETMETAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PALLADIUM_SHEETMETAL_SLAB.get()));
        this.add(ModBlocks.PALLADIUM_SHEETMETAL_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PALLADIUM_SHEETMETAL_VERTICAL_SLAB.get()));
        this.dropSelf(ModBlocks.PALLADIUM_PLATING.get());
        this.dropSelf(ModBlocks.PALLADIUM_PLATING_STAIRS.get());
        this.add(ModBlocks.PALLADIUM_PLATING_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PALLADIUM_PLATING_SLAB.get()));
        this.add(ModBlocks.PALLADIUM_PLATING_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PALLADIUM_PLATING_VERTICAL_SLAB.get()));
        this.dropSelf(ModBlocks.PALLADIUM_PILLAR.get());
        this.dropSelf(ModBlocks.PALLADIUM_GRATE.get());
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
