package lectures.part1.basics

object Expressions extends App {
  val x = 1 + 2 // Expression
  println( x )
  
  println( 2 + 3 * 4 )
  // + - * / & | ^ << >> >>> (right shift with zero extension)
  
  println( 1 == x )
  // == ! != > >= < <=
  
  println( !( 1 == x ) )
  // ! && ||
  
  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ... All of them are side effects
  println( aVariable )
  
  // Instructions ( something you tell the computer to do. E.g. print something to the console, change a variable )
  //  - As in imperative languages such as Java, Python
  // Expression ( something that has a value or a type )
  //  - As in functional languages such as Scala
  
  // if expression
  val aCondition = true
  val aConditionedValue = if ( aCondition ) 5 else 3 // if expression
  println( aConditionedValue )
  
  var i = 0
  while ( i < 10 ) {
    println( i )
    i += 1
  }
  // NEVER WRITE THIS AGAIN!
  // Everything in Scala is an expression!
  
  val aWeirdValue = ( aVariable = 3 ) // Unit === void
  println( aWeirdValue )
  
  
  // Side effects: println(), while loops, variable reassignments.
  
  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    
    if ( z > 2 ) "hello" else "goodbye"
  }
  
}
