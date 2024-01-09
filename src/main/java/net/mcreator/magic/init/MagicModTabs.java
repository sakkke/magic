
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magic.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.magic.MagicMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MagicModItems.RAIN_ROD.get());
			tabData.accept(MagicModItems.INFINITY_ROD.get());
			tabData.accept(MagicModItems.SUN_ROD.get());
			tabData.accept(MagicModItems.THUNDER_ROD.get());
			tabData.accept(MagicModItems.DAY_ROD.get());
			tabData.accept(MagicModItems.SUNRISE_ROD.get());
			tabData.accept(MagicModItems.SUNSET_ROD.get());
			tabData.accept(MagicModItems.NIGHT_ROD.get());
			tabData.accept(MagicModItems.NOON_ROD.get());
			tabData.accept(MagicModItems.MIDNIGHT_ROD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MagicModBlocks.POISON_PUMPKIN.get().asItem());
			tabData.accept(MagicModBlocks.HEALFLOWER.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MagicModItems.BLANKSTAFF.get());
			tabData.accept(MagicModItems.QWERTYUIOP.get());
		}
	}
}
