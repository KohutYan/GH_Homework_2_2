package com.kohutyan.gh_homework.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

/*
    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }
 */

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }
    /*
       private fun createDummyItem(position: Int): DummyItem {
           return DummyItem(position.toString(), "Item " +
                              position, makeDetails(position))
       }

       private fun makeDetails(position: Int): String {
           val builder = StringBuilder()
           builder.append("Details about Item: ").append(position)
           for (i in 0..position - 1) {
               builder.append("\nMore details information here.")
           }
           return builder.toString()
       }
   */

    init {
        // Add 3 sample items.
        addItem(DummyItem("1", "Pikabu",
            "https://pikabu.ru"))
        addItem(DummyItem("2", "Discogs",
            "https://www.discogs.com"))
        addItem(DummyItem("3", "SameSound",
            "https://samesound.ru"))
        addItem(DummyItem("4", "Obozrevatel",
            "https://www.obozrevatel.com"))
        addItem(DummyItem("5", "habr",
            "https://habr.com/ru/"))
    }
    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val website_name: String,
                         val website_url: String) {
        override fun toString(): String = website_name
    }
}
