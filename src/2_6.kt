import java.math.BigDecimal

/*

2-6 If you’ve learned about binary numbers and how to convert from decimal
to binary and the reverse, try writing programs to do those conversions with
unlimited length numbers (but you can assume the numbers are small
enough to be stored in a standard C++ int).


I solve this exercise with two way that i learn from youtube video at blow link:
https://www.youtube.com/watch?v=rsxT4FfRBaM

way one : Divide the number by 2

way two : use Rang Table

*/

fun main() {

    println("Please enter a number you want to convert binary")

    val decimal = readLine()!!.toInt()
    val resultOne = wayOne(decimal)
    val resultTwo = wayTwo(decimal)

    println("Way One")
    println(resultOne)

    println("Way Two")
    resultTwo.forEach {
        print(it)
    }



}


fun wayOne(decimal: Int):String
{
    var result = decimal
    var statemant: Int
    var finaly = ""
    do
    {
        statemant = result%2
        finaly = "$statemant$finaly"
        result /= 2

    }while(result>0)

    return finaly
}




fun wayTwo(decimal: Int): ArrayList<Int>
{
    val rangTable = arrayListOf(1)
    var theEnd = 1

    while ((theEnd*2)<decimal)
    {
        theEnd = rangTable[rangTable.lastIndex]*2
        rangTable.add(theEnd)
    }

    val bainaryCode = arrayListOf(0)
    theEnd = decimal
    for (x in rangTable.lastIndex downTo 0)
    {
        if(rangTable[x]<=theEnd)
        {
         bainaryCode.add(1)
            theEnd -= rangTable[x]
        }else{
            bainaryCode.add(0)
        }
    }



    return bainaryCode
}