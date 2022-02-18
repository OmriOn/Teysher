
package net.omrion.teysher.item;

import net.omrion.teysher.procedures.DaloushShovelToolInHandTickProcedure;
import net.omrion.teysher.init.TeysherModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.Entity;

public class DaloushShovelItem extends ShovelItem {
	public DaloushShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 55;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TeysherModItems.DALOUSH));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
		setRegistryName("daloush_shovel");
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			DaloushShovelToolInHandTickProcedure.execute(itemstack);
	}
}
