




//
//2-3. Here’s an especially tricky one:
/*
*
 #            #
  ##        ##
   ###    ###
    ########
    ########
   ###    ###
  ##        ##
 #            #
*
* */

fun main() {

    var laftShape = ""
    var midShape = ""

    for (x in 0..3)
    {
        laftShape+=" "

        print("\n$laftShape")
        for (y in 0..x)
        {
            print("#")
        }

        for (y in (x*4)..11)
        {
            midShape+=" "
        }
        print(midShape)
        midShape=""
        for (y in 0..x)
        {
            print("#")
        }
    }
    print("\n$laftShape")
    for (x in 3 downTo 0)
    {

        laftShape = laftShape.substring(0,x)
        for (y in 0..x)
        {
            print("#")
        }

        for (y in (x*4)..11)
        {
            midShape+=" "
        }
        print(midShape)
        midShape=""
        for (y in 0..x)
        {
            print("#")
        }



        print("\n$laftShape")
    }
}