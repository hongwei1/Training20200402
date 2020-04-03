//For comprehension
for {
  i <- 1 to 3
  j <- 1 to 3
}print((10 * i + j) + " ")

for {
  i <- 1 to 3 
  j <- 1 to 3 if i != j
} print((10 * i + j) + " ")

////yield: constructs a Lists2 of values,
val lists = List(1, 2, 3)
val lists2 = for {
  item <- lists
  item2 = item *2
} yield item2

////Higher-Order Functions
//1 “first-class citizen,” just like a number.
def mul2(m: Int): Int = m * 2
val num = 3.14 
val fun = mul2(_)
fun(10)

//The map method accepts a function, applies it to all values in the list, 
// and returns an list with the function values.
val lists28 = List(1, 2, 3)
val lists29 = lists28.map(fun)
(1 to 9).map(2 * _)
//concatenate
(1 to 9).map("*" * _).foreach(println _) 
val a33 = (1 to 9).filter(_ % 2 == 0).map( _ *2) //get even numbers and Multiply 2..


////Case Classes
//Case classes are like regular classes with a few key differences 
case class Message(sender: String, recipient: String, body: String)
//1st: create a case class with parameters, the parameters are public vals not need new
val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

println(message1.sender)  // prints guillaume@quebec.ca
//message1.sender = "travis@washington.us"  // this line does not compile

//2rd: compared by structure and not by reference:
val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val messagesAreTheSame = message2 == message3  // true


//3rd: Copying
val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")



//Option field
Option("Hongwei")
None
Some("Hongwei")
val a61: Option[String] = Some("Hongwei")
val a62: Option[String] = None
def myDive(a:Int, b:Int) = a / b
val a64 = myDive(1,0)

def myDive2(a:Int, b:Int):Option[Int] = Some(a / b)
val a67 = myDive2(1,0)











