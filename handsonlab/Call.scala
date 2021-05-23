package handsonlab

object Call {
  def main(args: Array[String]): Unit = {

    def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")


    println(savePicture())
    /*
      1. pass in every leading argument
      2. name the arguments
     */

   // savePicture(height = 600, width = 800, format = "bmp")


    def diff(a:Int,b:Int):Int={
      return b-a
    }
    println(diff(2,3))
    println(diff(b=3,a=2))
  }
}


