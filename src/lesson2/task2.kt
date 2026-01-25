package lesson2

fun main() {
    val numberOfEmployees: Int = 50
    val salaryOfEmployees: Int = 30000
    val numberOfInterns: Int = 30
    val salaryOfInterns: Int = 20000
    val salaryOfAllEmployees: Int = numberOfEmployees * salaryOfEmployees
    val generalExpenses: Int = salaryOfAllEmployees + numberOfInterns * salaryOfInterns
    val averageSalary: Int = generalExpenses / (numberOfEmployees + numberOfInterns)

    println(salaryOfEmployees)
    println(generalExpenses)
    println(averageSalary)
}