package basics

import org.example.basics.*
import kotlin.test.Test

class SmartCastsKtTest {

 @Test
 fun `test smart cast`() {
  val result = eval(Sum(Sum(Num(1), Num(2)), Num(4)))
  assert(7 == result)
 }

 @Test
 fun `test smart cast 2`() {
  val result = eval2(Sum(Sum(Num(1), Num(2)), Num(4)))
  assert(7 == result)
 }

 @Test
 fun `test smart cast 3`() {
  val result = eval3(Sum(Sum(Num(1), Num(2)), Num(4)))
  assert(7 == result)
 }
}