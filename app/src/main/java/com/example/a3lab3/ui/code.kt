package com.example.a3lab3.ui

fun main() {
    // 1. Работа с преобразованием строк
    val str1 = "Hello"
    val str2 = "World"
    val result = str1 + " " + str2
    println(result)

    // 2. Базовая арифметика и вывод результата в консоль
    val a = 5
    val b = 3
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b

    println("Сумма: $sum")
    println("Разница: $difference")
    println("Произведение: $product")
    println("Частное: $quotient")

    // 3. Примеры интерполяции строк
    val f = 10
    val l = 20
    val j = "Сумма $f и $l  ${f + l}"
    println(j) // Output: The sum of 10 and 20 is 30

    // 4. Преобразование типов
    val number: Int = 10
    val doubleNumber: Double = number.toDouble()

    println("Целое число: $number")
    println("Дробное число: $doubleNumber")

    // 5. Пример условных операторов (if else)
    val x = 10
    val y = 5
    if (x > y) {
        println("x больше y")
    } else {
        println("x меньше или равно y")
    }

    // 6. Пример цикла for
    val names = arrayOf("Alice", "Bob", "Charlie")
    for (name in names) {
        println(name)
    }

    var count = 0
    while (count < 5) {
        println("Count: $count")
        count++
    }

    // 7. Пример создания отдельной функции
    fun greet() {
        println("Привет!")
    }
    greet()

    // 8. Пример работы с массивом
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers[0]) // Выводит 1
    println(numbers.size) // Выводит 5
}