package oop.enum_kotlin

fun main() {

    val statusFromServer = listOf(101,102,103,0)

    for (i in statusFromServer){
        when(i){
            101-> setStatus2(i)
            102-> setStatus2(i)
            103-> setStatus2(i)
            0-> setStatus2(i)
        }
        Thread.sleep(1000)
    }

    //methods

    println(Status.COMPLETED.name)
    println(Status.COMPLETED.id)
    println(Status.COMPLETED.ordinal)
    Status.values().iterator().forEach { println(it) }
    println("------------------------")
    Status.values().iterator().forEach { println(it.getStatusDescription()) }
}

enum class Status(val id:Int){
    NEW(101) {
        override fun getStatusDescription(): String {
            return "Заказ создан"
        }
    },COOKING(102) {
        override fun getStatusDescription(): String {
            return "Заказ оплачен"
        }
    },COMPLETED(103) {
        override fun getStatusDescription(): String {
            return "Заказ готов"
        }
    }, ERROR(0) {
        override fun getStatusDescription(): String {
            return "Что-то пошло не так"
        }
    };

    abstract fun getStatusDescription() : String
}

fun setStatus(status: Status){
    when(status){
        Status.NEW -> println("Status New")
        Status.COOKING -> println("Status Cooking")
        Status.COMPLETED -> println("Status Completed")
        Status.ERROR -> println("Status Completed")
    }
}

fun setStatus2(status: Int){
    when(status){
        Status.NEW.id -> println("Status New")
        Status.COOKING.id -> println("Status Cooking")
        Status.COMPLETED.id -> println("Status Completed")
        Status.ERROR.id -> println("Status Completed")
    }
}