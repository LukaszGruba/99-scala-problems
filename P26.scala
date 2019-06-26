def combinations[A](k: Int, list: List[A]): List[List[A]] = {
  def combinationsRec[A](pref:List[A], list: List[A]): List[List[A]] = {
    if (list.isEmpty) List(pref)
    else if (pref.length > k) Nil
    else {
      val branches = list.tails.toList.map {
        case Nil => (pref, Nil)
        case h +: t => (pref :+ h, t)
      }
      branches.flatMap { case (init, t) => combinationsRec(init, t) }
    }
  }
  combinationsRec(Nil, list).filter(_.length == k)
}
