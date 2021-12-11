package BasicProblemSolving

fun main() {
    //Write a Kotlin Program to Check Whether a Character is Alphabet or Not

    val alphabet = 'C'

    when{
        (alphabet in 'a'..'z' || alphabet in  'A'..'Z')-> println("$alphabet is an alplhabet")
        else -> println("$alphabet is not an alphabet")
    }
}