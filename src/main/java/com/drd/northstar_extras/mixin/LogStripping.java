package com.drd.northstar_extras.mixin;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin({AxeItem.class})
public interface LogStripping {
    @Accessor("STRIPPABLES")
    static Map<Block, Block> northstar_extras$getStrippables() {
        throw new UnsupportedOperationException();
    }

    @Mutable
    @Accessor("STRIPPABLES")
    static void northstar_extras$setStrippables(Map<Block, Block> value) {
        throw new UnsupportedOperationException();
    }
}
