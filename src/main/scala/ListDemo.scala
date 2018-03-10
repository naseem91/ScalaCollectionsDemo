import scala.collection.mutable.ListBuffer
object ListDemo {
  def main(args: Array[String]): Unit = {
    //Immutable list
    val oddNums: List[Int] = List(1, 3, 5, 7, 9, 11, 13)

    //Operations On list
    println("Odd numbers :" + oddNums)
    println("Head of list :" + oddNums.head)
    println("Tail of List :" + oddNums.tail)
    println("check if List is empty : " + oddNums.isEmpty)
    println("Find the element of index 0 " + oddNums.apply(0))
    println("Check if an element exist , check 7 :" + oddNums.contains(7))
    println()

    //Uniform list
    val onesList = List.fill(10)(1)
    println("Uniform list " + onesList)

    //Tabulated list
    val tabulatedList = List.tabulate(10)(x => x * 3)
    println("Tabulated List :" + tabulatedList)

    //Mutable List
    val evenNums = new ListBuffer[(Int)]
    evenNums +=2
    evenNums +=4
    evenNums +=6
    println("Mutable List : " + evenNums)
  }

}
