package lambda_kotlin

import java.util.Calendar

fun main() {

    val calendar: Calendar = Calendar.getInstance()

    val getDayToEndYer: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

//    println(getDayToEndYer.invoke())
    println(getDayToEndYer())

    val convertEndDaysToMillis: (Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)

    convertEndDaysToMillis(getDayToEndYer.invoke())

    val printStringWithLambda: (Int) -> Unit
    printStringWithLambda = { answer: Int ->
        println("print string with lambda $answer")
    }
    printStringWithLambda(42);

    val printStringWithLambda2: (Int) -> String
    printStringWithLambda2 = { answer: Int ->
         "print string with lambda $answer"
    }
  val resultFromLambda =  printStringWithLambda2(42);
    println("result from lambda $resultFromLambda");

    { it: Int -> println("Print string with lambda 3 $it") }(442)

   val resultFromLambda3 = { it: Int -> "Print string with lambda 3 $it" }(442)
    println("result from lambda 3 $resultFromLambda3");

}