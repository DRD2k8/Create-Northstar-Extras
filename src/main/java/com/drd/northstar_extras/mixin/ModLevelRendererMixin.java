package com.drd.northstar_extras.mixin;

import com.drd.northstar_extras.NorthstarExtras;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;

@OnlyIn(Dist.CLIENT)
@Mixin(LevelRenderer.class)
public class ModLevelRendererMixin {
    private static final ResourceLocation CERES_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/ceres_close.png");
    private static final ResourceLocation JUPITER_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/jupiter_close.png");
    private static final ResourceLocation SATURN_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/saturn_close.png");
    private static final ResourceLocation URANUS_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/uranus_close.png");
    private static final ResourceLocation NEPTUNE_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/neptune_close.png");
    private static final ResourceLocation PLUTO_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/pluto_close.png");
    private static final ResourceLocation ERIS_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/eris_close.png");
}
