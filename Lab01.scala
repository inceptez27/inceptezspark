object Lab01
{
   def main(args:Array[String])=
   {
       println("Scala calcualtor program")
       val sum = add(10,20)
       println("sum of a and b is " + sum)
   }
   
   def add(a:Int,b:Int) = a + b

   def sub(a:Int,b:Int) = a - b

   def square(a:Int) = a * a

   def mul(a:Int,b:Int) = a * b



}
