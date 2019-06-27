type Group = List[String]

type Combination = List[Group]

def group3(people: List[String]): List[Combination] = {
  val groupsOf2: List[Group] = combinations(2, people)
  groupsOf2.flatMap { group2 =>
    val remaining = people.filterNot(group2.contains)
    val groupsOf3 = combinations(3, remaining)
    val groupsOf3And4 =
      groupsOf3.map { group3 =>
        val groupOf4 = remaining.filterNot(group3.contains)
        (group3, groupOf4)
      }
    groupsOf3And4.map { case (g3, g4) => List(group2, g3, g4) }
  }
}

