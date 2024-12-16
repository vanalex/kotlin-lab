package numbers

import kotlin.test.Test
import kotlin.test.assertEquals

class NumbersBaseTest {

    @Test
    fun `binary conversion`(){
        assertEquals(42.toString(2),"101010")
    }

    @Test
    fun `joke`(){
        val result = """
        Actually, there are 10 kinds of people
        Those who know binary, those who don't,
        And those who didn't realize this is actually a ternary joke
        """.trimIndent()
        val joke = """
        Actually, there are ${3.toString(3)} kinds of people
        Those who know binary, those who don't,
        And those who didn't realize this is actually a ternary joke
        """.trimIndent()

        assertEquals(joke, result)
    }


}