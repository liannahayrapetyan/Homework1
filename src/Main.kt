// Homework 1

import factory.ShapeFactory

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


// Homework 2
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
/*
(fun main() {
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