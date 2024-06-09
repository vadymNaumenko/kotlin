package oop.class_kotlin

fun main(){
   val dish = Dish(
       id = 1,
       name = "Яичница",
       category = "Завтрак",
       ingredients = listOf("яйцо","помидор","соль","перец"),
   )

    val dish2 = Dish(
        id = 2,
        name = "Суп лапша",
        category = "Обед",
        ingredients = listOf("вода","курица","соль","перец"),
    )

    println(dish.name)
    println(dish.ingredients)

    dish.category = "Блюдо из яйца"

    dish.addToFavorites()
    dish.startCooking()
    dish.removeFromFavorites()

    val ingredient = Ingredient("картошка",100,400);
    val ingredient2 = Ingredient("картошка",100,400,true);


}