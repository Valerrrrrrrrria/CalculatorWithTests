package com.example.caclulatorwithtests.utils

class ConvertUtils {

    companion object {
        fun stringToInteger(str: String): Int {
            var result = 0

            try {
                result = Integer.parseInt(str)
            } catch (e: java.lang.NumberFormatException) {
                e.printStackTrace()
            }
            return result
        }
    }
}