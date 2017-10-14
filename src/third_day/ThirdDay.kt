package third_day

/**
 * Created by A.Biswas on 10/14/2017.
 */
fun main(args: Array<String>)
{
    var num1= 4
    var num2 = 7

    var result: Int =0;

    if(num1>num2)
    {
        result=num2
    }
    else
    {
        result=num1
    }

    println("The result is-> $result")


    result= if (num1>num2)
              num1
    else if (num2>num1)
        num2
    else
        0

    println("The smarter way result is-> $result")
}