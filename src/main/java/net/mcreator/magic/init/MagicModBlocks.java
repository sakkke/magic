
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magic.block.Test02Block;
import net.mcreator.magic.block.PoisonPumpkinBlock;
import net.mcreator.magic.MagicMod;

public class MagicModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicMod.MODID);
	public static final RegistryObject<Block> POISON_PUMPKIN = REGISTRY.register("poison_pumpkin", () -> new PoisonPumpkinBlock());
	public static final RegistryObject<Block> TEST_01FIREBLOCK = REGISTRY.register("test_01fireblock", () -> new Test01fireblockBlock());
	public static final RegistryObject<Block> TEST_02 = REGISTRY.register("test_02", () -> new Test02Block());
}
