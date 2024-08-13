package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  
  // vals are immutable
  
  // compiles can infer types
  val aString: Boolean = false
  val anotherString = "goodbye"
  
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4123
  val aLong: Long = 4567898765L
  val aFloat: Float = 2.074f
  val aDouble: Double = 3.14
  
  // variables
  var aVariable: Int = 4
  aVariable = 5 // side effects
}
