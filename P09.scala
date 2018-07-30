//P09
def pack[A](list: List[A]): List[List[A]] = list.foldRight(List(List[A]())){ (x, acc) =>
    acc match {
    	case List(Nil) => List(List(x))
    	case sublist :: xs => if (sublist contains x) (x :: sublist) :: xs else List(x) :: sublist :: xs
    }
}