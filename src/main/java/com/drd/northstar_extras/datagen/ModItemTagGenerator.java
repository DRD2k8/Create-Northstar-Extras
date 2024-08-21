package com.drd.northstar_extras.datagen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.init.ModBlocks;
import com.drd.northstar_extras.init.ModItems;
import com.lightning.northstar.block.NorthstarBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
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
    }
}
