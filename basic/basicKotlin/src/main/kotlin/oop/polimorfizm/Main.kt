package oop.polimorfizm

import java.util.*
import kotlin.collections.List

fun main() {

    val creationDate = Date()
    val note = NotesAppItem()

    val messageItem: NotesAppItem = MassageItem(
        "Call sester",
        creationDate,
        "massage",
        "MessageItem",
    );

    val phoneItem: NotesAppItem = PhoneItem(
        "Call sester",
        creationDate,
        "massage",
        9087192002,
    );
    val listItem: NotesAppItem = ListItem(
        "Call sester",
        creationDate,
        "massage",
        listOf("list1", "list2"),
    );

//    println(messageItem.getItemData())
//    println(phoneItem.getItemData())
//    println(listItem.getItemData())
    showAllNotes(listOf(phoneItem,messageItem,listItem))
}

fun showAllNotes(notes: List<NotesAppItem>) {
    notes.forEach{note:NotesAppItem-> println( note.getItemData())
    }
}