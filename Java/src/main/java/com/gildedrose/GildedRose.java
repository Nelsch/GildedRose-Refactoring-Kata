package com.gildedrose;

class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(AGED_BRIE) && !items[i].name.equals(BACKSTAGE_PASSES)) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals(SULFURAS)) {
                        decreaseQuality(i);
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    increaseQuality(i);
                    increaseQualityForBackstagePasses(i);
                }
            }

            decreaseSellIn(i);

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals(AGED_BRIE)) {
                    if (!items[i].name.equals(BACKSTAGE_PASSES)) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals(SULFURAS)) {
                                decreaseQuality(i);
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    increaseQualityIfNeeded(i);
                }
            }
        }
    }

    // helper methods

    private void increaseQualityForBackstagePasses(int indexOfItem) {
        if (items[indexOfItem].name.equals(BACKSTAGE_PASSES)) {
            if (items[indexOfItem].sellIn < 11) {
                increaseQualityIfNeeded(indexOfItem);
            }

            if (items[indexOfItem].sellIn < 6) {
                increaseQualityIfNeeded(indexOfItem);
            }
        }
    }

    private void increaseQualityIfNeeded(int indexOfItem) {
        if (items[indexOfItem].quality < 50) {
            increaseQuality(indexOfItem);
        }
    }

    private void increaseQuality(int index) {
        items[index].quality = items[index].quality + 1;
    }

    private void decreaseQuality(int index) {
        items[index].quality = items[index].quality - 1;
    }

    private void decreaseSellIn(int index) {
        if (!items[index].name.equals(SULFURAS)) {
            items[index].sellIn = items[index].sellIn - 1;
        }
    }
}