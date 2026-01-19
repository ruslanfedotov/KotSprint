package lesson4

fun main() {
    val tablesToday: Int = 13
    val tablesTomorrow: Int = 9

    println("Доступность столиков на сегодня: ${tablesToday < NUMBER_OF_TABLES}")
    println("Доступность столиков на завтра: ${tablesTomorrow < NUMBER_OF_TABLES}")

}

const val NUMBER_OF_TABLES = 13