package lesson5

fun main() {
    println("Введите рост: ")
    val height = readln().toFloat()

    println("Введите вес: ")
    val weight = readln().toFloat()

    val IMT: Float = weight / ((height / 100) * (height / 100))

    if (IMT < 18.5)
        println("${String.format("%.2f", IMT)}; Недостаточная масса тела.")
    else if (IMT >= 18.5 && IMT < 25)
        println("${String.format("%.2f", IMT)}; Нормальная масса тела.")
    else if (IMT >= 25 && IMT < 30)
        println("${String.format("%.2f", IMT)}; Избыточная масса тела.")
    else
        println("${String.format("%.2f", IMT)}; Ожирение")
}
