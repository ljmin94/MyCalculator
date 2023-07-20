package com.example.myapplication.lv4

class Calcul {
    fun calculator(operation: AbstractOperation, a: Int, b: Int): Int {
        return operation.operate(a, b)
    }
}