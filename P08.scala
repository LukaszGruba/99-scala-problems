//P08
def compress[A](list: List[A]): List[A] = list match {
    case a :: b :: xs => if (a == b) compress(b :: xs) else a :: compress(b :: xs)
    case l => l
}