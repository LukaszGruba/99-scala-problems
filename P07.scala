//P07
def flatten[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case (x: List[A]) :: xs => flatten(x) ++ flatten(xs)
    case x :: xs => x :: flatten(xs)
}