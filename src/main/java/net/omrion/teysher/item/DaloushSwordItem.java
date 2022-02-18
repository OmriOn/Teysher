
package net.omrion.teysher.item;

import net.omrion.teysher.procedures.DaloushSwordToolInHandTickProcedure;
import net.omrion.teysher.init.TeysherModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.Entity;

public class DaloushSwordItem extends SwordItem {
	public DaloushSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 55;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TeysherModItems.DALOUSH));
			}
		}, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		setRegistryName("daloush_sword");
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			DaloushSwordToolInHandTickProcedure.execute(itemstack);
	}
}
