
package net.mcreator.magic.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.magic.entity.TestEntity;
import net.mcreator.magic.client.model.Modeltest;

public class TestRenderer extends MobRenderer<TestEntity, Modeltest<TestEntity>> {
	public TestRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltest(context.bakeLayer(Modeltest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TestEntity entity) {
		return new ResourceLocation("magic:textures/entities/texture.png");
	}
}
