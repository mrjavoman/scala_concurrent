package Concurrent

/**
 * Created by xavi on 6/21/14.
 */
object primelib {

  def isPrimeInt(n: Int): Boolean = {

    //Boolean ret = true
    val x = 2

    def loop(k: Int): Boolean = {
      if (k * k > n) {
        return true
      } else if (n % k == 0) {
        return false
      }
      loop(k + 1)
    }

    loop(x)
  }

  def isPrimeBigInt(n: BigInt): Boolean = {

    //Boolean ret = true
    val x = 2

    def loop(k: BigInt): Boolean = {
      if (k * k > n) {
        return true
      } else if (n % k == 0) {
        return false
      }
      loop(k + 1)
    }

    loop(x)
  }

}
