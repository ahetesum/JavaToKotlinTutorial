package sixth_day

/**
 * Created by A.Biswas on 10/14/2017.
 */
fun main(args: Array<String>)
{
    var num1: Int=2;
    var num2: Int=3;

    when(num1)
    {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Wrong Input")
    }

    var str1 = when(num2)
    {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Wrong Input"
    }

    print("The returned Value is-> $str1")
}