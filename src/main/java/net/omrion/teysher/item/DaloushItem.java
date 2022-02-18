
package net.omrion.teysher.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class DaloushItem extends Item {
	public DaloushItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("daloush");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
