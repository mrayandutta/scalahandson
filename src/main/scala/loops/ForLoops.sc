val numbers = Array("One", "Two", "Three")
for (e <- numbers) println(e)
//Multi Line sample
for (e <- numbers)
{
   val s = e.toUpperCase
   println(s)
}
//Returning values from a for-loop
//For-comprehension
val newArray = for (e <- numbers) yield e.toUpperCase
//Returning values from a for-loop

//For loop counters
for (i <- 0 until numbers.length)
{
  println(s"$i is ${numbers(i)}")
}
//Loop with Zip Index
for ((element, zipindex) <- numbers.zipWithIndex)
{
   println(s" element :$element,zipindex:$zipindex")
}

// Loop over a Map

val map = Map("key1" -> "value1", "key2" -> "value2")
for ((k,v) <- map)
{
  println(s" key: $k ,value: $v")
}