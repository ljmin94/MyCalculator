package com.example.myapplication.lv2

fun main() {
    var a:Int = 10
    var b:Int = 3

    val calculator = Calculator()

    var add = calculator.add(a, b)
    println("덧셈 연산 결과 : $add")

    var minus = calculator.minus(a, b)
    println("뺄셈 연산 결과 : $minus")

    var multiply = calculator.multiply(a, b)
    println("곱셈 연산 결과 : $multiply")

    var division = calculator.division(a, b)
    println("나눗셈(몫) 연산 결과 : $division")

    var remainder = calculator.remainder(a, b)
    println("나머지 연산 결과 : $remainder")
}

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun division(a: Int, b: Int): Int {
        return a / b
    }

    fun remainder(a: Int, b: Int): Int {
        return a % b
    }
}