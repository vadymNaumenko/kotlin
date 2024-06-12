package oop.interface_kotlin

class Shuttle : Movable, Shootable {
    override fun prepareForTakeoff() {
        println("Prepare For Takeoff")
    }

    override fun prepareForLanding() {
        println("Prepare For Landing")
    }

    override fun startShooting() {
        println("Start Shooting")
    }

    override fun reloadGuns() {
        println("Reload Guns")
    }
}