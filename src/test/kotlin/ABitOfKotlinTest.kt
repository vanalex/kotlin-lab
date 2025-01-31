import org.example.taste.Person
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class ABitOfKotlinTest {

    private val persons = listOf(
        Person("Alice", 28),
        Person("Bob", 35),
        Person("Charlie", null),
        Person("Diana", 42),
        Person("Erik", 19),
        Person("Fiona", null),
        Person("George", 56),
        Person("Hannah", 31),
        Person("Ian", 25),
        Person("Julia", 39)
    )

    @Test
    fun `test get oldest person`() {
        val oldest = persons.filterNot{ it.age == null }.maxByOrNull { it.age ?: Int.MIN_VALUE }
        assert(oldest?.name == "George")
        assert(oldest?.age == 56)

    }

    @Test
    fun `test get youngest person`() {
        val youngest = persons.filterNot{it.age == null}.minByOrNull { it.age ?: Int.MIN_VALUE }
        assert(youngest?.name == "Erik")
        assert(youngest?.age == 19)

    }

    @Test
    fun `test get names beginning with char H`() {
        val nameStartsWithH = persons.filterNot{it.age == null}.filter { it.name.startsWith("H") }
        assertNotNull(nameStartsWithH)
        assert(nameStartsWithH.size == 1)
        assert(nameStartsWithH.first().name == "Hannah")
    }

    @Test
    fun `test get longest name`() {
        val personWithLongestName = persons.filterNot{it.age == null}.maxByOrNull { it.name.length }
        assert(personWithLongestName?.name == "George")
    }
}