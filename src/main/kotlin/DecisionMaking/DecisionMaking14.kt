package DecisionMaking

fun main() {
    //Write a Kotlin Program to Count Number of Digits in an Integer
    val num = 123456
    var length = 0
    var n = num
    while (n != 0) {
        n /= 10
        length++
    }
    println(length)
}