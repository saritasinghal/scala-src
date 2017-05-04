package com.inbravo.lang

object LoopWithConditions {
  
 def main(args: Array[String]): Unit =
 {
     var name : String = "Sarita Singhal"
  
  var i = 0 
  
  while(i<name.length())
  {
    if(i!=0)
       print(" ")
    print(name(i))
    i += 1 // see no space between +=
  }
   
     println()
     //Using For each
     name.foreach((arg) => println(arg))
   
 }

  
  
}