import annotation.tailrec

def range(from: Int, to: Int): List[Int] = (from to to).toList


def range2(from: Int, to: Int): List[Int] = {
  @tailrec
  def rangeRec(from: Int, to: Int, acc: List[Int]): List[Int] =
    from match {
      case `to` => (to +: acc).reverse
      case _ => rangeRec(from + 1, to, from +: acc)
    }
  rangeRec(from, to, Nil)
}


