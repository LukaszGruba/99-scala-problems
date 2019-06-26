import annotation.tailrec

def removeAt[A](nth: Int, list: List[A]): (A, List[A]) = {
  @tailrec
  def removeRec(n: Int, rest: List[A], acc: List[A]): (A, List[A]) =
    n match {
      case 0 => (rest.head, acc.reverse ++ rest.tail)
      case _ => removeRec(n - 1, rest.tail, rest.head +: acc)
    }

  if (nth >= list.length) throw new IllegalStateException("n cannot be greater than list's length")
  else removeRec(nth, list, Nil)
}
