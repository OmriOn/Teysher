package net.omrion.teysher.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class DaloushShovelToolInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
	}
}
