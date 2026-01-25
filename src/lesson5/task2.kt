package lesson5

fun main() {
    println("Введите год рождения: ")

    val bornYear = readln().toInt()

    if (2026 - bornYear >= YEAR)
        println("Показать экран со скрытым контентом.")
    else
        println("Дополнительный контент недоступен.")
}

const val YEAR = 18