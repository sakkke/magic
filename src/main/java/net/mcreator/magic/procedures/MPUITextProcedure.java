package net.mcreator.magic.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.magic.network.MagicModVariables;

public class MPUITextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "UI: " + new java.text.DecimalFormat("#").format((entity.getCapability(MagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MagicModVariables.PlayerVariables())).PlayerMP);
	}
}
