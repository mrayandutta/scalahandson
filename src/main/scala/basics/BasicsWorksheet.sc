//Expressions
  10+40
//Values
val two = 1 + 2
//Variables
var name = "Java"
name = "Scala"

//Functions
//Define a function to add one
def addOne(m: Int): Int = m + 1
//Call the function
val three = addOne(2)

//Create one Anonymous Functions and store it into a val
val function1 = (x: Int) => x + 1
//Invoke the function
function1(100)

// Substituting in variables:
println(s"Substituting variables,two:$two and name:$name")

// For loops
for (x <- 1 to 2)
{
  println(x)
}

var x = 1
while (x <= 5) {
  print(x)
  x =x+ 1;
}
