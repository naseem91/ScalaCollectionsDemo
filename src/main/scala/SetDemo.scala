object SetDemo {
  def main(args: Array[String]): Unit = {

    //Immutable set
    val fruitSet1:Set[String] = Set ("Apple","banana","pears")
    val fruitSet2 = Set("mangoes", "oranges")
    val nums: Set[Int] = Set()

    //Basic operations in sets
    println( "Head of fruit : " + fruitSet1.head )
    println( "Tail of fruit : " + fruitSet1.tail )
    println( "Check if fruit is empty : " + fruitSet1.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )
    println()

    //Concatenating sets
    var fruit = fruitSet1 ++ fruitSet2
    println( "fruit1 ++ fruit2 : " + fruit )
    println()

    // find min and max of the elements
    val num:Set[Int] = Set(80,40,20,10,5)
    println( "Min element in Set(80,40,20,10,5) : " + num.min )
    println( "Max element in Set(80,40,20,10,5) : " + num.max )
    println()

    //Mutable Set
    var mutableSet = scala.collection.mutable.Set[Char]()
    mutableSet += 'b'
    mutableSet += 'a'
    mutableSet += 'v'
    println("Mutable set : " + mutableSet)

  }

}
