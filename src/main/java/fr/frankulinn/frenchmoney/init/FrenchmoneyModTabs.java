/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.frankulinn.frenchmoney.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fr.frankulinn.frenchmoney.FrenchmoneyMod;

public class FrenchmoneyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FrenchmoneyMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MONEY = REGISTRY.register("money",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.frenchmoney.money")).icon(() -> new ItemStack(FrenchmoneyModItems.FIVE_HUNDRED_EUROS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FrenchmoneyModItems.ONE_CENT_EURO.get());
				tabData.accept(FrenchmoneyModItems.TWO_CENTS_EURO.get());
				tabData.accept(FrenchmoneyModItems.FIVE_CENTS_EURO.get());
				tabData.accept(FrenchmoneyModItems.TEN_CENTS_EURO.get());
				tabData.accept(FrenchmoneyModItems.TWENTY_CENTS_EURO.get());
				tabData.accept(FrenchmoneyModItems.FIFTY_CENTS_EURO.get());
				tabData.accept(FrenchmoneyModItems.ONE_EURO.get());
				tabData.accept(FrenchmoneyModItems.TWO_EUROS.get());
				tabData.accept(FrenchmoneyModItems.FIVE_EUROS.get());
				tabData.accept(FrenchmoneyModItems.TEN_EUROS.get());
				tabData.accept(FrenchmoneyModItems.TWENTY_EUROS.get());
				tabData.accept(FrenchmoneyModItems.FIFTY_EUROS.get());
				tabData.accept(FrenchmoneyModItems.HUNDRED_EUROS.get());
				tabData.accept(FrenchmoneyModItems.TWO_HUNDRED_EUROS.get());
				tabData.accept(FrenchmoneyModItems.FIVE_HUNDRED_EUROS.get());
				tabData.accept(FrenchmoneyModItems.CREDIT_CARD.get());
				tabData.accept(FrenchmoneyModBlocks.ATM.get().asItem());
			}).withSearchBar().build());
}