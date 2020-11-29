/*

2-5
If you like the Luhn formula problem, try writing a program for a different
check-digit system, like the 13-digit ISBN system. The program could take an
identification number and verify it or take a number without its check digit
and generate the check digit.

ISBN

Prefix element – currently this can only be either 978 or 979. It is always 3 digits in length

Registration group element – this identifies the particular country, geographical region, or language area participating in the
ISBN system. This element may be between 1 and 5 digits in length

Registrant element - this identifies the particular publisher or imprint. This may be up to 7 digits in length

Publication element – this identifies the particular edition and format of a specific title. This may be up to 6 digits in length

Check digit – this is always the final single digit that mathematically validates the rest of the number.
  It is calculated using a Modulus 10 system with alternate weights of 1 and 3.

from :
https://www.isbn-international.org/content/what-isbn#:~:text=An%20ISBN%20is%20an%20International,digit%20to%20validate%20the%20number.



two isbn to test my program

correct
9781861978769

not correct
9781861978767
*/



val ISBN_LENGHT = 13
val ISBN_MULTIPLIER =10
fun main() {
    println("please enter isbn number (13-digit)")

    val strIsbn = readLine().toString()

    if (validate(strIsbn))
    {
        println("ISBN is correct")
    }else{
        print("ISBN is not correct")
    }

}

fun validate(sISBN: String):Boolean
{

    if (sISBN.length!=ISBN_LENGHT)
    {
        return false
    }


    var sum = 0
    sISBN.forEachIndexed { index, c ->
        if (index%2 ==0)
        {
            sum+= c.toInt()
        }else
        {
            sum+= (c.toInt()*3)
        }
    }

    return (sum%ISBN_MULTIPLIER==0)
}

