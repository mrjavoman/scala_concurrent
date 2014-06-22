object worksheet{

  def isPrimeBigInt(n: BigInt): Boolean = {

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
  isPrimeBigInt(2349592604443933364L)

}