def insertAt[A](el: A, idx: Int, list: List[A]): List[A] = {
  val (before, after) = list.splitAt(idx)
  (before :+ el) ++ after
}
