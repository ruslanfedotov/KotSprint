package lesson3

fun main() {
    var moveFrom: String = "E2"
    var moveTo: String = "E4"
    var moveNumber = 1

    println("Ход черных: $moveFrom-$moveTo; $moveNumber")

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber = 2

    println("Ход белых: $moveFrom-$moveTo; $moveNumber")
}