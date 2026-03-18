/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.frankulinn.moneymod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import fr.frankulinn.moneymod.item.*;
import fr.frankulinn.moneymod.MoneymodMod;

public class MoneymodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MoneymodMod.MODID);
	public static final DeferredItem<Item> ONE_CENT_EURO;
	public static final DeferredItem<Item> TWO_CENTS_EURO;
	public static final DeferredItem<Item> FIVE_CENTS_EURO;
	public static final DeferredItem<Item> TEN_CENTS_EURO;
	public static final DeferredItem<Item> TWENTY_CENTS_EURO;
	public static final DeferredItem<Item> FIFTY_CENTS_EURO;
	public static final DeferredItem<Item> ONE_EURO;
	public static final DeferredItem<Item> TWO_EUROS;
	public static final DeferredItem<Item> FIVE_EUROS;
	public static final DeferredItem<Item> TEN_EUROS;
	public static final DeferredItem<Item> TWENTY_EUROS;
	public static final DeferredItem<Item> FIFTY_EUROS;
	public static final DeferredItem<Item> HUNDRED_EUROS;
	public static final DeferredItem<Item> TWO_HUNDRED_EUROS;
	public static final DeferredItem<Item> FIVE_HUNDRED_EUROS;
	public static final DeferredItem<Item> CREDIT_CARD;
	public static final DeferredItem<Item> ATM;
	static {
		ONE_CENT_EURO = REGISTRY.register("one_cent_euro", OneCentEuroItem::new);
		TWO_CENTS_EURO = REGISTRY.register("two_cents_euro", TwoCentsEuroItem::new);
		FIVE_CENTS_EURO = REGISTRY.register("five_cents_euro", FiveCentsEuroItem::new);
		TEN_CENTS_EURO = REGISTRY.register("ten_cents_euro", TenCentsEuroItem::new);
		TWENTY_CENTS_EURO = REGISTRY.register("twenty_cents_euro", TwentyCentsEuroItem::new);
		FIFTY_CENTS_EURO = REGISTRY.register("fifty_cents_euro", FiftyCentsEuroItem::new);
		ONE_EURO = REGISTRY.register("one_euro", OneEuroItem::new);
		TWO_EUROS = REGISTRY.register("two_euros", TwoEurosItem::new);
		FIVE_EUROS = REGISTRY.register("five_euros", FiveEurosItem::new);
		TEN_EUROS = REGISTRY.register("ten_euros", TenEurosItem::new);
		TWENTY_EUROS = REGISTRY.register("twenty_euros", TwentyEurosItem::new);
		FIFTY_EUROS = REGISTRY.register("fifty_euros", FiftyEurosItem::new);
		HUNDRED_EUROS = REGISTRY.register("hundred_euros", HundredEurosItem::new);
		TWO_HUNDRED_EUROS = REGISTRY.register("two_hundred_euros", TwoHundredEurosItem::new);
		FIVE_HUNDRED_EUROS = REGISTRY.register("five_hundred_euros", FiveHundredEurosItem::new);
		CREDIT_CARD = REGISTRY.register("credit_card", CreditCardItem::new);
		ATM = block(MoneymodModBlocks.ATM);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}