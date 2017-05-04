package com.mazicss.basic

import scala.io.Source 
 
object Looping extends App {
  
  def greet 
  {
    println("Hi")
  }
  
  greet
  
  val filesHere = (new java.io.File("E:\\Scala\\TestFolder")).listFiles
 def fileName =  for {
file <- filesHere
if file.getName.endsWith(".scala")
} yield file

 
	println(fileName)
  
  def readFile()
  {
    val line = Source.fromFile("E:\\Scala\\scala-txt.csv").getLines
    
    val i = 0
    while(line.hasNext)
    {
      
    }
  }
  
  
  readFile
}