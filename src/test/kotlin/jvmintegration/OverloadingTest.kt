package jvmintegration

import org.example.jvmintegration.Product
import org.example.jvmintegration.addProduct
import org.junit.jupiter.api.assertAll
import kotlin.test.Test

internal class OverloadingTest {

    @Test
    internal fun `check all overloads`(){
        assertAll("Overloads called from Kotlin",
            { println(addProduct("Name", 5.0, "Desc")) },
            { println(addProduct("Name", 5.0)) },
            { println(addProduct("Name")) }
        )
    }

    @Test
    internal fun `check overloaded Product constructor`() {
        assertAll("Overloads called from Kotlin",
            { println(Product("Name", 5.0, "Desc")) },
            { println(Product("Name", 5.0)) },
            { println(Product("Name")) }
        )
    }
}