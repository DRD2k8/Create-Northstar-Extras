package com.drd.northstar_extras.block.entity;

import com.drd.northstar_extras.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomHangingSignBlockEntity extends HangingSignBlockEntity {
    public CustomHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.HANGING_SIGN.get();
    }
}
