def squareIt(x: Int) : Int =
{
  x * x
}

// Functions can take other functions as parameters

def transformInt(x: Int, f: Int => Int) : Int =
{
  f(x)
}

transformInt(2,squareIt)