
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.magic.fluid.types.WaterdFluidType;
import net.mcreator.magic.MagicMod;

public class MagicModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MagicMod.MODID);
	public static final RegistryObject<FluidType> WATERD_TYPE = REGISTRY.register("waterd", () -> new WaterdFluidType());
}
