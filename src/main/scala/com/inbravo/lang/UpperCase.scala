package com.inbravo.lang

object UpperCase extends App {
  
  val name : String = "aritainghal"
  
 var isUpper =  name.exists(_.isUpper)
 
 var result = if(isUpper.equals(true)) 1 else 0
  println("Contains Upper ",isUpper , "and result is ",result)
  
}