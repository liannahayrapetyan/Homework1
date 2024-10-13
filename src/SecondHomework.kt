



// Homework 1

fun mergeArrays(array1: List<Int>, array2: List<Int>): List<Int> {
    val resultArray = mutableListOf<Int>()
    var i = 0
    var j = 0

    while (i < array1.size && j < array2.size) {
        if (array1[i] <= array2[j]) {
            resultArray.add(array1[i])
            i++
        } else {
            resultArray.add(array2[j])
            j++
        }
    }

    // Add the remaining elements of array1
    while (i < array1.size) {
        resultArray.add(array1[i])
        i++
    }

    // Add the remaining elements of array2
    while (j < array2.size) {
        resultArray.add(array2[j])
        j++
    }

    return resultArray
}

fun main() {
    val array1 = listOf(1, 2, 3, 4, 5)
    val array2 = listOf(1, 3, 4)
    val resultArray = mergeArrays(array1, array2)
    println(resultArray)  // Output: [1, 1, 2, 3, 3, 4, 4, 5]
}





/*
// Homework2
fun maxDistanceBetweenIdenticalChars(s: String): Int {
    val charIndices = mutableMapOf<Char, Int>()
    var maxDistance = -1

    for (i in s.indices) {
        val c = s[i]
        if (charIndices.containsKey(c)) {
            // Calculate the distance between current index and first occurrence of the character
            val firstOccurrence = charIndices[c]!!
            val distance = i - firstOccurrence - 1
            maxDistance = maxOf(maxDistance, distance)
        } else {
            // Store the first occurrence of the character
            charIndices[c] = i
        }
    }

    return maxDistance
}

fun main() {
    // Test cases
    val s1 = "abbbabac"
    val s2 = "abqcdefbghqi"
    val s3 = "abcdef"

    println(maxDistanceBetweenIdenticalChars(s1))  // Output: 5
    println(maxDistanceBetweenIdenticalChars(s2))  // Output: 7
    println(maxDistanceBetweenIdenticalChars(s3))  // Output: -1
}

*/