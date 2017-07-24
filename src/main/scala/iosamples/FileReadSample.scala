package iosamples

import scala.io.Source
import java.io.{FileNotFoundException, IOException}
import java.io.InputStream
/**
  * Created by AY312917 on 7/24/2017.
  * http://scalacookbook.com/
  */
object FileReadSample
{
  def main(args: Array[String]): Unit =
  {
    val filename = "/sample.txt"
    try
    {
      val stream : InputStream = getClass.getResourceAsStream(filename)
      val lines = Source.fromInputStream( stream ).getLines
      //val lines = Source.fromFile(filename).getLines

      for (line <- lines)
      {
        println(line)
      }
    }
    catch
      {
      case e: FileNotFoundException => println("Couldn't find that file.")
      case e: IOException => println("Got an IOException!")
      }
  }
}
