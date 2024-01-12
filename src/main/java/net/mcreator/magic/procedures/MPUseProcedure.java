package net.mcreator.magic.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.magic.network.MagicModVariables;

public class MPUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double mp = 0;
		mp = (entity.getCapability(MagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MagicModVariables.PlayerVariables())).PlayerMP;
		if (mp > 0) {
			{
				double _setval = mp - 1;
				entity.getCapability(MagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerMP = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
