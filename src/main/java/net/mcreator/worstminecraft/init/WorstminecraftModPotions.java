
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worstminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.worstminecraft.WorstminecraftMod;

public class WorstminecraftModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, WorstminecraftMod.MODID);
	public static final RegistryObject<Potion> SUSPOTION = REGISTRY.register("suspotion",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 3, false, true),
					new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 3, false, true), new MobEffectInstance(MobEffects.HEAL, 3600, 3, false, true),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 3, false, true),
					new MobEffectInstance(MobEffects.ABSORPTION, 3600, 3, false, true),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 4, false, true),
					new MobEffectInstance(MobEffects.UNLUCK, 3600, 6, false, true)));
}
