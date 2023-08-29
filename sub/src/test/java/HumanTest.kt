import org.example.Human
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class HumanTest {

    private lateinit var sut: Human
    private val name = "Michl"

    @Test
    fun `can greet`() {
        sut = Human(name)
        assertEquals(sut.greet(), "My name is: Michl")
    }

    @Test
    fun `can count`() {
        sut = Human(name)
        sut.add(5)
        assertEquals(sut.add(2), 7)
    }
}