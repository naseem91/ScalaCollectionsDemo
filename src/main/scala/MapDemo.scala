object MapDemo {
  def main(args: Array[String]): Unit = {

    //Immutable map
    val numbers: Map[Int, String] = Map(1 -> "one", 2 -> "tow", 3 -> "three")
    val colors: Map[Int, String] = Map()

    //Map Operation
    println("Keys in numbers : " + numbers.keys)
    println("Values in numbers : " + numbers.values)
    println("Check if numbers is empty : " + numbers.isEmpty)
    println("Check if colors is empty : " + colors.isEmpty)
    println("Get element from map by key :" + numbers(2))
    println()

    //Iterate over map
    numbers.keys.foreach { i =>
      print("Key = " + i)
      println("  Value = " + numbers(i))
    }
    println()

    //Mutable map
    var chars = scala.collection.mutable.Map[Int, String]()
    chars += (1 -> "A")
    chars += (2 -> "B")
    chars += (3 -> "C")
    println(chars)
  }

}
