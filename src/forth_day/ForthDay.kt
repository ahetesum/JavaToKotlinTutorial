package forth_day

/**
 * Created by A.Biswas on 10/14/2017.
 */
 fun main(args: Array<String>)
{
    var str1: String= "Alien"
    var str2: String = "Predator"
    var str3: String = "alien"

    if (str1 == str2)
        println("The strings are Same")
    else
        println("The strings are not Same")

    if(str1.equals(str3,true))
        println("The strings are Same")
    else
        println("The strings are not Same")
}