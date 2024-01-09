package net.mcreator.magic.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.magic.network.MagicModVariables;

public class MPChargeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(MagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MagicModVariables.PlayerVariables())).PlayerMP + 1;
			entity.getCapability(MagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PlayerMP = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
