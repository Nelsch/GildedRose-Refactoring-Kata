package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.helpers.GildedRoseConstants;

/**
 * User: nelescherrens {@literal <nele.scherrens@unifiedpost.com>}
 */
public class BackstagePasses {

    public static Item update(Item itemToUpdate) {
        int quality = itemToUpdate.quality;
        int sellIn = itemToUpdate.sellIn;

        if (quality < GildedRoseConstants.MAX_QUALITY) {
            quality = quality + 1;
        }

        if (sellIn < 11 && quality < GildedRoseConstants.MAX_QUALITY) {
            quality = quality + 1;
        }

        if (sellIn < 6 && quality < GildedRoseConstants.MAX_QUALITY) {
            quality = quality + 1;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            quality = quality - quality;
        }

        return new Item(GildedRoseConstants.BACKSTAGE_PASSES, sellIn, quality);
    }
}
