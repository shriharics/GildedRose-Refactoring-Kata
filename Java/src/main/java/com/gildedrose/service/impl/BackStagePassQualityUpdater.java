package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ItemQualityUpdater;

public class BackStagePassQualityUpdater implements ItemQualityUpdater {

	@Override
	public void updateQuality(Item item) {
		if (item.sellIn <= 0) {
			item.quality = 0;
		} else if (item.sellIn <= 5) {
			item.quality = item.quality + 3;
		} else if (item.sellIn <= 10) {
			item.quality = item.quality + 2;
		} else {
			item.quality++;
		}

	}

}
