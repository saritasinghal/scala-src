package com.mazicss.basic

class class1 {
  
  val val1 = 2
  
}

class class2 (override val val1 : Int ,
                 val val2 : Int ) extends class1
                 
class class3 (val val2 : Int ) extends class1
                 

object overide
{
  def main(args : Array[String])
  {
    val ele = new class2(10,20)
     val ele1 = new class3(10)
    
    println(ele.val1 +" and "+ ele.val2) 
    print(ele1.val1 +" and "+ ele1.val2) 
  }
}
                 
                 