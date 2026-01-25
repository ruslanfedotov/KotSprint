package lesson2

fun main() {
    val crystal: Int = 7
    val iron: Int = 11
    val buffCrystal: Int = (crystal * BUFF / 100)
    val buffIron: Int = (iron * BUFF / 100)

    println("Бонусных кристаллов: $buffCrystal")
    println("Бонусного железа: $buffIron")
}

const val BUFF = 20