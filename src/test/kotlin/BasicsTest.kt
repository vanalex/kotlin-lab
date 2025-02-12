import org.example.basics.max
import org.junit.jupiter.api.Test

class BasicsTest {

    @Test
    fun `max of two numbers`() {
        val maxNumber = max(1, 2)
        assert(maxNumber == 2)
    }

    @Test
    fun `max of two numbers given 2 equals numbers`() {
        val maxNumber = max(1, 1)
        assert(maxNumber == 1)
    }

    @Test
    fun `max of two numbers given both negative`() {
        val maxNumber = max(-1, -2)
        assert(maxNumber == -1)
    }
}