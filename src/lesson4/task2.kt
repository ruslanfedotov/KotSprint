package lesson4

fun main() {
    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': ${20 > MIN_WEIGHT && 20 <= MAX_WEIGHT && 80 < MAX_CAPACITY}")
    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': ${50 > MIN_WEIGHT && 50 <= MAX_WEIGHT && 100 < MAX_CAPACITY}")
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_CAPACITY = 100