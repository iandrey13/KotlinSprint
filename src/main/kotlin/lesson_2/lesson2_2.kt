package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val numberOfInterns = 30
    val salaryOfEmployees = 30000
    val salaryOfInterns = 20000
    val sumOfSalaryEmployees = numberOfEmployees * salaryOfEmployees
    val sumOfSalaryAll = sumOfSalaryEmployees + numberOfInterns * salaryOfInterns
    val numberOfAll = numberOfEmployees + numberOfInterns
    val averageSalaryAll = sumOfSalaryAll / numberOfAll
    println(sumOfSalaryEmployees)
    println(sumOfSalaryAll)
    println(averageSalaryAll)
}