import org.scalatest.flatspec.AnyFlatSpec

class Part1Test extends AnyFlatSpec{
  "Part1" should "return empty List" in {
  assert(Part1.bubbleSort(List()) === List())
  }
  it should "bubble sort" in {
    assert(Part1.bubbleSort(List(1, 2, 4, 1, 4, 0, 145)) === List(0, 1, 1, 2, 4, 4, 145))
    assert(Part1.bubbleSort(List(5, 4, 4, 2, 1)) === List(1, 2, 4, 4, 5))
  }
}
