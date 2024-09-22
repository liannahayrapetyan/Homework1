data class Person(val name: String, val age: Int){
    fun greet() = "Hi, I'm $name"
}

fun greet(person: Person)="Hi, i'm ${person.greet()}"

fun Person.greetExt() = "Hi, I'm $name" // 'this' is available

/*
1. statement - any execution (e.g. ig/else, for loop, println("hello world")
2. expression - any execution that returns value
*/
fun main(args: Array<String>) {
    val person = Person("Lian", 20)
    println(person.greetExt())
    println(person.greet())
    println(greet(person))
}