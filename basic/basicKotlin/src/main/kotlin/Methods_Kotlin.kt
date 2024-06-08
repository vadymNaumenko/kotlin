fun main() {

    val name = getName();
    val age = getAge();

    println(name)
    println(age)

    printNameAndAge(name = name, age = age);

}

fun getName(): String = readlnOrNull().toString();

fun getAge(): Int? {
    println("Enter your age")
    return readlnOrNull()?.toInt();
}

fun printNameAndAge(name: String?, age: Int?) {
    println("Данные пользователя: $name, $age")
}