package net.omrion.teysher.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class DaloushSwordToolInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.KNOCKBACK, 2);
	}
}
