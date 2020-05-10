object Part3 {
  def mulOfEvenRows(list: List[List[Int]]): List[Int] = {
    list.zipWithIndex.filter{case(_, i) => i % 2 == 0}
      .map { case(e, _) => e.reduce((x, y) => x*y)}
  }
  def main(args:Array[String]): Unit = {
    val list = List(List(13, 4, 5), List(5, 67, 8), List(1, 19, 8), List(1, 4, 12))
    println(mulOfEvenRows(list))
  }
}
