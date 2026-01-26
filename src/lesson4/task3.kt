package lesson4

fun main() {
    val weather: Boolean = true
    val tent: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${weather == SUNNY_WEATHER && tent == TENT_IS_OPEN && humidity == AIR_HUMIDITY && season != SEASON}")
}

const val SUNNY_WEATHER = true
const val TENT_IS_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"