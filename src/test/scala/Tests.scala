/**
  * Created by Administrator on 18/07/2017.
  */
import org.scalatest.FunSuite
import Main.buildString

class Tests extends FunSuite {


  test("longScale") {
    assert(Main.buildString("", 0, "123456789123456789", 2) ==="123 billiard 456 billion 789 milliard 123 million 456 thousands and 789")
  }

  test("shortScale"){
    assert(Main.buildString("", 0, "123456789123456789", 1) === "123 quadrillion 456 trillion 789 billion 123 million 456 thousands and 789")
  }
}