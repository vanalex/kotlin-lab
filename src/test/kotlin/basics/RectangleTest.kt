package basics

import org.example.basics.Rectangle
import kotlin.test.Test
import kotlin.test.assertTrue

class RectangleTest {

      @Test
      fun `test rectangle`() {
            val rectangle = Rectangle(2, 3)
            assertTrue(rectangle.area() == 6)
            assertTrue(rectangle.perimeter() == 10)
            assertTrue(rectangle.isLargerThan(Rectangle(1, 1)))
      }

      @Test
      fun `test is square`() {
            val square = Rectangle(2, 2)
            assert(square.isSquare())
      }

      @Test
      fun `test is not square`() {
            val rectangle = Rectangle(2, 3)
            assert(!rectangle.isSquare())
      }

 }