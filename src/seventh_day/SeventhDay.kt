package seventh_day

/**
 * Created by A.Biswas on 10/14/2017.
 */
fun main(args: Array<String>)
{
    var nums = 0..25

    var untilNums= 0 until 25

    var revNums= 25 downTo 0

    // Normal Range Loop
    for (num in nums)
    {
        println("The normal number-> $num")
    }

    // Normal Until Loop
    for (num in untilNums)
    {
        println("The until number-> $num")
    }

    //Range Loop With Step
    for (num in nums step 5)
    {
        println("The 5 Step number-> $num")
    }

    //Range Loop with reverse order
    for (num in revNums step 5)
    {
        println("The 5 Step reverse number-> $num")
    }
}