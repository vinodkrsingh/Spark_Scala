package testspark
import org.apache.spark.{SparkConf, SparkContext}
object test {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("test").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val text = sc.textFile("/home/vinod/projects/datasetmaster/abc1.txt")
    val splitdata = text.flatMap(line => line.split(" "))
    val reduced = splitdata.map(word => (word, 1))
    val grup = reduced.reduceByKey(_+_)
    grup.foreach(println)
  }
}
