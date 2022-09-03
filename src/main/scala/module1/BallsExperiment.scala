package module1
import scala.util.Random

class BallsExperiment {
  def isFirstBlackSecondWhite(list: List[Boolean]): Boolean = {
    val shuffledList = Random.shuffle(list)
    if (shuffledList.head == false) {
      if (Random.shuffle(shuffledList.tail).head == true)
        true
      else
        false
    } else
      false
  }

}