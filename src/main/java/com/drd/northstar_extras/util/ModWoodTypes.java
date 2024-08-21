package com.drd.northstar_extras.util;

import com.drd.northstar_extras.NorthstarExtras;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType COILER = WoodType.register(new WoodType(NorthstarExtras.MOD_ID + ":coiler", BlockSetType.OAK));
    public static final WoodType WILTER = WoodType.register(new WoodType(NorthstarExtras.MOD_ID + ":wilter", BlockSetType.OAK));
    public static final WoodType ARGYRE = WoodType.register(new WoodType(NorthstarExtras.MOD_ID + ":argyre", BlockSetType.OAK));
    public static final WoodType CALORIAN = WoodType.register(new WoodType(NorthstarExtras.MOD_ID + ":calorian", BlockSetType.OAK));
}
