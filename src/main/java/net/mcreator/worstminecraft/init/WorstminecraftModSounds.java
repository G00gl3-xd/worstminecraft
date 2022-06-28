
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worstminecraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorstminecraftModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("worstminecraft", "equip_armour_sussy"),
				new SoundEvent(new ResourceLocation("worstminecraft", "equip_armour_sussy")));
		REGISTRY.put(new ResourceLocation("worstminecraft", "ore_break"), new SoundEvent(new ResourceLocation("worstminecraft", "ore_break")));
		REGISTRY.put(new ResourceLocation("worstminecraft", "g_fuelopen"), new SoundEvent(new ResourceLocation("worstminecraft", "g_fuelopen")));
		REGISTRY.put(new ResourceLocation("worstminecraft", "amog_walk"), new SoundEvent(new ResourceLocation("worstminecraft", "amog_walk")));
		REGISTRY.put(new ResourceLocation("worstminecraft", "living"), new SoundEvent(new ResourceLocation("worstminecraft", "living")));
		REGISTRY.put(new ResourceLocation("worstminecraft", "death_amog"), new SoundEvent(new ResourceLocation("worstminecraft", "death_amog")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
