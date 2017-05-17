package com.mazicss.basic

case class User (name : String, age : Int, salary : Double, active : Boolean)
  




object CaseClass extends App {
  
  def getActiveUser(users : Seq[User]) = users.filter(_.active).sortBy(_.name)
  
  val user1 = getActiveUser(Seq(User("Sarita" , 10, 10.10, true), 
                  User("Alen",30,30.444,false), 
                  User("Ami",30,30.444,true),
                  User("Amit", 20, 30.33,true)))
                  
  for(us <- user1) 
    println("Name is "+us.name + " Age is "+us.age)                
  
 
}