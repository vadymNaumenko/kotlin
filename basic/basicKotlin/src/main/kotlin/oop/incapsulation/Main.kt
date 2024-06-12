package oop.incapsulation

fun main(){

    //public - по умолчанию
    //private
    //protected
    //internal

    val guid = HitchhikerGuide()

    guid.title = "Dont panic"
//    guid.chooseArticle();

    Support().printInfo()
    guid.getNumberOfPage()
    guid.setNumberOfPage(100)
    guid.getNumberOfPage()
}