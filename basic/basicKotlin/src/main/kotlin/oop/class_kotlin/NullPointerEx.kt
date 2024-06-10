package oop.class_kotlin

fun main() {
    // NullPointerException (NPE)
    // null

    val nullableString: String? = null;

//    if (nullableString != null) println(nullableString.length)
//    else println("null")

    // if null set 999
//    val stringLength: Int = nullableString?.length ?: 999;
//    println(stringLength)

    // not null 100%
    val stringLength: Int = nullableString!!.length
}