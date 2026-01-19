package lesson3

fun main() {
    val firstName: String = "Татьяна"
    var lastName: String = "Андреева"
    val surname: String = "Сергеевна"
    var age: Int = 20

    println("$firstName $surname $lastName; $age")

    lastName = "Сидорова"
    age = 22

    println("$firstName $surname $lastName; $age")
}