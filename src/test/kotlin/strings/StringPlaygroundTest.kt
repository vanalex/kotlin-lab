package strings

import org.example.strings.templatifyGreeting
import org.example.strings.templatifyGreetingWithIf
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class StringPlaygroundTest {
    @Test
    fun `test string template`() {
        val stringTemplate = templatifyGreeting("Mary")
        assertNotNull(stringTemplate)
        assertTrue(stringTemplate.startsWith("Hello, Mary!"))
    }

    @Test
    fun `test string template with if`() {
        val stringTemplate = templatifyGreetingWithIf("Mary")
        assertNotNull(stringTemplate)
        assertTrue(stringTemplate.startsWith("Hello, Mary!"))
    }

    @Test
    fun `test string template with if given blank value`() {
        val stringTemplate = templatifyGreetingWithIf("")
        assertNotNull(stringTemplate)
        assertTrue(stringTemplate.startsWith("Hello, someone!"))
    }
}