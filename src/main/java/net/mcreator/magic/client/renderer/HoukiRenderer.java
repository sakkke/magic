
package net.mcreator.magic.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.magic.entity.HoukiEntity;
import net.mcreator.magic.client.model.Modelhouki;

public class HoukiRenderer extends MobRenderer<HoukiEntity, Modelhouki<HoukiEntity>> {
	public HoukiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhouki(context.bakeLayer(Modelhouki.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HoukiEntity entity) {
		return new ResourceLocation("magic:textures/entities/texturehouki.png");
	}
}
