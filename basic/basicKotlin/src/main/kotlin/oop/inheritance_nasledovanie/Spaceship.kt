package oop.inheritance_nasledovanie

open class Spaceship(
    val name:String,
    val speed:Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode(){
        println("$name Переход в варп-режим")
    }
    open fun runSystemDiagnostic(){
        println("$name run diagnostic")
    }
    fun getUnmanned(){
        if (unmanned) println("$name is unmanned")
        else  println("$name is not unmanned")
    }
}