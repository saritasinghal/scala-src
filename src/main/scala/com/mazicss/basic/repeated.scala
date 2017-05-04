package com.mazicss.basic

object repeated {
  
  def neg(args : Int*)
  {
    if(args.exists(_ < 0)) 
    println("yes") 
    
    for(arg <- args)
    if (arg <= 0)
      println("negative val "+arg)
      
      
  }
  
  def testcurriedSum(num1 : Int)(num2 : Int)  
  {
    println("Sum of two number is : "+ num1.+(num2))
  }
  
  def main(args : Array[String])
  {
    neg(10,10,20,-40)
    
    testcurriedSum(20)(30)
  
  }
  
}