package com.example.myapplication.lv3

class Calculator{
    fun addOperation(operation: AddOperation, a:Int, b: Int): Int {
        return operation.operate(a, b)
    }

    fun substractOperation(operation: SubstractOperation, a:Int, b: Int): Int {
        return operation.operate(a, b)
    }

    fun multiplyOperation(operation: MultiplyOperation, a:Int, b: Int): Int {
        return operation.operate(a, b)
    }

    fun divideOperation(operation: DivideOperation, a:Int, b: Int): Int {
        return operation.operate(a, b)
    }

}