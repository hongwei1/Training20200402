//println("Hello world!")
//
//1 Variables
val immutableVariable = "blue"
var mutableVariable = "red"
//immutableVariable= ""
mutableVariable = ""
//
//
//pattern Matching
//immutableVariable match {
//  case "blue" => print("orange")
//  case "yellow" => print("purple")
//  case "red" => print("green")
//  case _ => print("not a primary color")
//}
//
//var obj = null
//obj match {
//  case s: String => Integer.parseInt(s) 
//  case _: BigInt => Int.MaxValue 
//  case _ => 0 
//}

//Functions and Methods
def mul2(m: Int): Int = m * 2

//
////Classes
class Person{
  var name: String = "temp"
  var gender: String = "temp"
  var age: Int = 0

  def walking = println(s"$name is walking")

  def talking = println(s"$name is talking")

}
// Creating an object of the Person class
val firstPerson = new Person
firstPerson.walking
firstPerson.talking