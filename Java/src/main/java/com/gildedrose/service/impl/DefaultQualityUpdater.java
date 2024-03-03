package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ItemQualityUpdater;

public class DefaultQualityUpdater implements ItemQualityUpdater {

	@Override
	public void updateQuality(Item item) {
		item.quality--;
		if (item.sellIn <= 0) {
			item.quality--;
		}

	}

}
