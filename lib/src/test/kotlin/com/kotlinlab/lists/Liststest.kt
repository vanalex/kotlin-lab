package com.kotlinlab.lists

import org.junit.Test
import kotlin.test.assertEquals

class Liststest {

    @Test
    fun testListCreation(){
        val integers = listOf(2, 4, 10, 12, 9, 7)
        assertEquals(integers, listOf(2, 4, 10, 12, 9, 7))
    }

    @Test
    fun testSumListElements(){
        val integers = listOf(2, 4, 10, 12, 9, 7)
        var result = ""
        for (i in integers) {
            result += "$i "
        }

        assertEquals("2 4 10 12 9 7 ", result)
    }

    @Test
    fun testOutOfBoundsList(){
        val integers = listOf(3, 6, 8)
        try{
           integers.get(3)
        }catch (exception: ArrayIndexOutOfBoundsException){
            assertEquals("Index 3 out of bounds for length 3", exception.localizedMessage)
        }
    }

    @Test
    fun testSumElementOfList(){
        val doubles = listOf(1.1, 2.2, 3.3, 4.4)
        assertEquals(doubles.sum(), 11.0)
    }
}