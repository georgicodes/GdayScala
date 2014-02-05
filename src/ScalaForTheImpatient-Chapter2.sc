// 1
def signum(x: Int):Int = {
  if (x > 1)  1
    else if (x == 0) 0 else -1
}
signum(-4)

// 2
// Type = Unit, value = () 'no useful value'

// 5
def countdown(n:Int) = {
  for (i <- n to 0 by -1) println(i)
}

countdown(5)







def unicodify(str:String):Int = {
  var sum:Int = 1
  for (i <- 0 until str.length) {
    sum = sum * str.charAt(i).toInt
    println(i + " sum" + sum)
  }
  sum
}
unicodify("Hello")







def sum(args: Int*) : Int = {
  if (args.length == 0)
    0 else
    args.head + sum(args.tail : _*)
}
sum(1,2)


// 90
def product(str: String):Int =  {
  if (str.length == 0)
    1 else {
    println(str.charAt(0) + " " + str.charAt(0).toInt)
    str.charAt(0).toInt * product(str.drop(1))
  }
}
product("Hello")




// 9 0
def produ0ct2(str: String):Int = {
  if (str.length == 0)
    1 else {
    println(str.head)
    str.head * product2(str.tail)
  }
}
product2("")


// 9
def productAns(s: String) = {
  var prod = 1
  s.foreach((c: Char) => prod *= c)
  prod
}
productAns("Hello")



// Denises
def calculateProduct(input: String, product: Int = 1) : Int = {
  if (input.length == 0) product
  else input.head * calculateProduct(input.tail, product)
}
def recursiveProduct(input: String) : Int = {
  if (input.length == 0) 0
  else calculateProduct(input)
}
recursiveProduct("Hello")











