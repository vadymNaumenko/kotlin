fun main(){
    println("Enter your age _")
    val userAge = readln().toInt();

  val result: String = if (userAge >= AGE_OF_MAJORITY ) "Скритая реклама"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"

    println(result)

    // todo when

    when(userAge){
        10 -> println("Число 10")
        20 -> println("Число 20")
        42 -> println("Число 42")
        else -> println("Нет такого числа в базе")
    }

   val resultFromWhen = when(userAge){
        10 ->{

            "Число 10"
        }
        20 -> "Число 20"
        42 -> "Число 42"
        else -> "Нет такого числа в базе"
    }

    println(resultFromWhen)

}
const val AGE_OF_MAJORITY = 18;