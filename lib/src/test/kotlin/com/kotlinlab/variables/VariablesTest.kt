package com.kotlinlab.variables

import org.junit.Test
import kotlin.test.assertEquals

class VariablesTest {

    @Test
    fun testVarIsMutable(){
        var sum = 1
        sum += 2
        sum += 3
        assertEquals(6, sum)
    }
}