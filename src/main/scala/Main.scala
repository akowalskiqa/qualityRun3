import scala.annotation.tailrec
//AK
object Main {
  def main(args:Array[String]): Unit ={
    val input = scala.io.StdIn.readLine()
    val resultA = buildString("",0,input,1)
  }
  val numbers:Array[(String,String)] = Array(Tuple2("",""),
    Tuple2(" thousands and "," thousands and "),
    Tuple2(" million "," million "),
    Tuple2(" billion "," milliard "),
    Tuple2(" trillion "," billion "),
    Tuple2(" quadrillion "," billiard "),
    Tuple2(" quintillion "," trillion "),
    Tuple2(" sextillion "," trilliard ")
  )
  def getPosition(index:Int, shortOrLong:Int): String ={
    shortOrLong match{
      case 1 => numbers(index)._1
      case 2 => numbers(index)._2
      case _ => ""
    }}
  @tailrec
  def buildString(currentString:String,byThrees:Int,message:String,printExample:Int): String ={
    if (message.length > 3) {
      val outPut = message.substring(message.length - 3, message.length) + getPosition(byThrees,printExample) + currentString
      val restOfMessage = message.substring(0, message.length - 3)
      buildString(outPut, byThrees + 1, restOfMessage, printExample)
    } else {
      val outPut = message + getPosition(byThrees,printExample) + currentString
      println(outPut)
      outPut
    }
  }
}
