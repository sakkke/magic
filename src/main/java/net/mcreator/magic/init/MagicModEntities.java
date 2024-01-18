
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.magic.entity.RedGhastEntity;
import net.mcreator.magic.entity.HoukiEntity;
import net.mcreator.magic.entity.GreenGhastEntity;
import net.mcreator.magic.entity.BlueGhastEntity;
import net.mcreator.magic.entity.PortalEntity;
import net.mcreator.magic.MagicMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MagicMod.MODID);
	public static final RegistryObject<EntityType<RedGhastEntity>> RED_GHAST = register("red_ghast",
			EntityType.Builder.<RedGhastEntity>of(RedGhastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RedGhastEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<BlueGhastEntity>> BLUE_GHAST = register("blue_ghast",
			EntityType.Builder.<BlueGhastEntity>of(BlueGhastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueGhastEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<GreenGhastEntity>> GREEN_GHAST = register("green_ghast",
			EntityType.Builder.<GreenGhastEntity>of(GreenGhastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreenGhastEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HoukiEntity>> HOUKI = register("houki",
			EntityType.Builder.<HoukiEntity>of(HoukiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HoukiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PortalEntity>> PORTAL = register("portal",
			EntityType.Builder.<PortalEntity>of(PortalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PortalEntity::new)

					.sized(0.9f, 0.1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RedGhastEntity.init();
			BlueGhastEntity.init();
			GreenGhastEntity.init();
			HoukiEntity.init();
			PortalEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RED_GHAST.get(), RedGhastEntity.createAttributes().build());
		event.put(BLUE_GHAST.get(), BlueGhastEntity.createAttributes().build());
		event.put(GREEN_GHAST.get(), GreenGhastEntity.createAttributes().build());
		event.put(HOUKI.get(), HoukiEntity.createAttributes().build());
		event.put(PORTAL.get(), PortalEntity.createAttributes().build());
	}
}
