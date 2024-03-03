package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ItemQualityUpdater;

public class ConjuredQualityUpdater implements ItemQualityUpdater {

	@Override
	public void updateQuality(Item item) {
		item.quality = item.quality - 2;
		if (item.sellIn <= 0) {
			item.quality = item.quality - 2;
		}

	}

}
