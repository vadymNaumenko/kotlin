fun main(){

    // диапазогн (интервалы)

    val range1:IntRange = 42..442;
    val range2:IntRange = 42 until 442;
    val range3:LongRange = 42L..442L;
    val range4:CharRange = 'a'..'z';
    val range5:ClosedRange<Double> = 42.1..442.2;
    val range6:ClosedRange<Float> = 42.4f..442f;
    val range7: IntProgression = 42 .. 432 step 2;
    val range8: IntProgression = 424 downTo  43 step 2;

    val a = 52 in range1;
    val b = 52 !in range1;
    println(a)
    println(b)

    for (i in 5 downTo 1){
        println("Реклама закончится через $i")
    }
    for (i in 5 downTo 1){
        if (i == 3){
            println("Пользователь нажал на кнопку \"пропостить\" ")
            break
        }
        println("Реклама закончится через $i")
    }
    for (i in 5 downTo 1){
        if (i == 3){
            println("i == 3 не будет розпечатано сроботал continue")
            continue
        }
        println("Реклама закончится через $i")
    }

    for (i in range2 step 30){
        println("Реклама $i")
    }
}