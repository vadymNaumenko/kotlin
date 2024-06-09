package oop.class_kotlin

class Dish(
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,

    ) {

    fun addToFavorites(){
        println("Блюдо ${name}, добавлено в избрание")
        inFavorites = true;
    }
    fun removeFromFavorites(){
        println("Блюдо ${name}, удалено в избрание")
        inFavorites = true;
    }
    fun startCooking(){
        println("start cooking $name")
    }

    fun downloadIngredients():List<String>{
        return ingredients;
    }
}