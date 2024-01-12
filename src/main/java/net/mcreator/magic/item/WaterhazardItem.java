
package net.mcreator.magic.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.magic.procedures.WaterhazardYoukuritukusitatokiProcedure;

public class WaterhazardItem extends ShearsItem {
	public WaterhazardItem() {
		super(new Item.Properties().durability(100));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 4f;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		WaterhazardYoukuritukusitatokiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
		return ar;
	}
}
