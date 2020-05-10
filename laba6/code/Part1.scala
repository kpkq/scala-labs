import scala.annotation.tailrec

object Part1 {
    def bubbleSort(source: List[Int]) : List[Int]  = {
      @tailrec
      def sort(iteration: List[Int], source: List[Int], result: List[Int]): List[Int] = source match {
        case h1 :: h2 :: rest => if (h1 > h2) sort(iteration, h1 :: rest, result :+ h2) else sort(iteration, h2 :: rest, result :+ h1)
        case l :: Nil => sort(iteration, Nil, result :+ l)
        case Nil => if (iteration.isEmpty) return result else sort(iteration.dropRight(1), result, Nil)
      }

      sort(source, source, Nil)
    }
      def main(args:Array[String]): Unit = {
        println(bubbleSort(List(1, 5, 1, 2, 0, 3)))
    }
}
