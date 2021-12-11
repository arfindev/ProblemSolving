package BasicProblemSolving

fun main() {
    //Write a Kotlin Program to Find Factorial of a Number

    val num  = 10
    var factorial = 1L
    for (i in 1..num){
        factorial *= i.toLong()
    }
    println("the factorial number of $num  = $factorial")

}