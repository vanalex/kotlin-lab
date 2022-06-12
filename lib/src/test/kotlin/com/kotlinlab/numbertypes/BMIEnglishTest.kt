package com.kotlinlab.numbertypes

import org.junit.Test
import kotlin.test.assertEquals

class BMIEnglishTest {

    @Test
    fun testGivenValuesThenShouldBeUnderWeight(){
        val result = bmiEnglish(90, 190)
        assertEquals("Underweight", result)
    }
}