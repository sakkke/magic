
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

import net.mcreator.magic.item.TurtleRodItem;
import net.mcreator.magic.item.WaterhazardItem;
import net.mcreator.magic.item.WaterdItem;
import net.mcreator.magic.item.ThunderRodItem;
import net.mcreator.magic.item.SunsetRodItem;
import net.mcreator.magic.item.SunriseRodItem;
import net.mcreator.magic.item.SunRodItem;
import net.mcreator.magic.item.RainRodItem;
import net.mcreator.magic.item.QwertyuiopItem;
import net.mcreator.magic.item.NoonRodItem;
import net.mcreator.magic.item.NightRodItem;
import net.mcreator.magic.item.NantokaRodItem;
import net.mcreator.magic.item.MidnightRodItem;
import net.mcreator.magic.item.InfinityRodItem;
import net.mcreator.magic.item.HasteStaffItem;
import net.mcreator.magic.item.DayRodItem;
import net.mcreator.magic.item.BlankstaffItem;
import net.mcreator.magic.MagicMod;

public class MagicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicMod.MODID);
	public static final RegistryObject<Item> RAIN_ROD = REGISTRY.register("rain_rod", () -> new RainRodItem());
	public static final RegistryObject<Item> INFINITY_ROD = REGISTRY.register("infinity_rod", () -> new InfinityRodItem());
	public static final RegistryObject<Item> SUN_ROD = REGISTRY.register("sun_rod", () -> new SunRodItem());
	public static final RegistryObject<Item> THUNDER_ROD = REGISTRY.register("thunder_rod", () -> new ThunderRodItem());
	public static final RegistryObject<Item> POISON_PUMPKIN = block(MagicModBlocks.POISON_PUMPKIN);
	public static final RegistryObject<Item> DAY_ROD = REGISTRY.register("day_rod", () -> new DayRodItem());
	public static final RegistryObject<Item> SUNRISE_ROD = REGISTRY.register("sunrise_rod", () -> new SunriseRodItem());
	public static final RegistryObject<Item> SUNSET_ROD = REGISTRY.register("sunset_rod", () -> new SunsetRodItem());
	public static final RegistryObject<Item> NIGHT_ROD = REGISTRY.register("night_rod", () -> new NightRodItem());
	public static final RegistryObject<Item> NOON_ROD = REGISTRY.register("noon_rod", () -> new NoonRodItem());
	public static final RegistryObject<Item> MIDNIGHT_ROD = REGISTRY.register("midnight_rod", () -> new MidnightRodItem());
	public static final RegistryObject<Item> TEST_01FIREBLOCK = block(MagicModBlocks.TEST_01FIREBLOCK);
	public static final RegistryObject<Item> NANTOKA_ROD = REGISTRY.register("nantoka_rod", () -> new NantokaRodItem());
	public static final RegistryObject<Item> TEST_02 = block(MagicModBlocks.TEST_02);
	public static final RegistryObject<Item> TURTLE_ROD = REGISTRY.register("turtle_rod", () -> new TurtleRodItem());
	public static final RegistryObject<Item> HEALFLOWER = block(MagicModBlocks.HEALFLOWER);
	public static final RegistryObject<Item> QWERTYUIOP = REGISTRY.register("qwertyuiop", () -> new QwertyuiopItem());
	public static final RegistryObject<Item> WATERHAZARD = REGISTRY.register("waterhazard", () -> new WaterhazardItem());
	public static final RegistryObject<Item> WATERD_BUCKET = REGISTRY.register("waterd_bucket", () -> new WaterdItem());
	public static final RegistryObject<Item> BLANKSTAFF = REGISTRY.register("blankstaff", () -> new BlankstaffItem());
	public static final RegistryObject<Item> TURTLE_ROD = REGISTRY.register("turtle_rod", () -> new TurtleRodItem());
	public static final RegistryObject<Item> HASTE_STAFF = REGISTRY.register("haste_staff", () -> new HasteStaffItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
