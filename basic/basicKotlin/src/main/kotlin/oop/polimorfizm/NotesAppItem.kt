package oop.polimorfizm

import java.util.Date

open class NotesAppItem {
    open fun getItemData() = "";

}

class MassageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: String,
) : NotesAppItem() {
    override fun getItemData(): String {
        return "Item \n$title added to cell - $creationDate\nType: $type\n Data: $data"
    }
}

class PhoneItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long,
) : NotesAppItem() {
    override fun getItemData(): String {
        return "Item \n$title added to cell - $creationDate\nType: $type\n Data: $data"
    }
}

class ListItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: List<String>,
) : NotesAppItem() {
    override fun getItemData(): String {
        return "Item \n$title added to cell - $creationDate\nType: $type\n Data: $data"
    }
}