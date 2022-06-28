
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worstminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.worstminecraft.world.features.plants.DeadplantFeature;
import net.mcreator.worstminecraft.world.features.ores.UraniumFeature;
import net.mcreator.worstminecraft.world.features.ores.RadioactivewasteFeature;
import net.mcreator.worstminecraft.world.features.ores.AmogusoreFeature;
import net.mcreator.worstminecraft.world.features.lakes.GfuelFeature;
import net.mcreator.worstminecraft.WorstminecraftMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class WorstminecraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WorstminecraftMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> AMOGUSORE = register("amogusore", AmogusoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AmogusoreFeature.GENERATE_BIOMES, AmogusoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GFUEL = register("gfuel", GfuelFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, GfuelFeature.GENERATE_BIOMES, GfuelFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RADIOACTIVEWASTE = register("radioactivewaste", RadioactivewasteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RadioactivewasteFeature.GENERATE_BIOMES,
					RadioactivewasteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> URANIUM = register("uranium", UraniumFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, UraniumFeature.GENERATE_BIOMES, UraniumFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEADPLANT = register("deadplant", DeadplantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, DeadplantFeature.GENERATE_BIOMES, DeadplantFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
