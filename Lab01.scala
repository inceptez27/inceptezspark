object Lab01
{
   def main(args:Array[String])=
   {
       println("Scala calcualtor program")

       val diff = sub(50,100)
       println("Difference between a and b is " + diff)
   }
   
   def add(a:Int,b:Int) = a + b

   def sub(a:Int,b:Int) = a - b

   def square(a:Int) = a * a

   def mul(a:Int,b:Int) = a * b



}
