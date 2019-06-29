def lsort[A](lists: List[List[A]]): List[List[A]] = lists.sortBy(_.length)

def lsortFreq[A](lists: List[List[A]]): List[List[A]] = {
  lists
    .groupBy(_.length)
    .toList
    .sortBy { case (_, grp) => grp.length }
    .flatMap { case (_, grp) => grp }
}
