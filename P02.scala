//P02
@annotation.tailrec
def penultimate[A](l: List[A]): A = l match {
    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => throw new NoSuchElementException
}