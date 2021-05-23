package handsonlab

object Functions {

  def main(args: Array[String]): Unit = {

    def aFunction(a: Int, b: String) {
      a + b
    }
    println(aFunction(5,"abc"))
  }

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)


  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }  // for loop

  println(aRepeatedFunction("hello",3))


  def aFunctionWithSideEffects(aString: String)= {
    println(aString)

  }


  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }
  println(aBigFunction(5))

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)

  println(factorial(5))


  var a = 5

  var b ="abc"

  var c =a+b
  var d =a.toString
  println(d)

}
