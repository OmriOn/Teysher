
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.omrion.teysher.init;

import net.omrion.teysher.block.DaloushOreBlock;
import net.omrion.teysher.block.DaloushBlockBlock;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TeysherModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block DALOUSH_ORE = register(new DaloushOreBlock());
	public static final Block DALOUSH_BLOCK = register(new DaloushBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
