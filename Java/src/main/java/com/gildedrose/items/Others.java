package com.gildedrose.items;

import com.gildedrose.Item;

/**
 * User: nelescherrens {@literal <nele.scherrens@unifiedpost.com>}
 */
public class Others {

    public static Item update(Item itemToUpdate) {
        int quality = itemToUpdate.quality;
        int sellIn = itemToUpdate.sellIn;

        if (quality > 0) {
            quality = quality - 1;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0 && quality > 0) {
            quality = quality - 1;
        }

        return new Item(itemToUpdate.name, sellIn, quality);
    }
}
