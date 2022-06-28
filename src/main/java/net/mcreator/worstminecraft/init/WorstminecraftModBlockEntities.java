
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worstminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.worstminecraft.block.entity.UraniumBlockEntity;
import net.mcreator.worstminecraft.WorstminecraftMod;

public class WorstminecraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			WorstminecraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> URANIUM = register("uranium", WorstminecraftModBlocks.URANIUM, UraniumBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
