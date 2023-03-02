package com.example.caclulatorwithtests

import com.example.caclulatorwithtests.calculator.Calculator
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import timber.log.Timber

internal class CalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        Timber.tag("Calculator info").i("setUp")
        calculator = Calculator()
    }

    @After
    fun tearDown() {
        Timber.tag("Calculator info").i("tearDown")
    }

    @Test
    fun add() {
        Timber.tag("Calculator info").i("add")
        Assert.assertEquals(5, calculator.add(2,3))
    }

    @Test
    fun subtract() {
        Timber.tag("Calculator info").i("subtract")
        Assert.assertEquals(5, calculator.subtract(8,3))
    }

    @Test
    fun multiply() {
        Timber.tag("Calculator info").i("multiply")
        Assert.assertEquals(9, calculator.multiply(3,3))
    }

    @Test
    fun divide() {
        Timber.tag("Calculator info").i("divide")
        Assert.assertEquals(2, calculator.divide(6,3))
    }
}