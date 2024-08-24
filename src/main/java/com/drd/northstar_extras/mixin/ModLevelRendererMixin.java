package com.drd.northstar_extras.mixin;

import com.drd.northstar_extras.NorthstarExtras;
import com.drd.northstar_extras.planet.ModDimensionKeys;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@OnlyIn(Dist.CLIENT)
@Mixin(LevelRenderer.class)
public class ModLevelRendererMixin {
    @Unique
    private static final ResourceLocation CERES_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/ceres_close.png");
    @Unique
    private static final ResourceLocation JUPITER_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/jupiter_close.png");
    @Unique
    private static final ResourceLocation SATURN_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/saturn_close.png");
    @Unique
    private static final ResourceLocation URANUS_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/uranus_close.png");
    @Unique
    private static final ResourceLocation NEPTUNE_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/neptune_close.png");
    @Unique
    private static final ResourceLocation PLUTO_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/pluto_close.png");
    @Unique
    private static final ResourceLocation ERIS_CLOSE = new ResourceLocation(NorthstarExtras.MOD_ID, "textures/environment/eris_close.png");
    @Final
    @Shadow
    private Minecraft minecraft;

    @Inject(method = "renderSky", at = @At("HEAD"))
    private void renderSky(PoseStack pPoseStack, Matrix4f pProjectionMatrix, float pPartialTick, Camera camera, boolean thing, Runnable runnable, CallbackInfo info) {
        ResourceKey<Level> player_dim = Minecraft.getInstance().level.dimension();
        if (this.minecraft != null) {
            BufferBuilder bufferbuilder;
            float playerEyeLevel;
            float planetBrightness;
            float EF;
            float NS;
            if (player_dim == ModDimensionKeys.JUPITER_DIM_KEY) {
                bufferbuilder = Tesselator.getInstance().getBuilder();
                playerEyeLevel = (float)this.minecraft.player.getEyePosition(pPartialTick).y;
                planetBrightness = (playerEyeLevel - 400.0F) / 100.0F;
                EF = (playerEyeLevel - 400.0F) / 10.0F;
                if (playerEyeLevel > 400.0F) {
                    NS = 1500.0F;
                    if (playerEyeLevel > 650.0F) {
                        RenderSystem.disableBlend();
                    } else {
                        RenderSystem.enableBlend();
                    }

                    Matrix4f matrix4f2 = pPoseStack.last().pose();
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, planetBrightness);
                    RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                    RenderSystem.setShader(GameRenderer::getPositionTexShader);
                    RenderSystem.setShaderTexture(0, JUPITER_CLOSE);
                    bufferbuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);
                    bufferbuilder.vertex(matrix4f2, NS, -100.0F - EF, -NS).uv(0.0F, 0.0F).endVertex();
                    bufferbuilder.vertex(matrix4f2, -NS, -100.0F - EF, -NS).uv(1.0F, 0.0F).endVertex();
                    bufferbuilder.vertex(matrix4f2, -NS, -100.0F - EF, NS).uv(1.0F, 1.0F).endVertex();
                    bufferbuilder.vertex(matrix4f2, NS, -100.0F - EF, NS).uv(0.0F, 1.0F).endVertex();
                    BufferUploader.drawWithShader(bufferbuilder.end());
                }
            }
        }
    }
}
