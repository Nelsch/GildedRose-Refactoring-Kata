package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.helpers.GildedRoseConstants;

/**
 * User: nelescherrens {@literal <nele.scherrens@unifiedpost.com>}
 */
public class Conjured {

    public static Item update(Item itemToUpdate) {
        int quality = itemToUpdate.quality;
        int sellIn = itemToUpdate.sellIn;

        if (quality > 0) {
            quality = quality - 2;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0 && quality > 0) {
            quality = quality - 2;
        }

        return new Item(GildedRoseConstants.CONJURED, sellIn, quality);
    }
}
