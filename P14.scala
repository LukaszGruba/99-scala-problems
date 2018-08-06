def duplicate[A](list: List[A]): List[A] = list.foldRight(List[A]())((x, acc) => x :: x :: acc )

def duplicateR[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case x :: xs => x :: x :: duplicateR(xs)
}

def duplicateTR[A](list: List[A]): List[A] = {
    @annotation.tailrec
    def duplicateTR[A](duplicated: List[A], rest: List[A]): List[A] = rest match {
    	case Nil => duplicated
	case x :: xs => duplicateTR(duplicated :+ x :+ x, xs)
    }
    duplicateTR(List[A](), list)
}

def duplicateTROpt[A](list: List[A]): List[A] = {
    @annotation.tailrec
    def duplicateTROpt[A](duplicated: List[A], rest: List[A]): List[A] = rest match {
    	case Nil => duplicated.reverse
	case x :: xs => duplicateTROpt(x :: x :: duplicated, xs)
    }
    duplicateTROpt(List[A](), list)
}

def duplicateImperative[A](list: List[A]): List[A] = {
    val dups = for (x <- list) yield List(x, x)
    dups.flatten
}

def duplicateImperative2[A](list: List[A]): List[A] = {
    val builder = List.newBuilder[A]
    for (x <- list) {
    	builder += x
	builder += x
    }
    builder.result
}