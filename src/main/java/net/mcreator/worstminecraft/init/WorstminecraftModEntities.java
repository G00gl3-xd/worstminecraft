
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worstminecraft.init;

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

import net.mcreator.worstminecraft.entity.SussybakaEntity;
import net.mcreator.worstminecraft.WorstminecraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorstminecraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, WorstminecraftMod.MODID);
	public static final RegistryObject<EntityType<SussybakaEntity>> SUSSYBAKA = register("sussybaka",
			EntityType.Builder.<SussybakaEntity>of(SussybakaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SussybakaEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SussybakaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SUSSYBAKA.get(), SussybakaEntity.createAttributes().build());
	}
}
