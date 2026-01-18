package lesson2

fun main() {
    val salaryOfEmployees: Int = 50 * 30000
    val generalExpenses: Int = salaryOfEmployees + 30 * 20000
    val averageSalary: Int = generalExpenses / (50 + 30)

    println(salaryOfEmployees)
    println(generalExpenses)
    println(averageSalary)
}