
package net.mcreator.magic.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.magic.entity.PortalEntity;
import net.mcreator.magic.client.model.Modelportal;

public class PortalRenderer extends MobRenderer<PortalEntity, Modelportal<PortalEntity>> {
	public PortalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelportal(context.bakeLayer(Modelportal.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(PortalEntity entity) {
		return new ResourceLocation("magic:textures/entities/texture-kleki.png");
	}
}
