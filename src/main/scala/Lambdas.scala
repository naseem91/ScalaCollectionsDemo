object Lambdas {
  def main(args: Array[String]): Unit = {

    val addition = (a: Int, b: Int) => a + b
    println("Sum of 10,5 = " + addition(10, 5))

    val square = (x: Int) => x * x
    println("Square of 9 = " + square(9))
    println()

    val myArray = Array.range(1, 20)
    println("odd nums from 1,20 .... ")
    myArray.foreach((x: Int) => if (x % 2 == 0) print(x + " "))
    println()

    var mul = (_: Int) * 5
    var mylist: List[Int] = List(1, 2, 3, 4)
    println()
    println("Multiplying list by 5 ")
    for (num <- mylist) {
      println("5 * " + num + "  = " + mul(num))
    }

    val lt: (Double, Double) => Boolean = _ < _
    println("3 less than 4 is " + lt(3, 4))
  }
}
