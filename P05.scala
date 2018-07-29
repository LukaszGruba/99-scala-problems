//P05
def reverse[A](l: List[A]): List[A] = l.reverse

def reverse2[A](l: List[A]): List[A] = l.foldLeft(List[A]()) { (x, acc) => acc :: x }

def reverse3[A](l: List[A]): List[A] = {
    def reverse3tailrec[A](l: List[A], r: List[A]): List[A] = l match {
        case Nil => r
        case x :: xs => reverse3tailrec(xs, r :+ x)
    }
    reverse3tailrec(l, List())
}