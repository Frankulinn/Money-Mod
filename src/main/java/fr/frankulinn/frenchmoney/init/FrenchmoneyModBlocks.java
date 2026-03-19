/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.frankulinn.frenchmoney.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import fr.frankulinn.frenchmoney.block.ATMBlock;
import fr.frankulinn.frenchmoney.FrenchmoneyMod;

public class FrenchmoneyModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FrenchmoneyMod.MODID);
	public static final DeferredBlock<Block> ATM;
	static {
		ATM = REGISTRY.register("atm", ATMBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}