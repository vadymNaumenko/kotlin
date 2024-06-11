package oop.inheritance_nasledovanie

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
): Spaceship(name,400, unmanned = true) {
    fun getAll(){
        println("$name get all")
    }
    fun launchScanningDrones(){
        println("$name launch scanning drones")
    }
    override fun runSystemDiagnostic(){
        super.runSystemDiagnostic()
        println("$name run diagnostic drones")

    }

}