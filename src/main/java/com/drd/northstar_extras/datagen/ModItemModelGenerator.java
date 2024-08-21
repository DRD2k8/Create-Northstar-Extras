package com.drd.northstar_extras.datagen;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.init.ModBlocks;
import com.drd.northstar_extras.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelGenerator extends ItemModelProvider {
    public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NorthstarExtras.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        evenSimplerBlockItem(ModBlocks.COILER_WOOD);
        evenSimplerBlockItem(ModBlocks.STRIPPED_COILER_WOOD);
        blockInventoryItem(ModBlocks.COILER_FENCE);
        evenSimplerBlockItem(ModBlocks.COILER_FENCE_GATE);
        simpleBlockItem(ModBlocks.COILER_DOOR);
        trapdoorItem(ModBlocks.COILER_TRAPDOOR);
        evenSimplerBlockItem(ModBlocks.COILER_PRESSURE_PLATE);
        blockInventoryItem(ModBlocks.COILER_BUTTON);
        simpleItem(ModItems.COILER_SIGN);
        simpleItem(ModItems.COILER_HANGING_SIGN);
        evenSimplerBlockItem(ModBlocks.WILTER_WOOD);
        evenSimplerBlockItem(ModBlocks.STRIPPED_WILTER_WOOD);
        blockInventoryItem(ModBlocks.WILTER_FENCE);
        evenSimplerBlockItem(ModBlocks.WILTER_FENCE_GATE);
        simpleBlockItem(ModBlocks.WILTER_DOOR);
        trapdoorItem(ModBlocks.WILTER_TRAPDOOR);
        evenSimplerBlockItem(ModBlocks.WILTER_PRESSURE_PLATE);
        blockInventoryItem(ModBlocks.WILTER_BUTTON);
        simpleItem(ModItems.WILTER_SIGN);
        simpleItem(ModItems.WILTER_HANGING_SIGN);
        evenSimplerBlockItem(ModBlocks.ARGYRE_WOOD);
        evenSimplerBlockItem(ModBlocks.STRIPPED_ARGYRE_WOOD);
        blockInventoryItem(ModBlocks.ARGYRE_FENCE);
        evenSimplerBlockItem(ModBlocks.ARGYRE_FENCE_GATE);
        simpleBlockItem(ModBlocks.ARGYRE_DOOR);
        trapdoorItem(ModBlocks.ARGYRE_TRAPDOOR);
        evenSimplerBlockItem(ModBlocks.ARGYRE_PRESSURE_PLATE);
        blockInventoryItem(ModBlocks.ARGYRE_BUTTON);
        simpleItem(ModItems.ARGYRE_SIGN);
        simpleItem(ModItems.ARGYRE_HANGING_SIGN);
        evenSimplerBlockItem(ModBlocks.STRIPPED_CALORIAN_LOG);
        evenSimplerBlockItem(ModBlocks.CALORIAN_WOOD);
        evenSimplerBlockItem(ModBlocks.STRIPPED_CALORIAN_WOOD);
        blockInventoryItem(ModBlocks.CALORIAN_FENCE);
        evenSimplerBlockItem(ModBlocks.CALORIAN_FENCE_GATE);
        simpleBlockItem(ModBlocks.CALORIAN_DOOR);
        trapdoorItem(ModBlocks.CALORIAN_TRAPDOOR);
        evenSimplerBlockItem(ModBlocks.CALORIAN_PRESSURE_PLATE);
        blockInventoryItem(ModBlocks.CALORIAN_BUTTON);
        simpleItem(ModItems.CALORIAN_SIGN);
        simpleItem(ModItems.CALORIAN_HANGING_SIGN);
        simpleItem(ModItems.MARS_SAND_PAPER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NorthstarExtras.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder blockInventoryItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation(NorthstarExtras.MOD_ID, "block/" + item.getId().getPath() + "_inventory"));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(NorthstarExtras.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NorthstarExtras.MOD_ID,"item/" + item.getId().getPath()));
    }
}
