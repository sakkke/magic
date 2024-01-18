
package net.mcreator.magic.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.magic.entity.BlueGhastEntity;

public class BlueGhastRenderer extends MobRenderer<BlueGhastEntity, GhastModel<BlueGhastEntity>> {
	public BlueGhastRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueGhastEntity entity) {
		return new ResourceLocation("magic:textures/entities/blue_ghast.png");
	}
}
