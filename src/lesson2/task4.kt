package lesson2

fun main() {
    val crystal: Int = 7
    val iron: Int = 11
    val buffCrystal: Int = (crystal * 0.2).toInt()
    val buffIron: Int = (iron * 0.2).toInt()

    println("Бонусных кристаллов: $buffCrystal")
    println("Бонусного железа: $buffIron")
}