object FoldReduceDemo {

  def main(args: Array[String]): Unit = {
   val myList:Array[Int] = Array(5,7,6,3,1,2)

    //Reduce function
    println("Apply reduce left over array list : ")
    println(myList.reduceLeft((a,b) => {println(a+","+b);a+b}))
    println("Applay reduce right over array list ")
    println(myList.reduceRight((a,b)=>{println(a+","+b);a+b}))
    println()

    //Fold function
    println("Apply fold over array list  : ")
    println(myList.fold(0)(_+_))
    println("Apply fold left over array list :")
    println(myList.foldLeft("")(_+_))

  }

}
