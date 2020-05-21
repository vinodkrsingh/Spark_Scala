package testspark
object wcdataframe {
  def main(args: Array[String]): Unit = {
    val spark = org.apache.spark.sql.SparkSession.builder.master("local").appName("Spark CSV Reader").getOrCreate;
    val df = spark.read.text("/home/vinod/projects/datasetmaster/abc1.txt")
    val wordsDF = df.explode("value","word")((line: String) => line.split(" "))
    val wordCountDF = wordsDF.groupBy("word").count()
    wordCountDF.show()
    df.printSchema()
  }

}
