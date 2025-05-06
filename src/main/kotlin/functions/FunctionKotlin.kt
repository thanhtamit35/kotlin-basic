package org.example.functions

// Khai báo hàm đơn giản nhất trong Kotlin
fun addNumbers(num1: Int, num2: Int): Int {
    return num1 + num2
}

// inner function
fun outerFunction() {
    fun innerFunction() {
        println("This is the inner function.")
    }

    println("This is the outer function.")
    innerFunction()
}

// Khai báo hàm là 1 lambda expression
val multiply = { num1: Int, num2: Int -> num1 * num2 }

fun main() {
    val sum = addNumbers(5, 3)

    println("The sum is: $sum")

    outerFunction()

    val res = multiply(3, 5)

    println("The result is: $res")
}