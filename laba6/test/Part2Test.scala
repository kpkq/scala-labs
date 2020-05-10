import org.scalatest.flatspec.AnyFlatSpec

class Part2Test extends AnyFlatSpec{
  "Part2" should "true for empty list" in {
    assert(Part2.checkListForPrime(List()) === true)
  }
  it should "true if all elements are prime" in {
    assert(Part2.checkListForPrime(List(1, 2, 5, 13)) === true)
    assert(Part2.checkListForPrime(List(2, 5, 17, 13)) === true)
  }
  it should "true if some elements aren't prime" in {
    assert(Part2.checkListForPrime(List(5, 4, 2, 1)) === false)
    assert(Part2.checkListForPrime(List(2, 10)) === false)
  }
}
