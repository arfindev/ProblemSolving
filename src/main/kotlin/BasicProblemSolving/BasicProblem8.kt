package BasicProblemSolving

fun main() {
    val sentence = "hello, lets find the frequency of a letter"
    val char: Char = 'o'
    var frequency = 0
    for (i in 0..sentence.length - 1) {
        if (char == sentence[i])
            frequency++
    }
    println("The frequency of o is $frequency")
}