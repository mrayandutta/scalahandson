package basics

object FunctionsVsMethods
{
	class SampleClass
	{
        var counter = 0
        def methodForIncrement = { counter += 1 }
        val functionForIncrement = { () => counter += 1 }
  }
  
  val sampleClass = new  SampleClass


	sampleClass.functionForIncrement
	sampleClass.methodForIncrement
}