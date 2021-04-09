package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.helpers.GildedRoseConstants;

/**
 * User: nelescherrens {@literal <nele.scherrens@unifiedpost.com>}
 */
public class AgedBrie {

    public static Item update(Item itemToUpdate) {
        int quality = itemToUpdate.quality;
        int sellIn = itemToUpdate.sellIn;

        if (quality < GildedRoseConstants.MAX_QUALITY) {
            quality = quality + 1;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0 && quality < GildedRoseConstants.MAX_QUALITY) {
            quality = quality + 1;
        }

        return new Item(GildedRoseConstants.AGED_BRIE, sellIn, quality);
    }
}
