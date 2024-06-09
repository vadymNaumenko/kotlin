package oop.class_kotlin

//class Ingredient() {
//    var name = "name"
//    var weight = 999
//    var count = 888
//}

//class Ingredient(_name: String, _weight: Int, _count: Int) {
//    var name = _name
//    var weight = _weight
//    var count = _count
//}

//class Ingredient(var name: String, var weight: Int, var count: Int) {
//}

class Ingredient(var name: String, var weight: Int, var count: Int) {

    var isNeedToPrepare = false;

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {
        this.isNeedToPrepare = isNeedToPrepare;
    }

    init {
        println("ingredient $name is created")
    }

    // очередь выполнения
    // вторичный конструктор
    // первичний конструктор
    // блок init
    // тело вторичного конструктора

}