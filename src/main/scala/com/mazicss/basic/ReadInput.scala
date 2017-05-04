package com.mazicss.basic

import scala.io.Source
import scala.collection.mutable.Map

object ReadInput1 extends App {  
 
    var lines = Source.fromFile("E:\\Scala\\scala-txt.csv").getLines().toList 
    
    val cache = Map[String, Int]()
  
		val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
		
		var line = Source.fromFile("E:\\Scala\\scala-txt.csv").getLines()
		
		for(elem <- line)
		{
		  var a = elem.split(",")
		  cache += (a(0) -> a(1).toInt)
		}
    
    for(ele <- cache)
    println("Elem 1 : " +ele._1 + "Elem 2 : " + ele._2)
   
      
   
  
}