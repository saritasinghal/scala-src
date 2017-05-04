package com.mazicss.basic

abstract class abstractTest {

def contents: Array[String]
def width: Int =
if (height == 0) 0 else contents(0).length
def height: Int = contents.length

def above(that: abstractTest): abstractTest = 
new Class2(this.contents ++ that.contents)


def beside(that: abstractTest): abstractTest =
new Class2(
for (
(line1, line2) <- this.contents zip that.contents
) yield line1 + line2
)

override def toString = contents mkString "\n"
}

class Class2(override val contents : Array[String] ) extends abstractTest
{
}



