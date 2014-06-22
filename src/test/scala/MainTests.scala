/**
 * Created by Xavi on 6/19/2014.
 */
package Concurrent

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MainTests extends FunSuite {

  import primelib.isPrimeInt
  import primelib.isPrimeBigInt

  test("5 is prime") {
    assert(isPrimeInt(5) == true)
  }

  test("10 is not  prime") {
    assert(isPrimeInt(10) == false)
  }

  test("531 is not prime") {
    assert(isPrimeInt(531) == false)
  }

  test("2349592604443933364L not prime "){
    assert(isPrimeBigInt(2349592604443933364L) == false)
  }
}

