
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.omrion.teysher.init;

import net.omrion.teysher.item.DaloushSwordItem;
import net.omrion.teysher.item.DaloushShovelItem;
import net.omrion.teysher.item.DaloushPickaxeItem;
import net.omrion.teysher.item.DaloushItem;
import net.omrion.teysher.item.DaloushHoeItem;
import net.omrion.teysher.item.DaloushAxeItem;
import net.omrion.teysher.item.DaloushArmorItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TeysherModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item DALOUSH = register(new DaloushItem());
	public static final Item DALOUSH_ORE = register(TeysherModBlocks.DALOUSH_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DALOUSH_BLOCK = register(TeysherModBlocks.DALOUSH_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item DALOUSH_PICKAXE = register(new DaloushPickaxeItem());
	public static final Item DALOUSH_AXE = register(new DaloushAxeItem());
	public static final Item DALOUSH_SWORD = register(new DaloushSwordItem());
	public static final Item DALOUSH_SHOVEL = register(new DaloushShovelItem());
	public static final Item DALOUSH_HOE = register(new DaloushHoeItem());
	public static final Item DALOUSH_ARMOR_HELMET = register(new DaloushArmorItem.Helmet());
	public static final Item DALOUSH_ARMOR_CHESTPLATE = register(new DaloushArmorItem.Chestplate());
	public static final Item DALOUSH_ARMOR_LEGGINGS = register(new DaloushArmorItem.Leggings());
	public static final Item DALOUSH_ARMOR_BOOTS = register(new DaloushArmorItem.Boots());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
