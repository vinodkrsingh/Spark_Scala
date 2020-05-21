package testspark

object exceptionHandling {
  def main(args: Array[String]): Unit = {
    val spark = org.apache.spark.sql.SparkSession.builder
      .master("local")
      .appName("Spark CSV Reader")
      .getOrCreate;
    try {
      val df = spark.read.format("csv").option("header", "true").load("/home/vinod/Downloads/empdetails.csv.csv")
      df.show()
      df.filter(df("Salary") > 5000).show()
    }
    catch {
      case ex: org.apache.spark.sql.AnalysisException => {
        val df1 = Seq((101,"Rahul","2017-09-07",8000), (102,"Shivam","2019-01-05",9500), (103,"Rajesh","2016-03-15",2000),
          (104,"Vinod","2020-02-03",4500),(105,"Pramod","2009-08-25",6800),(106,"Krishna","2019-01-19",3600),(107,"Mahesh","2012-12-12",12000),
          (108,"Ajay","2015-10-01",2200),(109,"Bharat","2019-06-20",5500),(110,"Sunil","2020-01-31",4900))
        val df = spark.createDataFrame(df1)
        val dff = df.withColumnRenamed("_1","EmployeeId").withColumnRenamed("_2","EmployeeName")
          .withColumnRenamed("_3","DsateOfJoning").withColumnRenamed("_4","Salary")

        dff.show()
        dff.filter(dff("Salary") > 5000).show()
          None
      }
      case unknown: Exception => {
        println(s"Unknown exception: $unknown")
        None
      }
    }
    println("hello")
  }
}
