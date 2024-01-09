package net.mcreator.magic.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.magic.network.MagicModVariables;

public class RainRodRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double mp_cost = 0;
		mp_cost = 2;
		if ((entity.getCapability(MagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MagicModVariables.PlayerVariables())).PlayerMP > mp_cost) {
			for (int index0 = 0; index0 < (int) mp_cost; index0++) {
				MPUseProcedure.execute(entity);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "weather rain");
		}
	}
}
