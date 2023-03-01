object Functions_tutorial extends App {
  //using different functions in scala
  println((1 to 5).map(x => x *2) )
  println((1 to 3).reduceLeft(_ + _))
  println ( (1 to 3).map( x=> x*x ) )

  List(1,2,3,4,5,6).foreach((i:Int) => println(i * 2))

  println(List(1,2,3).zip(List(4,5,6)))

  //using underscore as a partial function
  def sum(a:Int, b:Int): Int = a + b
  val add6 = sum(6,_)
  println(add6(7))

  //Curried Functions
  def suma(a:Int)(b:Int): Int = a+b

  println(suma(4)(6))

  //implicit functions
  implicit def transformStringtoInt(n:String) = n.toInt
  val s:String = "12345"
  val i:Int = s


}
