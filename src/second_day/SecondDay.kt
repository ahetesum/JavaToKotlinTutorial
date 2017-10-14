package second_day

import first_day.Predator

/**
 * Created by A.Biswas on 10/14/2017.
 */

fun main(args: Array<String>)
{
    var num1= 4
    var num2 = 7

    var result= num1 + num2

    println("The sum of $num1 and $num2 is -> $result")

    var predator=Predator();
    predator.name="Jambrataz"

    println("The name of oldest Predator is- > $predator.name")
    println("The name of oldest Predator is- > ${predator.name}")
}
