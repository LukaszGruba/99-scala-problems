//P11
def encodeModified[A](list: List[A]): List[Any] = encode(list).map(entry => entry match {
    case (1, x) => x
    case e => e
})