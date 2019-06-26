import scala.util.Random
import annotation.tailrec

def randomSelect[A](size: Int, list: List[A]): List[A] = {
  @tailrec
  def randomSelectRec(remaining: List[A], acc: List[A]): List[A] = {
    if (acc.length == size) acc
    else {
      val randomIdx = Random.nextInt(remaining.length)
      val (x, xs) = removeAt(randomIdx, remaining)
      randomSelectRec(xs, x +: acc)
    }
  }

  randomSelectRec(list, Nil)
}
