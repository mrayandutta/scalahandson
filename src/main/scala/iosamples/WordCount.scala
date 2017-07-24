package iosamples

import java.io.{FileNotFoundException, IOException, InputStream}

import scala.io.Source

/**
  * Created by AY312917 on 7/24/2017.
  * http://scalacookbook.com/
  */
object WordCount {
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
        val words = line.split("//S").map(word=>(word,1)).reduce(
      }
    }
    catch
      {
      case e: FileNotFoundException => println("Couldn't find that file.")
      case e: IOException => println("Got an IOException!")
      }
  }
}
