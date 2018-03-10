object FilterFunction {

  def main(args: Array[String]): Unit = {
    var list = List.range(1,10)
    var filtredList = list.filter(temp => temp % 2 == 0)
    filtredList.foreach {
      println
    }
  }

}
