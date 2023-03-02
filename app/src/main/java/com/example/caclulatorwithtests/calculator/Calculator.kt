package com.example.caclulatorwithtests.calculator

import timber.log.Timber

class Calculator {

    fun add(a: Int, b: Int) = a + b

    fun subtract(a: Int, b: Int) = a - b

    fun multiply(a: Int, b: Int) = a * b

    fun divide(a: Int, b: Int) = if (b != 0) a / b else {
        Timber.tag("Calculator info").i("Divide by 0")
        0
    }
    fun checkIfNotNull(a: Int?, b: Int?) = (a != null) && (b != null)

}