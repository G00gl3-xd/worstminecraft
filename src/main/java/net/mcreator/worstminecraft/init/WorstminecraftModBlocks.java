
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worstminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.worstminecraft.block.UraniumBlock;
import net.mcreator.worstminecraft.block.RadioactivewasteBlock;
import net.mcreator.worstminecraft.block.NewdimPortalBlock;
import net.mcreator.worstminecraft.block.GfuelBlock;
import net.mcreator.worstminecraft.block.DeadplantBlock;
import net.mcreator.worstminecraft.block.AmogusoreBlock;
import net.mcreator.worstminecraft.WorstminecraftMod;

public class WorstminecraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WorstminecraftMod.MODID);
	public static final RegistryObject<Block> AMOGUSORE = REGISTRY.register("amogusore", () -> new AmogusoreBlock());
	public static final RegistryObject<Block> GFUEL = REGISTRY.register("gfuel", () -> new GfuelBlock());
	public static final RegistryObject<Block> NEWDIM_PORTAL = REGISTRY.register("newdim_portal", () -> new NewdimPortalBlock());
	public static final RegistryObject<Block> RADIOACTIVEWASTE = REGISTRY.register("radioactivewaste", () -> new RadioactivewasteBlock());
	public static final RegistryObject<Block> URANIUM = REGISTRY.register("uranium", () -> new UraniumBlock());
	public static final RegistryObject<Block> DEADPLANT = REGISTRY.register("deadplant", () -> new DeadplantBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DeadplantBlock.registerRenderLayer();
		}
	}
}
