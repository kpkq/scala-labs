import org.scalatest.flatspec.AnyFlatSpec

class Part3Test extends AnyFlatSpec{
  "Part3" should "mul of all num in every even row" in {
    assert(Part3.mulOfEvenRows(List(List(13, 4, 5), List(5, 67, 8), List(1, 19, 8), List(1, 4, 12)))=== List(260, 152))
  }
  it should "return 0 if one of element equals 0" in {
    assert(Part3.mulOfEvenRows(List(List(13, 4, 0), List(5, 67, 8), List(1, 19, 8), List(1, 0, 12)))=== List(0, 0))
  }
}
