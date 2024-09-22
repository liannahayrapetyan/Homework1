import java.nio.channels.Selector
import kotlin.math.min

// Homework 1

/*import factory.ShapeFactory

fun main() {
    val factory = ShapeFactory()
    val circle = factory.createShape("circle", 5.5)
    val rectangle = factory.createShape("rectangle", 4.6, 3.1)
    val square = factory.createShape("square", 2.5)

    println("Circle area: ${circle.calculateArea()}")
    println("Rectangle area: ${rectangle.calculateArea()}")
    println("Square area: ${square.calculateArea()}")
}
// https://www.w3resource.com/kotlin-exercises/class/kotlin-class-exercise-14.php#google_vignette

*/


// Homework 2

// Higher order function
/*
fun calculate(a: Double, b: Double, operation:(Double, Double) -> Double): Double {
    return operation(a, b)
}

fun main(args: Array<String>) {

    print("Enter the first number: ")    // first number
    val num1 = readLine()?.toDoubleOrNull()

    print("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull() // second number

    if (num1 == null || num2 == null) {
        println("Enter valid numbers.")   // if numbers are valid
        return
    }


    println("Sum is " + calculate(num1, num2) { a, b -> a + b })
    println("Difference is " + calculate(num1, num2) { a, b -> a-b })
    println("Product " + calculate(num1, num2) { a, b -> a*b })



}

*/


// simple version
/*
fun calculate(a: Double, b: Double, operation: String): Double {

    return when (operation) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        else -> throw IllegalArgumentException("Unsupported operation: $operation")
    }
}

fun main() {
    print("Enter the first number: ")    // first number
    val num1 = readLine()?.toDoubleOrNull()

    print("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull() // second number

    if (num1 == null || num2 == null) {
        println("Enter valid numbers.")   // if numbers are valid
        return
    }

    // Calculate for each operation
    val sum = calculate(num1, num2, "+")
    val difference = calculate(num1, num2, "-")
    val product = calculate(num1, num2, "*")

    // Print results
    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
}
*/


// Homework 3
// real work
/*
fun main() {
    // Create two-dimensional array
    val array = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(4, 5, 6, 5),
        arrayOf(4, 8, 9, 2)
    )

    // Sums for diagonals
    var primaryDiagonalSum = 0 // top-left to bottom-right
    var secondaryDiagonalSum = 0 //top-right to bottom-left
    val size = min(array.size, array[0].size)

    // Print

    print("Primary diagonal: ")
    for (i in 0..<size) {
        primaryDiagonalSum += array[i][i]
        print("${array[i][i]} ${if (i < size - 1) " + " else " = "}")
    }
    println(primaryDiagonalSum)

    print("Secondary diagonal: ")
    for (i in 0..<size) {
        secondaryDiagonalSum += array[i][size - 1 - i]
        print("${array[i][size - 1 - i]} ${if (i < size - 1) " + " else " = "}")
    }
    println(secondaryDiagonalSum)
}*/




/*
fun main() {

    val matrix = arrayOf(
        intArrayOf(1, 2, 1, 2),
        intArrayOf(1, 2, 6, 5),
        intArrayOf(4, 4, 4 ),
        intArrayOf(1, 7, 3, 1)
    )
    val primaryDiagonalSum = calculatePrimaryDiagonalSum(matrix, { i, size -> matrix[i][i] }) // calculatePrimaryDiagonalSum(matrix) {i:Int, _: Int -> i
    val secondaryDiagonalSum = calculatePrimaryDiagonalSum(matrix, { i, size -> matrix[i][size - 1 - i] })

    println("Primary diagonal: $primaryDiagonalSum")
    println("Secondary diagonal: $secondaryDiagonalSum")

}

fun calculatePrimaryDiagonalSum(matrix: Array<IntArray>, diaganal: (index: Int, size: Int) -> Int): Int {
//եթե անհամաչափ զանգված է, պետք է գտնել ամենափոքր size ուենցող տողը

    val size = min(matrix.size, matrix.minOf{ it.size })

    var sum = 0

    for (i in 0..<size) {
        sum += diaganal(i, size)
    }
    return sum
}
*/

/*
fun main() {
    // Create two-dimensional array
    val array = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(4, 8, 9)
    )

    // Sums for diagonals
    var primaryDiagonalSum = 0 // top-left to bottom-right
    var secondaryDiagonalSum = 0 //top-right to bottom-left
    val size = array.size

    // Print

    print("Primary diagonal: ")
    for (i in 0..<size) {
        primaryDiagonalSum += array[i][i]
        print("${array[i][i]} ${if (i < size - 1) " + " else " = "}")
    }
    println(primaryDiagonalSum)

    print("Secondary diagonal: ")
    for (i in 0 until size) {
        secondaryDiagonalSum += array[i][size - 1 - i]
        print("${array[i][size - 1 - i]} ${if (i < size - 1) " + " else " = "}")
    }
    println(secondaryDiagonalSum)
}
*/

// Write a function that receives work day as a parameter, and it prints whether the day is workday
// enum
import WeekDay. *
enum class WeekDay {
    Monday,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

/*  Two important benefits
     1. Predefine


 */
/*fun checkWorkDay (dayOfWeek: String) = when (dayOfWeek){
    Monday, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY-> true
       SATURDAY, SUNDAY -> false
}

fun main(){
val workDay = l
}*/



