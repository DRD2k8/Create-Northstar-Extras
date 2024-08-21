package com.drd.northstar_extras.datagen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.init.ModBlocks;
import com.drd.northstar_extras.init.ModItems;
import com.drd.northstar_extras.util.tag.ModItemTags;
import com.lightning.northstar.block.NorthstarBlocks;
import com.lightning.northstar.item.NorthstarItems;
import com.simibubi.create.AllTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, NorthstarExtras.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(Tags.Items.RAW_MATERIALS)
                .addTag(ModItemTags.RAW_TUNGSTEN)
                .addTag(ModItemTags.RAW_LEAD);

        this.tag(Tags.Items.INGOTS)
                .addTag(ModItemTags.MARTIAN_STEEL_INGOTS)
                .addTag(ModItemTags.TUNGSTEN_INGOTS)
                .addTag(ModItemTags.LEAD_INGOTS);

        this.tag(ModItemTags.MARTIAN_STEEL_INGOTS)
                .add(NorthstarItems.MARTIAN_STEEL.get());

        this.tag(ModItemTags.MARTIAN_STEEL_PLATES)
                .add(NorthstarItems.MARTIAN_STEEL_SHEET.get());

        this.tag(ModItemTags.MARTIAN_STEEL_BLOCKS)
                .add(NorthstarBlocks.MARTIAN_STEEL_BLOCK.get().asItem());

        this.tag(ModItemTags.RAW_TUNGSTEN)
                .add(NorthstarItems.RAW_TUNGSTEN_ORE.get());

        this.tag(ModItemTags.TUNGSTEN_INGOTS)
                .add(NorthstarItems.TUNGSTEN_INGOT.get());

        this.tag(ModItemTags.TUNGSTEN_NUGGETS)
                .add(NorthstarItems.TUNGSTEN_NUGGET.get());

        this.tag(ModItemTags.TUNGSTEN_PLATES)
                .add(NorthstarItems.TUNGSTEN_SHEET.get());

        this.tag(ModItemTags.TUNGSTEN_BLOCKS)
                .add(NorthstarBlocks.TUNGSTEN_BLOCK.get().asItem());

        this.tag(ModItemTags.RAW_LEAD)
                .add(ModItems.RAW_LEAD.get());

        this.tag(ModItemTags.LEAD_INGOTS)
                .add(ModItems.LEAD_INGOT.get());

        this.tag(ModItemTags.LEAD_NUGGETS)
                .add(ModItems.LEAD_NUGGET.get());

        this.tag(ModItemTags.LEAD_PLATES)
                .add(ModItems.LEAD_SHEET.get());

        this.tag(ModItemTags.LEAD_BLOCKS)
                .add(ModBlocks.LEAD_BLOCK.get().asItem());

        this.tag(Tags.Items.ORES)
                .addTag(ModItemTags.TUNGSTEN_ORES)
                .addTag(ModItemTags.LEAD_ORES);

        this.tag(ModItemTags.TUNGSTEN_ORES)
                .add(NorthstarBlocks.MERCURY_TUNGSTEN_ORE.get().asItem())
                .add(NorthstarBlocks.MERCURY_DEEP_TUNGSTEN_ORE.get().asItem());

        this.tag(ModItemTags.LEAD_ORES)
                .add(ModBlocks.VENUS_LEAD_ORE.get().asItem())
                .add(ModBlocks.VENUS_DEEP_LEAD_ORE.get().asItem());

        this.tag(ItemTags.STAIRS)
                .add(ModBlocks.LEAD_PLATING_STAIRS.get().asItem());

        this.tag(ItemTags.SLABS)
                .add(ModBlocks.LEAD_SHEETMETAL_SLAB.get().asItem())
                .add(ModBlocks.LEAD_PLATING_SLAB.get().asItem());

        this.tag(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.COILER_FENCE.get().asItem())
                .add(ModBlocks.WILTER_FENCE.get().asItem())
                .add(ModBlocks.ARGYRE_FENCE.get().asItem())
                .add(ModBlocks.CALORIAN_FENCE.get().asItem());

        this.tag(ItemTags.FENCE_GATES)
                .add(ModBlocks.COILER_FENCE_GATE.get().asItem())
                .add(ModBlocks.WILTER_FENCE_GATE.get().asItem())
                .add(ModBlocks.ARGYRE_FENCE_GATE.get().asItem())
                .add(ModBlocks.CALORIAN_FENCE_GATE.get().asItem());

        this.tag(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.COILER_DOOR.get().asItem())
                .add(ModBlocks.WILTER_DOOR.get().asItem())
                .add(ModBlocks.ARGYRE_DOOR.get().asItem())
                .add(ModBlocks.CALORIAN_DOOR.get().asItem());

        this.tag(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.COILER_TRAPDOOR.get().asItem())
                .add(ModBlocks.WILTER_TRAPDOOR.get().asItem())
                .add(ModBlocks.ARGYRE_TRAPDOOR.get().asItem())
                .add(ModBlocks.CALORIAN_TRAPDOOR.get().asItem());

        this.tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.COILER_PRESSURE_PLATE.get().asItem())
                .add(ModBlocks.WILTER_PRESSURE_PLATE.get().asItem())
                .add(ModBlocks.ARGYRE_PRESSURE_PLATE.get().asItem())
                .add(ModBlocks.CALORIAN_PRESSURE_PLATE.get().asItem());

        this.tag(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.COILER_BUTTON.get().asItem())
                .add(ModBlocks.WILTER_BUTTON.get().asItem())
                .add(ModBlocks.ARGYRE_BUTTON.get().asItem())
                .add(ModBlocks.CALORIAN_BUTTON.get().asItem());

        this.tag(ItemTags.LOGS)
                .add(NorthstarBlocks.ARGYRE_LOG.get().asItem())
                .add(NorthstarBlocks.STRIPPED_ARGYRE_LOG.get().asItem())
                .add(NorthstarBlocks.COILER_LOG.get().asItem())
                .add(NorthstarBlocks.STRIPPED_COILER_LOG.get().asItem())
                .add(NorthstarBlocks.WILTER_LOG.get().asItem())
                .add(NorthstarBlocks.STRIPPED_WILTER_LOG.get().asItem())
                .add(NorthstarBlocks.CALORIAN_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_CALORIAN_LOG.get().asItem())
                .add(ModBlocks.ARGYRE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ARGYRE_WOOD.get().asItem())
                .add(ModBlocks.COILER_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_COILER_WOOD.get().asItem())
                .add(ModBlocks.WILTER_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WILTER_WOOD.get().asItem())
                .add(ModBlocks.CALORIAN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CALORIAN_WOOD.get().asItem());

        this.tag(ItemTags.SIGNS)
                .add(ModItems.COILER_SIGN.get())
                .add(ModItems.WILTER_SIGN.get())
                .add(ModItems.ARGYRE_SIGN.get())
                .add(ModItems.CALORIAN_SIGN.get());

        this.tag(ItemTags.HANGING_SIGNS)
                .add(ModItems.COILER_HANGING_SIGN.get())
                .add(ModItems.WILTER_HANGING_SIGN.get())
                .add(ModItems.ARGYRE_HANGING_SIGN.get())
                .add(ModItems.CALORIAN_HANGING_SIGN.get());

        this.tag(AllTags.AllItemTags.SANDPAPER.tag)
                .add(ModItems.MARS_SAND_PAPER.get());
    }
}
