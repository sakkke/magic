
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magic.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.magic.client.renderer.RedGhastRenderer;
import net.mcreator.magic.client.renderer.PortalRenderer;
import net.mcreator.magic.client.renderer.HoukiRenderer;
import net.mcreator.magic.client.renderer.GreenGhastRenderer;
import net.mcreator.magic.client.renderer.BlueGhastRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MagicModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MagicModEntities.PORTAL.get(), PortalRenderer::new);
		event.registerEntityRenderer(MagicModEntities.RED_GHAST.get(), RedGhastRenderer::new);
		event.registerEntityRenderer(MagicModEntities.BLUE_GHAST.get(), BlueGhastRenderer::new);
		event.registerEntityRenderer(MagicModEntities.GREEN_GHAST.get(), GreenGhastRenderer::new);
		event.registerEntityRenderer(MagicModEntities.HOUKI.get(), HoukiRenderer::new);
	}
}
