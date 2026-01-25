package lesson5

fun main() {
    println("Докажите, что Вы не бот. Решите пример: 1 + 5 = ")
    val sum = readln().toInt()

    if (sum == 6)
        println("Все верно. Вы авторизованы!")
    else
        println("Неверно. Попробуйте еще раз.")
}