object Lab01
{
   def main(args:Array[String])=
   {
       println("Scala calcualtor program")

       val diff = sub(50,100)
       println("Difference between a and b is " + diff)

       val sum = add(10,20)
       println("sum of a and b is " + sum)

       val prod = mul(10,20)
       println("product of a and b is " + prod)	

   }
   
   def add(a:Int,b:Int) = a + b

   def sub(a:Int,b:Int) = a - b

   def square(a:Int) = a * a

   def mul(a:Int,b:Int) = a * b



}
