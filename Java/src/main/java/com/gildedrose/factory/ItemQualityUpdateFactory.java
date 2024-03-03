package com.gildedrose.factory;

import com.gildedrose.service.ItemQualityUpdater;
import com.gildedrose.service.impl.AgedBrieQualityUpdater;
import com.gildedrose.service.impl.BackStagePassQualityUpdater;
import com.gildedrose.service.impl.ConjuredQualityUpdater;
import com.gildedrose.service.impl.DefaultQualityUpdater;
import com.gildedrose.service.impl.SulfurasQualityUpdater;

public class ItemQualityUpdateFactory {

	public static ItemQualityUpdater getQualityUpdater(String itemName) {
		switch (itemName) {

		case "Sulfuras, Hand of Ragnaros":
			return new SulfurasQualityUpdater();

		case "Aged Brie":
			return new AgedBrieQualityUpdater();

		case "Backstage passes to a TAFKAL80ETC concert":
			return new BackStagePassQualityUpdater();

		case "Conjured Mana Cake":
			return new ConjuredQualityUpdater();

		
		default:
			return new DefaultQualityUpdater();
		}
	}

}
