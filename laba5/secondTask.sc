import scala.annotation.tailrec
import scala.collection.mutable

def isPrime(n: Int) = !Range(2, n - 1).exists(i => n % i == 0) // проверка на простое число
def isSolution(n: Int, number: Int, list: List[Int]) : Boolean = {
  list.exists(num => n + num == number) // проверка на то, что число является решением
}
// функция возвращает два решения
def GoldbachsConjecture(num: Int): List[Int] = {
  require(num >=2 && num%2 == 0) // требования: четность, больше 2
  val primeNumList = List.range(2, num).filter(num1 => isPrime(num1)) // все простые числа в диапазоне
  val allSolutions = primeNumList.filter(isSolution(_, num, primeNumList)) // все решения
    .filter(isSolution(_, num, primeNumList))
  val newList = List[Int](0, 0)    // два решения
  newList.updated(0, allSolutions.head).updated(1, allSolutions.last)
}

//---------------------------------
// функция с хвостовой рекурсией возвращает два решения
@annotation.tailrec
def GoldbachsConjectureHelper(list: List[Int], num: Int, i: Int, j: Int) : List[Int] = {
  if(list(i) + list(j) == num){   // два решения записываются и возвращаются
    val newList = List[Int](0, 0)
    newList.updated(0, list(i)).updated(1, list(j))
  }
  else if (j == list.size -1) GoldbachsConjectureHelper(list, num, i+1, 0)
  else GoldbachsConjectureHelper(list, num, i, j+1) // след итерация
}
def GoldbachsConjectureTailRec(num: Int) : Any = {
  require(num >=2 && num%2 == 0) // требования: четность, больше 2
  val primeNumList = List.range(2, num).filter(num1 => isPrime(num1))
  GoldbachsConjectureHelper(primeNumList, num, 0, 0)
}
val lst2 = GoldbachsConjectureTailRec(100)