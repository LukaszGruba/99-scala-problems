//P18
def slice[A](i: Int, j: Int, list: List[A]): List[A] = {
    val range = i to (j - 1)
    list.zipWithIndex
	.filter { case (_, i) => range.contains(i) }
	.map(_._1)
}