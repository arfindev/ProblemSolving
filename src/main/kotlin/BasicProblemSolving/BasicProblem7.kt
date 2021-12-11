package BasicProblemSolving

fun main() {
    //Write a Kotlin Program to Calculate the Sum of Natural Numbers

    val num = 100
    var sum = 0

    for (i in 0..num){
        sum+= i
    }
    println("the calculation of the natural number is $sum")
}