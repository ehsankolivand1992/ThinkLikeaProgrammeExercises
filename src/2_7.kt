import kotlin.math.pow


/*

2-7. Have you learned about hexadecimal? Try writing a program that lets the
user specify an input in binary, decimal, or hexadecimal, and output in any
of the three.



*/


val CONST_HEX_NUMBER= arrayListOf("0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F")
fun main() {


    println("Enter a Decimal Number For Convert To Hexadecimal")

   print(calculateHexadecimal(readLine()!!.toInt()))

}




fun calculateHexadecimal(decimal : Int):String
{
    val hexPow = arrayListOf(1)

    var counter = 0

    do{
        counter++
        hexPow.add((16.0.pow(counter)).toInt())
    }while (decimal>hexPow[counter])

    var division = decimal
    var hexDecimal = ""
    var hex: Int





    for (x in hexPow.lastIndex downTo 0)
    {
        if (division>hexPow[x])
        {
            hex =division/hexPow[x]
            division %= hexPow[x]

            hexDecimal="$hexDecimal${CONST_HEX_NUMBER[hex]} "
            //println(CONST_HEX_NUMBER[hex])
        }
    }

    return hexDecimal
}


