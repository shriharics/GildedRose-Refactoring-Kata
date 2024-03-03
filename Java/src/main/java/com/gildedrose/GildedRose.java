package com.gildedrose;

import com.gildedrose.factory.ItemQualityUpdateFactory;
import com.gildedrose.service.ItemQualityUpdater;

public class GildedRose {
  
	Item[] items;

    public GildedRose(Item[] items) {
    	
        this.items = items;
    }
    
    
	public void updateQuality() {

		//Loop each item 
		for (Item item : items) {

			//Fetch the quality update impl based on item
			ItemQualityUpdater qualityUpdater = ItemQualityUpdateFactory.getQualityUpdater(item.name);

			//Call Quality update method
			qualityUpdater.updateQuality(item);
			
			// Check if the qulity > 50 then set back to 50
			if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
				if (item.quality > 50) {
					item.quality = 50;
				} else {
					if (item.quality < 0) {
						item.quality = 0;
					}
				}

			}
		}

	}


    /*public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }*/
}
