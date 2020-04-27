import scala.annotation.tailrec
import scala.collection.mutable

def evenElementsOnly(list: List[Int]) = {
  list.filter(_%2 == 0)     // возвращает только четные элементы
}
// ------------------------------------
// функция с хвостовой рекурсией
@annotation.tailrec
def evenTailRec(list: List[Int], i: Int, stack: mutable.ArrayStack[Int]): List[Int] = {
  if (i >= list.size) stack.toList  // если конец списка - формируем новый список и выходим
  if (list(i) %2 == 0) {  // четный элементы записываем в стэк
    stack.push(list(i))
    evenTailRec(list, i+1, stack)
  }
  else evenTailRec(list, i+1, stack)  // берем след элемент
}
def evenElementsOnlyTailRec(list: List[Int]): List[Int] = {
  val i = 0
  val stack = new mutable.ArrayStack[Int]()
  evenTailRec(list, i, stack)
}
