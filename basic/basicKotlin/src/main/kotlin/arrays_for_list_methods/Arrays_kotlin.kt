package arrays_for_list_methods

fun main(){
    val ingredient1 ="яйцо"
    val ingredient2 ="помидор"
    val ingredient3 ="зелень"
    val ingredient4 ="соль"
    val ingredient5 ="перец"

    val arrayOfIngredient: Array<String> = arrayOf(ingredient1,ingredient2,ingredient3,ingredient4,ingredient5);

    val intArray: IntArray = intArrayOf(4,4,2);
    val charArray: CharArray = charArrayOf('2','4','7');

//    val intArrayEmpty: IntArray = intArrayOf();
//    val intArrayEmpty: IntArray = arrayOf();

    var intArray3 = intArrayOf(1,2,3,4,5);
    intArray3 = intArrayOf(1,2,3,4,5);

    println("Розмер массива с ингредиентами ${arrayOfIngredient.size}")

    println(arrayOfIngredient.indexOf("помидор"));
    println(arrayOfIngredient[0])
    println(arrayOfIngredient[2])

    arrayOfIngredient[4] = "паприка"
    println(arrayOfIngredient[4])

//    arrayOfIngredient.set(1,"s")
//    arrayOfIngredient.get(1)

        for (str in arrayOfIngredient){
            println("Ингредиуте ${arrayOfIngredient.indexOf(str) +1 } $str")
        }
}