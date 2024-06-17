package oop.data_class

fun main() {
    val word = Word("Red","Красный")
    val word2 = Word("Red","Красный")
    val word3 = Word("White","Белый")

    println(word)
    println(word === word2)
    println(word === word3)
    println(word == word2)
    println(word.hashCode())
    println(word.equals(word3))
}

data class Word(
    val text: String,
    val translate: String,
)