package com.mazicss.basic

object testCase extends App{
  
  println("Please enter Your age")
  
  var age : Int = scala.io.StdIn.readInt;
  
  age match{
    case 10 => print("you are a Kid")
    case 20 => print("You are Teen")
    case 30 => print("You ae younge")
    case 40 => print("Intersting")
  }
  
}