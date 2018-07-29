//P01
def last[A](it: Iterable[A]): A = it.reduce((_, x) => x)