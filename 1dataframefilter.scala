package testspark

object sparkdf {
  def main(args: Array[String]): Unit = {
    val spark = org.apache.spark.sql.SparkSession.builder
      .master("local")
      .appName("Spark CSV Reader")
      .getOrCreate;
    val df = spark.read.format("csv").option("header", "true").load("/home/vinod/Downloads/empdetails.csv")
    df.show()
    df.filter(df("Salary") > 5000).show()
  }
}
