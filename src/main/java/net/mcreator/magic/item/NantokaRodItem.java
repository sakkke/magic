
package net.mcreator.magic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NantokaRodItem extends Item {
	public NantokaRodItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
