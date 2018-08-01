//P10
def encode[A](list: List[A]): List[(Int, A)] = pack(list).map(sublist => (sublist.length, sublist(0)))