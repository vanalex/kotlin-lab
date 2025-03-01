package basics

import org.example.basics.fizzBuzz
import kotlin.test.Test

class FizzBuzzKtTest {

 @Test
 fun testFizzBuzz() {
  val result = fizzBuzz(5)
  assert(result == "Buzz")
 }

 @Test
 fun testFizzBuzzElse() {
  val result = fizzBuzz(7)
  assert(result == "7")
 }
}