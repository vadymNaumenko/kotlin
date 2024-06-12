package oop.abstract_kotlin

abstract class SpaceShuttle{
    abstract val tankSize: Int
    abstract fun runDiagnostic()
}
class Upsilon(override val tankSize: Int):SpaceShuttle() {
    override fun runDiagnostic() {
        TODO("Not yet implemented")
    }

}