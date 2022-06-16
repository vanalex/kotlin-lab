package com.kotlinlab.lists

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertFalse
import kotlin.test.assertTrue

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

    data class Person(val name: String, val age: Int, val driversLicense: Boolean = false)

    val friendsGroup = listOf(Person("Jo", 19),
                            Person("Mic", 15),
                            Person("Hay", 33, true),
                            Person("Cal", 25))

    @Test
    fun testAnyCollection(){
        assertTrue(friendsGroup.any{it.driversLicense})
        assertFalse(friendsGroup.none { it.age < 18 })
        assertTrue(friendsGroup.all { it.name.length < 4 })

        val emptyPersonList = emptyList<Person>()
        assertFalse(emptyPersonList.any { it.driversLicense })
        assertTrue(emptyPersonList.none { it.age < 18 })
        assertTrue(emptyPersonList.all { it.name.count() < 4 })

    }
}