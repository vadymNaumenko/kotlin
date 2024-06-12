package oop.incapsulation

private val supportInfo = "SupportInfo"

class HitchhikerGuide {
     var title = ""
    private var numberOfPage = 9999;

    public fun getNumberOfPage(){
        println(numberOfPage)
    }
    fun setNumberOfPage(numberOfPage:Int){
        this.numberOfPage = numberOfPage;
    }

   private fun chooseArticle(){
        println("Open catalog")
    }

}

class Support(){
    fun printInfo(){
        println(HitchhikerGuide::class.simpleName)
        println(HitchhikerGuide().title)
        println(supportInfo)
    }
}