package com.inbravo.lang

object FunctionsTest extends App {

 
 //with return statement and {
  def min(x : Int, y : Int) : Int = {
    
   return if(x<y) x else y;
  }
  
  //without return and {
  
  def minWithoutReturn(x : Int , y : Int) = if(x<y)x else y 
  
   //without return and {
  
  def minWithRetunType(x : Int , y : Int) : Int= if(x<y)x else y 
  
  //multiple If 
  
  def minWithMultipleStatement(x : Int, y: Int, z: Int)  = 
  
    if (x<y) if(x<z) x else if (z<y) z else if (y<x) y  
    
 
    
   //Multiple Statement { is required and return is also required  
  def minWithMultipleStatementRet(x : Int, y: Int, z: Int) : String = {
      
      //Mutiple If 
 
  var minval =  if(x < y) if (x < z) x else z else if (y < z) y else z
  
 
  if(minval == x) return "x" else if (minval == y) return "y" else return "z"
       
    }    
  
    
  
  var findmin : Int = min(10,20);
  
  println("Minimum of two value is "+ findmin);
  
   var findminwithoutret = minWithoutReturn(20,30);
  
  println("Minimum of two value is "+ findminwithoutret);
  
   var findminwithret = minWithRetunType(30,40);
  
  println("Minimum of two value is "+ findminwithret);
  
    var findminmultiple = minWithMultipleStatement(30,40,50);
  
  println("Minimum of three value is "+ findminmultiple);
  
    var findminret = minWithMultipleStatementRet(60,40,50);
  
  println("Minimum of three value is "+ findminret);
  
}