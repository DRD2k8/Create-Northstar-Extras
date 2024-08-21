package com.drd.northstar_extras.mixin;

import com.drd.northstar_extras.util.tag.ModBlockTags;
import com.lightning.northstar.contraptions.NorthstarContraptionTypes;
import com.lightning.northstar.contraptions.RocketContraption;
import com.simibubi.create.content.contraptions.AssemblyException;
import com.simibubi.create.content.contraptions.ContraptionType;
import com.simibubi.create.content.contraptions.TranslatingContraption;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RocketContraption.class)
public class ModRocketTierStuff extends TranslatingContraption {
    @Shadow
    public int heatShielding = 0;

    @Inject(method = "capture", at = @At("TAIL"), remap = false)
    protected void northstar_extras$capture(Level world, BlockPos pos, CallbackInfoReturnable<Pair<StructureTemplate.StructureBlockInfo, BlockEntity>> cir) {
        BlockState blockState = world.getBlockState(pos);

        if (blockState.is(ModBlockTags.TIER_4_HEAT_RESISTANCE) && !blockState.is(Blocks.AIR)) {
            this.heatShielding += 50;
        }
    }

    @Override
    public boolean assemble(Level world, BlockPos pos) throws AssemblyException {
        if (!this.searchMovedStructure(world, pos, (Direction)null)) {
            return false;
        } else {
            System.out.print(this.blocks.size());
            this.startMoving(world);
            return true;
        }
    }

    @Override
    public ContraptionType getType() {
        return NorthstarContraptionTypes.ROCKET;
    }
}
