package arrays_for_list_methods

fun main(){
    // List
    // Set
    // Map

    val list : List<Int> = listOf(4,4,2)
    val list2 : MutableList<Int> = mutableListOf(1,2,3)

    val mutableList = mutableListOf(11,15,20,12,9,14)

    mutableList.add(42);
    println(mutableList)

    mutableList.add(0,42)
    println(mutableList)

    println( mutableList.contains(42))
    println( mutableList.isEmpty())
    println( mutableList.isNotEmpty())
    println( mutableList.indexOf(42))
    println( mutableList.lastIndexOf(42))

    mutableList.sort();
    println(mutableList)
    mutableList.sortDescending();
    println(mutableList)
    mutableList.reverse()
    println(mutableList)

    mutableList.forEach{number ->
        println(number)
    }


    val  result =  mutableList.filter {
        it == 42
    }
    println(result)

    val result2 = mutableList.map { it * 2 }

    result2.forEach{println(it)}


}