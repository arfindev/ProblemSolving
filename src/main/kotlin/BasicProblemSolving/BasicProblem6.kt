package BasicProblemSolving

fun main() {
    var firstNum = 43
    var secondNum = 30

    println("--Before Swapping the numbers-- \n $firstNum \n $secondNum")

    val tempNum = firstNum

    firstNum = secondNum
    secondNum  = tempNum
    println("--After Swapping the numbers-- \n $firstNum \n $secondNum")


}