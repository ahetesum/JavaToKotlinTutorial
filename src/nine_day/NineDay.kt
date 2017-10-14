package nine_day

/**
 * Created by A.Biswas on 10/14/2017.
 */
fun main(args: Array<String>)
{
   var resultAdd= add(5,7)

    println("The addition result is-> $resultAdd")

    var resultMul= mul(5,6)

    println("The Multiply result is-> $resultMul")

    var resultDelete= delete(25,7)

    println("The Delete result is-> $resultDelete")

    var resultCompare= compare(77,69)

    println("The Compare result is-> $resultCompare")
}

fun add(firstNum: Int, secondNum: Int): Int
{
    return firstNum+secondNum;
}

fun mul(firstNum: Int, secondNum: Int): Int = firstNum * secondNum

fun delete(firstNum: Int, secondNum: Int): Int = firstNum - secondNum

fun compare(firstNum: Int, secondNum: Int): Int = if(firstNum>secondNum) firstNum else secondNum
