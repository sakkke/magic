
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.magic.world.features.plants.HealflowerFeature;
import net.mcreator.magic.MagicMod;

@Mod.EventBusSubscriber
public class MagicModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MagicMod.MODID);
	public static final RegistryObject<Feature<?>> HEALFLOWER = REGISTRY.register("healflower", HealflowerFeature::new);
}
