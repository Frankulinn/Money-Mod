/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.frankulinn.moneymod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fr.frankulinn.moneymod.MoneymodMod;

public class MoneymodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoneymodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MONEY = REGISTRY.register("money",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.moneymod.money")).icon(() -> new ItemStack(MoneymodModItems.FIVE_HUNDRED_EUROS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MoneymodModItems.ONE_CENT_EURO.get());
				tabData.accept(MoneymodModItems.TWO_CENTS_EURO.get());
				tabData.accept(MoneymodModItems.FIVE_CENTS_EURO.get());
				tabData.accept(MoneymodModItems.TEN_CENTS_EURO.get());
				tabData.accept(MoneymodModItems.TWENTY_CENTS_EURO.get());
				tabData.accept(MoneymodModItems.FIFTY_CENTS_EURO.get());
				tabData.accept(MoneymodModItems.ONE_EURO.get());
				tabData.accept(MoneymodModItems.TWO_EUROS.get());
				tabData.accept(MoneymodModItems.FIVE_EUROS.get());
				tabData.accept(MoneymodModItems.TEN_EUROS.get());
				tabData.accept(MoneymodModItems.TWENTY_EUROS.get());
				tabData.accept(MoneymodModItems.FIFTY_EUROS.get());
				tabData.accept(MoneymodModItems.HUNDRED_EUROS.get());
				tabData.accept(MoneymodModItems.TWO_HUNDRED_EUROS.get());
				tabData.accept(MoneymodModItems.FIVE_HUNDRED_EUROS.get());
				tabData.accept(MoneymodModItems.CREDIT_CARD.get());
				tabData.accept(MoneymodModBlocks.ATM.get().asItem());
			}).withSearchBar().build());
}