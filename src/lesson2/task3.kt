package lesson2

fun main() {
    val departureHour: Int = 9
    val departuerMinute: Int = 39
    val travelTime: Int = 457
    val departureTimeInMinutes: Int = departureHour * 60 + departuerMinute
    val arrivalTimeInMinutes: Int = departureTimeInMinutes + travelTime
    val arrivalHour: Int = (arrivalTimeInMinutes / 60) % 24
    val arrivalMinute: Int = (arrivalTimeInMinutes % 60)

    println("$arrivalHour:$arrivalMinute")
}