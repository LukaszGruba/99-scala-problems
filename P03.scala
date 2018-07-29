//P03
def nth[A](n: Int, l: List[A]): A = l(n)

def nth2[A](n: Int, l: List[A]): A = l.zipWithIndex.find(_._2 == n).map(_._1).get