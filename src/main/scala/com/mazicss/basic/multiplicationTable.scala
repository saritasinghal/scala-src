package com.mazicss.basic

object multiplicationTable {
  
  
  def printNumber(mul : Int)
  {
    for (i <- 1 to 10)
    { 
      print(mul*i + "\t")
    }
      
      println
  }
  
  def printList()
  {
    var number = List(1,2,3,4,5)
    println ("Printing table for Even")
   var evenNum = number.filter(i => i%2 == 0)
      for(i <- 1 to 10)
      {  for(num <- evenNum)
        print (num*i +"\t")  
         println
     }  
    
    println
    println("Printing table for odd")
    
    val oddNum = number.filter(_%2 != 0)
     for(i <- 1 to 10)
      {
       for(num <- oddNum)
        print (num*i +"\t")  
         println
     } 
  }
  
  def main(args : Array[String])
  {
    println("Printting Multiplcation Table")
    for(i<- 1 to 10)
    {
      printNumber(i)
    }
    
    println("\n"+"Printlng List")
    printList
    
  }
  
}