//P12
def decode[A](encoded: List[(Int, A)]): List[A] = encoded.flatMap(entry => (1 to entry._1).map(_ => entry._2))

def decodePM[A](encoded: List[(Int, A)]): List[A] = encoded flatMap { case (i, a) => List.fill(i)(a) }