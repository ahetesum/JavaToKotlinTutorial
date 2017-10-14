package eight_day

import java.util.*

/**
 * Created by A.Biswas on 10/14/2017.
 */
fun main(args : Array<String>)
{
    var peoples= TreeMap<String,Int>()

    peoples["Ahetesum"]=32
    peoples["Sourav"]=29
    peoples["Rahul"]=27
    peoples["Sandeep"]=31

    for ((name,age) in peoples)
    {
        println("Age of $name is-> $age")
    }


}