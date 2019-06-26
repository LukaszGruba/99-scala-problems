def lotto(n: Int, from: Int): List[Int] =
  randomSelect(n, (1 to from).toList)
