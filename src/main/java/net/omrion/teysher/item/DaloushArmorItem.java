
package net.omrion.teysher.item;

import net.omrion.teysher.procedures.DaloushHoeToolInHandTickProcedure;
import net.omrion.teysher.procedures.DaloushArmorLeggingsTickEventProcedure;
import net.omrion.teysher.procedures.DaloushArmorBootsTickEventProcedure;
import net.omrion.teysher.procedures.DaloushArmorBodyTickEventProcedure;
import net.omrion.teysher.init.TeysherModItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class DaloushArmorItem extends ArmorItem {
	public DaloushArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 46;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{20, 50, 70, 20}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 55;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ladder.step"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TeysherModItems.DALOUSH));
			}

			@Override
			public String getName() {
				return "daloush_armor";
			}

			@Override
			public float getToughness() {
				return 3.7f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.7f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DaloushArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
			setRegistryName("daloush_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "teysher:textures/models/armor/daloush_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			DaloushHoeToolInHandTickProcedure.execute(entity);
		}
	}

	public static class Chestplate extends DaloushArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
			setRegistryName("daloush_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "teysher:textures/models/armor/daloush_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			DaloushArmorBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends DaloushArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
			setRegistryName("daloush_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "teysher:textures/models/armor/daloush_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			DaloushArmorLeggingsTickEventProcedure.execute(itemstack);
		}
	}

	public static class Boots extends DaloushArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
			setRegistryName("daloush_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "teysher:textures/models/armor/daloush_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			DaloushArmorBootsTickEventProcedure.execute(entity);
		}
	}
}
