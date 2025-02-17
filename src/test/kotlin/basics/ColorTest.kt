package basics

import org.example.basics.Color
import org.example.basics.getMnemonic
import kotlin.test.Test


class ColorTest {

    @Test
    fun `test color`() {
        assert(Color.BLUE.rgb() == 255)
    }

    @Test
    fun `test color mnemonic`() {
        val red = Color.RED
        assert(getMnemonic(red) == "Richard")
    }
}