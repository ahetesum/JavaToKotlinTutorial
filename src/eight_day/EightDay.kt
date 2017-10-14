package eight_day

/**
 * Created by A.Biswas on 10/14/2017.
 */
fun main(args : Array<String>)
{
    var nums= listOf(1,2, 3, 4, 5)

    for (num in nums)
    {
        println("The numbers are-> $num")
    }

    for ((i,num) in nums.withIndex())
    {
        println("The $i number is-> $num")
    }
}