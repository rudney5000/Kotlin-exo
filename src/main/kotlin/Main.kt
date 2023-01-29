import kotlin.random.Random


fun main() {
    val min = 1
    var max = 10

    println("""
        !!!!!! Welcome to the winners game !!!!!!
        Choose the game level
        EASY        1..10    -> press E
        MEDIUM      1..100   -> press M
        HARD        1..1000  -> press H
    """.trimIndent())

    val level = readln()
    val generatedNumber = Random.nextInt(min, max)

            if (level == "E") {
                println("You choose the level EASY")
                max = 10
                println("Guess the generated number which belong to the interval of $min to $max")
            } else if (level == "M") {
                println("You choose the level MEDIUM")
                max = 100
                println("Guess the generated number which belong to the interval of $min to $max")
            } else if (level == "H") {
                println("You choose the level HARD")
                max = 1000
                println("Guess the generated number which belong to the interval of $min to $max")
            }

        var providedNumber = 0
        var counter = 0

    println("The provided number doesn't to the interval of $min to $max")
    while (counter <= 5) {
        counter++
        providedNumber = readln().toInt()
        if (providedNumber  == generatedNumber) {
            println("Ouraaaaaaaaaaa !!!! You won!!!!!!!! $counter time")
            break
        }
        if (providedNumber > generatedNumber) {
            println("The provided number is greater than the generated one")
        } else if (providedNumber < generatedNumber) {
            println("The provided number is less than the generated one")
        }
    }
}
