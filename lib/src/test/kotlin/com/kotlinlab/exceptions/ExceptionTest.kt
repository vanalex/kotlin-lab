package com.kotlinlab.exceptions

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ExceptionTest {

    @Test
    fun testExceptionConversionToInt(){
        try { erroneousCode() }
        catch (exception: Exception){
            assertEquals("For input string: \"1\$\"", exception.localizedMessage)
        }
    }

    @Test
    fun testExceptionDivideByZero(){
        try { averageIncome(1000, 0) }
        catch (exception: Exception){
            assertEquals("/ by zero", exception.localizedMessage)
        }
    }

    @Test
    fun testCheckIfZeroThenNull(){
        val result = averageIncomeWithNull(1000, 0)
        assertNull(result)
    }

    @Test
    fun testException(){
        try { averageIncomeWithException(1000, 0) }
        catch (exception: Exception){
            assertEquals("Months can't be zero", exception.localizedMessage)
        }
    }

}