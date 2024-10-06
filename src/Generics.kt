// Generics are not "reified" by default
// They define complete time

fun main(args: Array<String>) {
    printValueGenerified(37)
    printValueGenerified(37.5)
    printValueGenerified(" string")
    //val animals:
}

// Generic Function
fun <T>printValueGenerified(value: T){
    println("Description: $value")
}


// Generic Class
class Generics<T>(private var value: T) {
    fun setValue(t:T) {
        value = t
    }
    fun getValue() = value
    fun printValue(){
        println("This is my value: $value")
    }
}
