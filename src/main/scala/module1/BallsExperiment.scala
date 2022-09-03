package module1
import scala.util.Random

class BallsExperiment {

  def isFirstBlackSecondWhite(): Boolean = {
    val urn = List(true, true, true, false, false, false) //true - белый, false - чёрный
    val shuffledList = Random.shuffle(urn)
    (shuffledList.head) match {
      case false =>
        (shuffledList.tail.head) match {
          case true => true
          case _ => false
        }
      case _ => false
    }
  }

}