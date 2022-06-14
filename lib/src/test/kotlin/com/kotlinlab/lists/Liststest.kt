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
    fun testConcatListElements(){
        val integers = listOf(2, 4, 10, 12, 9, 7)
        var result = ""
        for (i in integers) {
            result += "$i "
        }

        assertEquals("2 4 10 12 9 7 ", result)
    }

    @Test
    fun testSumListElements(){
        val integers = listOf(2, 4, 10, 12, 9, 7)

        assertEquals(44, integers.sum())
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

    @Test
    fun testOperationsOnListOfString(){
        val strings = listOf("Twas", "Brillig", "And", "Slithy", "Toves")
        assertEquals(strings, listOf("Twas", "Brillig", "And", "Slithy", "Toves"))
        assertEquals(strings.sorted(), listOf("And", "Brillig", "Slithy", "Toves", "Twas"))
        assertEquals(strings.reversed(), listOf("Toves", "Slithy", "And", "Brillig", "Twas"))
        assertEquals(strings.first(),"Twas")
        assertEquals(strings.takeLast(2), listOf("Slithy", "Toves"))
    }
}