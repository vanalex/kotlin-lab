package basics

import org.example.basics.Color
import org.example.basics.getMnemonic
import org.example.basics.mix
import org.example.basics.mixOptimized
import kotlin.test.Test
import kotlin.test.assertFailsWith


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

    @Test
    fun `test warmth from sensor`(){
        val warmth = Color.ORANGE.getWarmthFromSensor()
        assert(warmth == "warm (red = ${Color.ORANGE.r})")
    }

    @Test
    fun `test mix`(){
        val mix = mix(Color.YELLOW, Color.BLUE)
        assert(mix == Color.GREEN)
    }

    @Test
    fun `test mix throws exception`(){
        assertFailsWith<Exception>(
            message = "Dirty Color",
            block = {
                mix(Color.YELLOW, Color.VIOLET)
            }
        )
    }

    @Test
    fun `test mix optmizied throws exception`(){
        val mix = mix(Color.YELLOW, Color.RED)
        assert(mix == Color.ORANGE)
    }

    @Test
    fun `test mix optimized throws exception`(){
        assertFailsWith<Exception>(
            message = "Dirty Color",
            block = {
                mixOptimized(Color.ORANGE, Color.VIOLET)
            }
        )
    }

}