type Group[A] = List[A]

type Combination[A] = List[Group[A]]

def group[A](groupDefs: List[Int], elems: List[A]): List[Combination[A]] =
  groupDefs match {
    case List(grpDef) => List(List(elems))
    case grpDef +: defs =>
      val groups = combinations(grpDef, elems)
      groups.flatMap { grp =>
        val remaining = elems.filterNot(grp.contains)
        group(groupDefs.tail, remaining).map(grp +: _)
      }
  }

def group3[A](elems: List[A]): List[Combination[A]] = group(List(2, 3, 4), elems)
