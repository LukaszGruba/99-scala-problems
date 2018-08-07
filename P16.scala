//P16
def drop[A](n: Int, list: List[A]): List[A] = {
    list.zipWithIndex
	.filter{ case (_, i) => (i+1) % n != 0 }
	.map(_._1)
}