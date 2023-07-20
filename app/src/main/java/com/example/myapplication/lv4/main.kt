package com.example.myapplication.lv4

fun main() {
    val calculate = Calcul()

    println("덧셈 연산 결과: ${calculate.calculator(Add(), 10, 2)}")
    println("뺄셈 연산 결과: ${calculate.calculator(Subtract(), 20, 2)}")
    println("곱셈 연산 결과: ${calculate.calculator(Multiply(), 10, 10)}")
    println("나눗셈(몫) 연산 결과: ${calculate.calculator(Divide(), 16, 4)}")
    println("계산 끝!!!!!!!!!!")

}