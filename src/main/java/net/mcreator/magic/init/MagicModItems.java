
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.magic.item.ThunderRodItem;
import net.mcreator.magic.item.SunRodItem;
import net.mcreator.magic.item.RainRodItem;
import net.mcreator.magic.item.InfinityRodItem;
import net.mcreator.magic.MagicMod;

public class MagicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicMod.MODID);
	public static final RegistryObject<Item> RAIN_ROD = REGISTRY.register("rain_rod", () -> new RainRodItem());
	public static final RegistryObject<Item> INFINITY_ROD = REGISTRY.register("infinity_rod", () -> new InfinityRodItem());
	public static final RegistryObject<Item> SUN_ROD = REGISTRY.register("sun_rod", () -> new SunRodItem());
	public static final RegistryObject<Item> THUNDER_ROD = REGISTRY.register("thunder_rod", () -> new ThunderRodItem());
	public static final RegistryObject<Item> POISON_PUMPKIN = block(MagicModBlocks.POISON_PUMPKIN);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
