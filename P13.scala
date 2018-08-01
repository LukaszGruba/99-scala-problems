//P13
def encodeDirect[A](list: List[A]): List[(Int, A)] = list.foldRight(List[(Int, A)]()) { case (x, acc) =>
    acc match {
    	case Nil => List((1, x))
	case (h @ (i, el)) :: ts =>
	     if (el == x)
	     	(i+1, el) :: ts
	     else
		(1, x) :: h :: ts
    }
}