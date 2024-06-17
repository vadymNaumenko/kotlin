package extensions_method_fild

import java.io.File

val File.nameWithoutExtension: String
    get() = name.substringBeforeLast(",")

fun main() {
    val file = File("textFile.txt")
    file.writeToFileAndSend()
    file.writeText("bla bla bla")
    println(file.nameWithoutExtension)
}

fun File.writeToFileAndSend(){
    val message = "som message for file"
    createNewFile()
    writeText(message)
    println("Message: \"$message added to file $name and send")
}