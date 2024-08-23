package com.drd.northstar_extras.mixin;

import com.drd.northstar_extras.planet.ModDimensionKeys;
import com.lightning.northstar.world.dimension.NorthstarPlanets;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NorthstarPlanets.class)
public class ModPlanets {
    @Inject(method = "getPlanetDimension", at = @At("RETURN"), remap = false, cancellable = true)
    private static void getPlanetDimension(String name, CallbackInfoReturnable<ResourceKey<Level>> cir) {
        if (name.equals("jupiter")) {
            cir.setReturnValue(ModDimensionKeys.JUPITER_DIM_KEY);
        }
    }
}
