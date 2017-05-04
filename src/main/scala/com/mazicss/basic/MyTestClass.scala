package com.mazicss.basic

import scala.collection.mutable.ArrayBuffer

object MyTestClass extends App{
  

  var mult = "crazy"*3
  
  println(mult);
  
 // val name = readLine(" Your name: ")
//print("Your age: ")
//val age = readInt()
//printf("Hello, %s! Next year, you will be %d.\n", name, age + 1)

val myArray = new Array[Int](5)
val myArray2 = new ArrayBuffer[Int]
  
  myArray(0) = 10
  myArray(1) = 20
  
 myArray2 +=(10,20)
 myArray2 += (1, 2, 3, 5)
  myArray2 += (1, 2, 3, 5)
  myArray2 ++= myArray

  println("Print using until ")
  for(i<-0 until myArray2.length)
    print(myArray2(i) )
    
     println
    println("Print using elem")
    //you can traverse array using elem as well. 
    for(elem <- myArray2)
    print(elem)
    println
    
  var  myArray3 = new ArrayBuffer[Int]
  println("swaps adjacent elements ")
  for(i<-0 until myArray2.length-1)
  {
    if(i%2 == 0) myArray3 += myArray2(i+1) else  myArray3 += myArray2(i-1)
  }
  
  for (elem <- myArray3)
    print(elem)
    //array intialised by 0 
    
    //average of an Array[Double]
    
    val myDoubleArray =  Array[Double] (10.20,10.30,10.40,10.50)
  println
  println("avarage is "+myDoubleArray.sum/myDoubleArray.length)
  
  //Write a program that reads words from a file. Use a mutable map to count
//how often each word appears. To read the words, simply use a java.util.Scanner:
  
  
  
  //we have to write each element of a Array 
  
  def printArray(args : Array[String]) : Unit = {
    
    args.foreach(println)
    
  }
  
   def printArray2(args : Array[String]) : Unit = {
    
  for(ele <- args)
  {
    println(ele)
  }
  }
  
}