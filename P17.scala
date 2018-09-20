//P17
def split[A](n: Int, list: List[A]): (List[A], List[A]) = (list.take(n), list.drop(n))

def split2[A](n: Int, list: List[A]): (List[A], List[A]) = list.splitAt(n)