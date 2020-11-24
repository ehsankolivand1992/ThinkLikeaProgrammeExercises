

/*
2-2. Or how about:

   **
  ****
 ******
********
********
 ******
  ****
   **
*/



fun main() {
    var space = "   "
    for (x in 3 downTo 0)
    {
        space = space.substring(0,x)
        print("\n$space")
        for (y in 7-x downTo x)
        {
            print("*")
        }
    }
    print("\n")
    space=""
    for (x in 0..3)
    {
        for (y in x..7-x)
            print("*")

        space+=" "
        print("\n$space")
    }
}