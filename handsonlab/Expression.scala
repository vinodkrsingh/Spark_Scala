

package handsonlab
import scala.io.Source
object Expression extends App{

  val x = if(true) 5 else 2
  println(x)
  var aVariable = 3
  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)
  val someValue = true
  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)

  lazy val foo = {
    println("Initialized")
    1
  }
  println(foo)


  lazy val lines = Source.fromFile("c://TTN")

  //println(lines)



}
