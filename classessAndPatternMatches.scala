object classessAndPatternMatches extends App{

// creating type on scala
  type Email = String
  val e =  new Email("leks@gmail,com")

  //creating case class in scala
  case class person(name: String, age: Int)

  val p = person("Diego", 31)
  val p2 = person("Diego", 32)

  println(p.name)

  //pattern matches
  def Resolve(choice: Int): String = choice match {
    case 1 => "Yes"
    case 0 => "No"
    case _ => throw new IllegalArgumentException("Valid arguments are :" + choice)

  }

  println(Resolve(0))
  println(Resolve(1))
  try {
    println(Resolve(33))
  }
  catch {
    case e: Exception => println("Something went run. EX:" + e)
  }
  // pattern matcher for factorial
  def factorial(n: Int):Int =n match {
    case 0 => 1
    case n => n* factorial(n-1)
  }

  //Partial functions
  //even or odd numbers
  val even : PartialFunction[Int,String] ={
    case i if i % 2 ==0 => "even"
  }
  val odd: PartialFunction[Int,String] ={
    case _ => "odd"
  }

  val evenOrOdd:(Int => String) = even orElse odd

  println(evenOrOdd(5)=="odd")

}
