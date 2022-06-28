
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.worstminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.worstminecraft.item.UraniumpowderItem;
import net.mcreator.worstminecraft.item.NewdimItem;
import net.mcreator.worstminecraft.item.GfuelItem;
import net.mcreator.worstminecraft.item.AshItem;
import net.mcreator.worstminecraft.item.AmongusarmourItem;
import net.mcreator.worstminecraft.item.AmongusFragmentItem;
import net.mcreator.worstminecraft.item.AmogusingotItem;
import net.mcreator.worstminecraft.item.AmogpowderItem;
import net.mcreator.worstminecraft.WorstminecraftMod;

public class WorstminecraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WorstminecraftMod.MODID);
	public static final RegistryObject<Item> AMONGUS_FRAGMENT = REGISTRY.register("amongus_fragment", () -> new AmongusFragmentItem());
	public static final RegistryObject<Item> AMOGUSORE = block(WorstminecraftModBlocks.AMOGUSORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AMONGUSARMOUR_HELMET = REGISTRY.register("amongusarmour_helmet", () -> new AmongusarmourItem.Helmet());
	public static final RegistryObject<Item> AMONGUSARMOUR_CHESTPLATE = REGISTRY.register("amongusarmour_chestplate",
			() -> new AmongusarmourItem.Chestplate());
	public static final RegistryObject<Item> AMONGUSARMOUR_LEGGINGS = REGISTRY.register("amongusarmour_leggings",
			() -> new AmongusarmourItem.Leggings());
	public static final RegistryObject<Item> AMONGUSARMOUR_BOOTS = REGISTRY.register("amongusarmour_boots", () -> new AmongusarmourItem.Boots());
	public static final RegistryObject<Item> AMOGUSINGOT = REGISTRY.register("amogusingot", () -> new AmogusingotItem());
	public static final RegistryObject<Item> AMOGPOWDER = REGISTRY.register("amogpowder", () -> new AmogpowderItem());
	public static final RegistryObject<Item> GFUEL_BUCKET = REGISTRY.register("gfuel_bucket", () -> new GfuelItem());
	public static final RegistryObject<Item> NEWDIM = REGISTRY.register("newdim", () -> new NewdimItem());
	public static final RegistryObject<Item> RADIOACTIVEWASTE = block(WorstminecraftModBlocks.RADIOACTIVEWASTE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> URANIUM = block(WorstminecraftModBlocks.URANIUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> URANIUMPOWDER = REGISTRY.register("uraniumpowder", () -> new UraniumpowderItem());
	public static final RegistryObject<Item> ASH = REGISTRY.register("ash", () -> new AshItem());
	public static final RegistryObject<Item> DEADPLANT = block(WorstminecraftModBlocks.DEADPLANT, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SUSSYBAKA = REGISTRY.register("sussybaka_spawn_egg",
			() -> new ForgeSpawnEggItem(WorstminecraftModEntities.SUSSYBAKA, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
