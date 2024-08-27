package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val numberOfInterns = 30
    val salaryOfEmployees = 30000
    val salaryOfInterns = 20000
    val sumOfSalaryEmployees = 50 * 30000
    val sumOfSalaryAll = sumOfSalaryEmployees + 30 * 20000
    val numberOfAll = numberOfEmployees + numberOfInterns
    val averageSalaryAll = sumOfSalaryAll / numberOfAll

    println(sumOfSalaryEmployees)
    println(sumOfSalaryAll)
    println(averageSalaryAll)
}