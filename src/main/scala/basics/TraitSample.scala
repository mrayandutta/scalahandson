package basics

/**
  * Created by AY312917 on 7/24/2017.
  */
class TraitSample
{
  trait Car
  {
    val brand: String
  }

  trait Shiny
  {
    val shineRefraction: Int
  }

  /*
  class BMW extends Car
  {
    val brand = "BMW"
  }
  */

  class BMW extends Car with Shiny
  {
    val brand = "BMW"
    val shineRefraction = 12
  }

}
