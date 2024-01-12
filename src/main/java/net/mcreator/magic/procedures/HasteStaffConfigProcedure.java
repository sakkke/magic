package net.mcreator.magic.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.magic.network.MagicModVariables;

public class HasteStaffConfigProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(MagicModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MagicModVariables.PlayerVariables())).PlayerMP < 1) {
			MPUseProcedure.execute(entity);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 3));
		}
	}
}
