/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.frankulinn.moneymod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import fr.frankulinn.moneymod.block.ATMBlock;
import fr.frankulinn.moneymod.MoneymodMod;

public class MoneymodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MoneymodMod.MODID);
	public static final DeferredBlock<Block> ATM;
	static {
		ATM = REGISTRY.register("atm", ATMBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}