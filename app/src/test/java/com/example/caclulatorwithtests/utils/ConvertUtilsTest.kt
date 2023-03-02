package com.example.caclulatorwithtests.utils

import org.junit.Assert
import org.junit.Test

internal class ConvertUtilsTest {

    @Test
    fun stringToInteger() {
        Assert.assertEquals(2, ConvertUtils.stringToInteger("2"))
        Assert.assertEquals(-2, ConvertUtils.stringToInteger("-2"))
        Assert.assertEquals(0, ConvertUtils.stringToInteger(""))
        Assert.assertEquals(0, ConvertUtils.stringToInteger("a"))
    }
}