package basics

import org.example.basics.Person
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class EncapsulationPersonTest {

    @Test
    fun `test person`() {
        val person = Person("Mary", false, 20)
        assertTrue(person.isAdult())
        assertTrue(person.isEligibleToVote())
        assertTrue(person.canBuyAlcohol())
        assertTrue(person.canBuyTobacco())
        assertTrue(person.canBuyFireworks())
        assertTrue(person.canDrive())
        assertTrue(person.canMarry())
        assertTrue(person.canVote())
    }

    @Test
    fun `test person is student`() {
        val person = Person("Mary", true, 20)
        assertTrue(person.isStudent())
        val personIsNotStudent = Person(person.name(), !person.isStudent(), person.age())
        assertFalse(personIsNotStudent.isStudent())
    }
}