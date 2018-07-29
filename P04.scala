//P04
def length[A](l: List[A]) = l.size

def length2[A](it: Iterable[A]) = it.foldLeft(0) { (acc, _) => acc + 1 }