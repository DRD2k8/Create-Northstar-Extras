package com.drd.northstar_extras.util;

import com.drd.northstar_extras.mixin.LogStripping;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class ModUtils {
    public static void registerStrippedLog(Block log, Block strippedLog) {
        initStrippedLog(log, strippedLog);
    }

    public static void initStrippedLog(Block log, Block strippedLog) {
        Map<Block, Block> strippedBlocks = new HashMap(LogStripping.northstar_extras$getStrippables());
        strippedBlocks.put(log, strippedLog);
        LogStripping.northstar_extras$setStrippables(strippedBlocks);
    }
}
