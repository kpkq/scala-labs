object Part2 {
  def checkListForPrime(list: List[Int]): Boolean = {
    def isPrime(n: Int) = !Range(2, n - 1).exists(i => n % i == 0)
    list.foldLeft(List[Boolean]())((acc, i) => acc ::: (isPrime(i) :: Nil)).forall(_ == true)
  }
  def main(args:Array[String]): Unit = {
  val list = List()
  println(checkListForPrime(list))
  }
}
