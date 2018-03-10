object TuplesDemo {
  def main(args: Array[String]): Unit = {

    //Examples of tuples
    val t = ("Hello", 2018)
    println(t)
    val t1 = new Tuple3(1, "Hello", 'a')
    println(t1)

    //Accessing elements in tuple
    val numbs = (1, 5, 7, 9, 4)
    val sum = numbs._1 + numbs._2 + numbs._3 + numbs._4 + numbs._5
    println(sum)
  }
}
