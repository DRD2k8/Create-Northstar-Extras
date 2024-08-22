package com.drd.northstar_extras.init;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.block.entity.CustomHangingSignBlockEntity;
import com.drd.northstar_extras.block.entity.CustomSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NorthstarExtras.MOD_ID);

    public static final RegistryObject<BlockEntityType<CustomSignBlockEntity>> SIGN =
            BLOCK_ENTITIES.register("sign", () ->
                    BlockEntityType.Builder.of(CustomSignBlockEntity::new,
                            ModBlocks.ARGYRE_SIGN.get(), ModBlocks.ARGYRE_WALL_SIGN.get(), ModBlocks.COILER_SIGN.get(), ModBlocks.COILER_WALL_SIGN.get(), ModBlocks.WILTER_SIGN.get(), ModBlocks.WILTER_WALL_SIGN.get(), ModBlocks.CALORIAN_SIGN.get(), ModBlocks.CALORIAN_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<CustomHangingSignBlockEntity>> HANGING_SIGN =
            BLOCK_ENTITIES.register("hanging_sign", () ->
                    BlockEntityType.Builder.of(CustomHangingSignBlockEntity::new,
                            ModBlocks.ARGYRE_HANGING_SIGN.get(), ModBlocks.ARGYRE_WALL_HANGING_SIGN.get(), ModBlocks.COILER_HANGING_SIGN.get(), ModBlocks.COILER_WALL_HANGING_SIGN.get(), ModBlocks.WILTER_HANGING_SIGN.get(), ModBlocks.WILTER_WALL_HANGING_SIGN.get(), ModBlocks.CALORIAN_HANGING_SIGN.get(), ModBlocks.CALORIAN_WALL_HANGING_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
