package basics

object FunctionsWorksheet
{
	 /*
	 Partial application,You can partially apply a function with an underscore,
	 which gives you another function.
	  */
 	def addTwoNumbers(n1: Int,n2: Int)  =(n1+n2)

 	val add10More = addTwoNumbers(10, _:Int)
 	add10More(100)
 	
 	//Curried functions
 	def multiply(m: Int)(n: Int): Int = m * n
 	//Normal call
 	val m = multiply(10)(5)
 	//You can fill in the first parameter and partially apply the second.
 	val timesTwo = multiply(2) _
 	timesTwo(100)
 	
 	
 	//You can take any function of multiple arguments and curry it. Let’s try with our earlier adder

  val curriedAdd = (addTwoNumbers _).curried

	val addTwo = curriedAdd(50)
	addTwo(5)
	
	//Variable length arguments
	
	def capitalizeAll(args: String*) =
	{
	  args.map
	  { arg =>
	    arg.capitalize
	  }
	}

 capitalizeAll("abcd", "xyz")
  
}