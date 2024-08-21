package com.drd.northstar_extras.init;

import com.drd.northstar_extras.NorthstarExtras;
import com.lightning.northstar.item.NorthstarItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NorthstarExtras.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NORTHSTAR_EXTRAS_TAB = TABS.register("northstar_extras_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NorthstarItems.TUNGSTEN_INGOT.get()))
                    .title(Component.translatable("itemGroup.northstar_extras"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ARGYRE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_ARGYRE_WOOD.get());
                        pOutput.accept(ModBlocks.ARGYRE_FENCE.get());
                        pOutput.accept(ModBlocks.ARGYRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ARGYRE_DOOR.get());
                        pOutput.accept(ModBlocks.ARGYRE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.ARGYRE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.ARGYRE_BUTTON.get());
                        pOutput.accept(ModItems.ARGYRE_SIGN.get());
                        pOutput.accept(ModItems.ARGYRE_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.COILER_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_COILER_WOOD.get());
                        pOutput.accept(ModBlocks.COILER_FENCE.get());
                        pOutput.accept(ModBlocks.COILER_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.COILER_DOOR.get());
                        pOutput.accept(ModBlocks.COILER_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.COILER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.COILER_BUTTON.get());
                        pOutput.accept(ModItems.COILER_SIGN.get());
                        pOutput.accept(ModItems.COILER_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.WILTER_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_WILTER_WOOD.get());
                        pOutput.accept(ModBlocks.WILTER_FENCE.get());
                        pOutput.accept(ModBlocks.WILTER_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.WILTER_DOOR.get());
                        pOutput.accept(ModBlocks.WILTER_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.WILTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.WILTER_BUTTON.get());
                        pOutput.accept(ModItems.WILTER_SIGN.get());
                        pOutput.accept(ModItems.WILTER_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.STRIPPED_CALORIAN_LOG.get());
                        pOutput.accept(ModBlocks.CALORIAN_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_CALORIAN_WOOD.get());
                        pOutput.accept(ModBlocks.CALORIAN_FENCE.get());
                        pOutput.accept(ModBlocks.CALORIAN_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.CALORIAN_DOOR.get());
                        pOutput.accept(ModBlocks.CALORIAN_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.CALORIAN_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.CALORIAN_BUTTON.get());
                        pOutput.accept(ModItems.CALORIAN_SIGN.get());
                        pOutput.accept(ModItems.CALORIAN_HANGING_SIGN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
