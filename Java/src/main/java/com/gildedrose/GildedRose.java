package com.gildedrose;

import com.gildedrose.helpers.ItemsUpdater;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item currentItem = items[i];
            Item updatedItem;

            updatedItem = ItemsUpdater.updateItem(currentItem);

            items[i] = updatedItem;
        }
    }
}