
package net.mcreator.worstminecraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.worstminecraft.init.WorstminecraftModItems;

import java.util.List;

public abstract class AmongusarmourItem extends ArmorItem {
	public AmongusarmourItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 44;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{11, 11, 11, 11}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("worstminecraft:equip_armour_sussy"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(WorstminecraftModItems.AMOGUSINGOT.get()));
			}

			@Override
			public String getName() {
				return "amongusarmour";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AmongusarmourItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("Greatest armour"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "worstminecraft:textures/models/armor/sussyarmour_layer_1.png";
		}
	}

	public static class Chestplate extends AmongusarmourItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("Greatest armour"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "worstminecraft:textures/models/armor/sussyarmour_layer_1.png";
		}
	}

	public static class Leggings extends AmongusarmourItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("Greatest armour"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "worstminecraft:textures/models/armor/sussyarmour_layer_2.png";
		}
	}

	public static class Boots extends AmongusarmourItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("Greatest armour"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "worstminecraft:textures/models/armor/sussyarmour_layer_1.png";
		}
	}
}
