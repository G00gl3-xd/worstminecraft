
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worstminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.worstminecraft.fluid.GfuelFluid;
import net.mcreator.worstminecraft.WorstminecraftMod;

public class WorstminecraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, WorstminecraftMod.MODID);
	public static final RegistryObject<Fluid> GFUEL = REGISTRY.register("gfuel", () -> new GfuelFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_GFUEL = REGISTRY.register("flowing_gfuel", () -> new GfuelFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(GFUEL.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GFUEL.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
