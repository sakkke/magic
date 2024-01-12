
package net.mcreator.magic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.magic.init.MagicModFluids;

public class WaterdItem extends BucketItem {
	public WaterdItem() {
		super(MagicModFluids.WATERD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
