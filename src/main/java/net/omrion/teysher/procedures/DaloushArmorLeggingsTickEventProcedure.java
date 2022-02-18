package net.omrion.teysher.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class DaloushArmorLeggingsTickEventProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
	}
}
