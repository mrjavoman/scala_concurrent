/**
 * Created by Xavi on 6/19/2014.
 */
package Concurrent

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MainTests extends FunSuite {

  import Main_Concurrent.testMethod

  test("works?") {
    assert(testMethod() == 1)
  }

}

