package oop.inheritance_nasledovanie

fun main() {
    val ship = Spaceship("ship", 500)
    val scout: Scout = Scout("scout", 750, 100,1000)
    val industrial: Industrial = Industrial("industrial", 750,8)

    println("Spaceship ===========")
    ship.runSystemDiagnostic()
    ship.switchToWarpMode()
    ship.getUnmanned()
    println("Scout ==============")
    scout.runSystemDiagnostic()
    scout.switchToWarpMode()
    scout.runAfterburner()
    scout.handleDateFromRadar()
    scout.getUnmanned()
    println("Industrial ==============")
    industrial.runSystemDiagnostic()
    industrial.switchToWarpMode()
    industrial.launchScanningDrones()
    industrial.getUnmanned()
    industrial.getAll()
}