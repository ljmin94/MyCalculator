package com.example.myapplication.lv3

fun main() {
    val calculator = Calculator()

    println("덧셈 연산 결과 : ${calculator.addOperation(AddOperation(), 10, 2)}")
    println("뺄셈 연산 결과 : ${calculator.substractOperation(SubstractOperation(), 10, 2)}")
    println("곱셈 연산 결과 : ${calculator.multiplyOperation(MultiplyOperation(), 10, 2)}")
    println("나눗셈 연산 결과 : ${calculator.divideOperation(DivideOperation(), 10, 2)}")
}