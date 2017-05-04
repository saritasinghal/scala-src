package com.mazicss.basic


  class Rationals(n: Int, d: Int) { // This won’t compile
    require(d != 0)
    val numer : Int = n
    val denom : Int = d
    
    def this(n: Int) = this(n, 1) // auxiliary constructor
     override def toString = numer +"/"+ denom
        def +(that: Rationals): Rationals =
        new Rationals(
       numer * that.denom + that.numer * denom,
        denom * that.denom
        
        )

    }
    
    object Rational {
   def main(args: Array[String]) {
      var rat = new Rationals(7,10)
      var rat2 = new Rationals(1)
      print(rat + rat2)
   }
}


