
package net.mcreator.magic.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.magic.init.MagicModItems;
import net.mcreator.magic.init.MagicModFluids;
import net.mcreator.magic.init.MagicModFluidTypes;
import net.mcreator.magic.init.MagicModBlocks;

public abstract class WaterdFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MagicModFluidTypes.WATERD_TYPE.get(), () -> MagicModFluids.WATERD.get(), () -> MagicModFluids.FLOWING_WATERD.get()).explosionResistance(100f)
			.bucket(() -> MagicModItems.WATERD_BUCKET.get()).block(() -> (LiquidBlock) MagicModBlocks.WATERD.get());

	private WaterdFluid() {
		super(PROPERTIES);
	}

	public static class Source extends WaterdFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends WaterdFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
