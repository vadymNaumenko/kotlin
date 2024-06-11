package oop.inheritance_nasledovanie

class Scout(
    name: String,
    speed: Int,
    val radarRange:Int,
    val afterburnerSpeed: Int,
    ): Spaceship(name,speed) {
        fun handleDateFromRadar(){
            println("$name handle  date from radar")
        }
    fun runAfterburner(){
        println("$name run Afterburner")
    }
}