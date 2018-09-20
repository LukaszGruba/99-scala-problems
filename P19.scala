//P19
def rotate[A](n: Int, list: List[A]): List[A] = {
    val boundedN = n % list.length
    val normalizedN = if (boundedN >= 0) boundedN else (list.length + boundedN)
    (list drop normalizedN) ++ (list take normalizedN)
}