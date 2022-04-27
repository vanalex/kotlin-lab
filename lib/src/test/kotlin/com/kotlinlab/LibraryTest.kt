package com.kotlinlab

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LibraryTest {

    @Test fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }

    @Test fun returnHelloWorldMessage() {
        val classUnderTest = Library()
        assertEquals(classUnderTest.returnHelloWorldMessage(), "Hello World!")
    }

    @Test fun tryingKotlin() {
        val classUnderTest = Library()
        assertEquals("Hi, John!", classUnderTest.tryingKotlinMessageInterpolation("John"))
    }
}
