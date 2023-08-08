package unit03
fun main() {
    // 1. The program should prompt the user to input a number within the inclusive range of 1 through 10.
    println("Enter a number that is within 1 through 10:")
    // readLine - Reads a line of input from the standard input stream
    // toIntOrNull - Parses string as Int number or null if the string is not a valid number
    val userInput = readLine()?.toIntOrNull()

    if (userInput != null) {
        if (userInput in 1..10) {
            // Convert the number to Roman numeral using if-else statements
            val romanNumeral = when (userInput) {
                1 -> "I"
                2 -> "II"
                3 -> "III"
                4 -> "IV"
                5 -> "V"
                6 -> "VI"
                7 -> "VII"
                8 -> "VIII"
                9 -> "IX"
                else -> "X"
            }

            // Display the Roman numeral equivalent
            println("The Roman numeral equivalent of $userInput is $romanNumeral")
        } else {
            // Display an error message for numbers outside the range
            println("Error: Please enter a number between 1 and 10.")
        }
    } else {
        // Display an error message for invalid input
        println("Error: Invalid input. Please enter a valid number.")
    }
}

}