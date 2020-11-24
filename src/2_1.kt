





/*
Using the same rule as the shapes programs from earlier in the chapter (only
two output statements—one that outputs the hash mark and one that outputs
an end-of-line), write a program that produces the following shape:

********
 ******
  ****
   **

*/


fun main() {


    var space=""
   for (x in 0..3)
   {
       for (y in x..7-x)
       print("*")

       space+=" "
       print("\n$space")
   }

}