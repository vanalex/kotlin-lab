package model

import org.example.model.First
import org.example.model.Last
import org.example.model.Middle
import org.example.model.Person
import org.junit.jupiter.api.Assertions
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class PersonTest {

    private val johnDoe = Person(First("John"), Middle(null), Last("Doe"))

    @Test
    fun `nullable middle name`() {
        assertNull(johnDoe.middle)
    }

    @Test
    fun `safe call operator`(){
        var middleNameLength = johnDoe.middle?.value?.length
        Assertions.assertTrue(middleNameLength is Int?)

        if (johnDoe.middle != null) {
            middleNameLength = johnDoe.middle?.value?.length    // smart cast
        }
    }

    @Test
    fun `not-null assertion operator`(){
        if (johnDoe.middle?.value != null) {
            val middleNameLength = johnDoe.middle!!.value?.length
            assertEquals(middleNameLength, 1) //ugh
        }
    }

    @Test
    internal fun `Elvis operator`(){
        val p = Person(first = First("North"), Middle(null), Last("West"))
        val middleNameLength = p.middle?.value?.length ?: 0
        assertEquals(middleNameLength, 0)
    }

    @Test
    internal fun `safe cast`(){
        val person = johnDoe as? Person
        assertTrue(person is Person)
    }
}