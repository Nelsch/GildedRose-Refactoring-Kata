package com.gildedrose.helpers;

import com.gildedrose.Item;
import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackstagePasses;
import com.gildedrose.items.Conjured;
import com.gildedrose.items.Others;

/**
 * User: nelescherrens {@literal <nele.scherrens@unifiedpost.com>}
 */
public class ItemsUpdater {

    public static Item updateItem(Item item) {
        Item updatedItem;
        String itemName = item.name;

        if (GildedRoseConstants.AGED_BRIE.equals(itemName)) {
            updatedItem = AgedBrie.update(item);
        } else if (GildedRoseConstants.BACKSTAGE_PASSES.equals(itemName)) {
            updatedItem = BackstagePasses.update(item);
        } else if (GildedRoseConstants.SULFURAS.equals(itemName)) {
            updatedItem = item;
        } else if (GildedRoseConstants.CONJURED.equals(itemName)) {
            updatedItem = Conjured.update(item);
        } else {
            updatedItem = Others.update(item);
        }

        return updatedItem;
    }
}
