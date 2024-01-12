
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.magic.fluid.WaterdFluid;
import net.mcreator.magic.MagicMod;

public class MagicModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, MagicMod.MODID);
	public static final RegistryObject<FlowingFluid> WATERD = REGISTRY.register("waterd", () -> new WaterdFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_WATERD = REGISTRY.register("flowing_waterd", () -> new WaterdFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(WATERD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WATERD.get(), RenderType.translucent());
		}
	}
}
